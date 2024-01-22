import axios from 'axios';

// Make an HTTP GET request to the API
axios.get('https://www.balldontlie.io/api/v1/players?page=')
  .then((response) => {
    // Handle the response data
    console.log(response.data);
  })
  .catch((error) => {
    // Handle errors
    console.error(error);
  });
