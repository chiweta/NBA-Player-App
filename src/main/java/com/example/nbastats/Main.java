package com.example.nbastats;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int page = 0;
        boolean morePagesAvailable = true;
        
        while (morePagesAvailable) {
            try {
                URL url = new URL("https://www.balldontlie.io/api/v1/players?page=" + page);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                int responseCode = conn.getResponseCode();

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    Gson gson = new Gson();
                    PlayerResponse playerResponse = gson.fromJson(response.toString(), PlayerResponse.class);

                    for (Player player : playerResponse.getData()) {
                        System.out.println(player.getFirst_name() + " " + player.getLast_name());
                    }

                    page++;
                    morePagesAvailable = page < playerResponse.getMeta().getTotal_pages();
                } else if (responseCode == 429) {
                    System.out.println("Rate limit reached. Retrying in 60 seconds.");
                    Thread.sleep(60000);
                } else {
                    System.out.println("GET request not worked. Response Code: " + responseCode);
                    morePagesAvailable = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(1000); // Delay between each request
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class PlayerResponse {
        private List<Player> data;
        private Meta meta;

        public List<Player> getData() {
            return data;
        }

        public void setData(List<Player> data) {
            this.data = data;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }
    }

    static class Player {
        private int id;
        private String first_name;
        private String last_name;

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }
    }

    static class Meta {
        private int total_pages;

        public int getTotal_pages() {
            return total_pages;
        }

        public void setTotal_pages(int total_pages) {
            this.total_pages = total_pages;
        }
    }
}
