package com.example.nbastats;

public class Player {
    //Creating instance variables for Specific Player
    private String firstName;
    private String lastName;
    private String team;
    private String Position;
    private double Weight;
    private String height;
    private Statistics stats;

    //Creating a constructor of what should be included for each player
    public void info(String firstName,String lastName,String team,String Position,double Weight,String height,Statistics stats){
        this.firstName=firstName;
        this.lastName=lastName;
        this.team=team;
        this.Position=Position;
        this.Weight=Weight;
        this.height=height;
        this.stats=stats;
    }
    // Here I am creating getters and setters to retrieve the information from the api and now set it to a value that can later be retrieved.
    public String getFirst_name(){
        return firstName;
    }
    public void setFirst_name(String firstName){
        this.firstName=firstName;
    }
    public String getLast_name(){
        return lastName;
    }
    public void setLast_name(String lastName){
        this.lastName=lastName;
    }
    public String getTeam(){
        return team;
    }
    public void setTeam(String team){
        this.team=team;
    }
    public String getPosition(){
        return Position;
    }
    public void setPosition(String Position){
        this.Position=Position;
    }
    public double getWeight(){
        return Weight;
    }
    public void setWeight(double Weight){
        this.Weight=Weight;
    }
    public String getHeight(){
        return height;
    }
    public void setHeight(String height){
        this.height=height;
    }
    public Statistics getStats(){
        return stats;
    }
    public void setStats(Statistics stats){
        this.stats=stats;
    }
   // Creating the grading range for points per game
    public double ppgCalculator(double points){
        if (points <= 29.7){
            return 95.0;
    }
        
        else if(points>=24.1 && points <=29.69){
            return 90.0;
}
        else if(points>=20 && points <=24){
         return 88.0;
        }
        else if(points>=16 && points<=19){
            return 80;
        }else if(points>=10.74 && points<=15.99){
            return 78;
        }
         else if(points>=10 && points<=10.72){
            return 70;
        } else if(points>=8 && points<=9.9){
            return 68;
        } else if(points>=6 && points<=7.9){
            return 60;
        }     
        else{
            return 0.0;
        }
 }
 // Creating the grading range for rebounds per game
 public double rpgCalculator(double Rebounds){
    if (Rebounds <= 11.38){
        return 95.0;
}
    
    else if(Rebounds>=9.96 && Rebounds <=11.37){
        return 90.0;
}
    else if(Rebounds>=6.1 && Rebounds <=9.95){
     return 88.0;
    }
    else if(Rebounds>=5 && Rebounds<=6){
        return 80;
    }else if(Rebounds>=4.5 && Rebounds<=4.99){
        return 78;
    }
     else if(Rebounds>=3.5 && Rebounds<=4.49){
        return 70;
    } else if(Rebounds>=2.5 && Rebounds<=3.49){
        return 68;
    } else if(Rebounds>=1.5 && Rebounds<=2.49){
        return 60;
    }     
    else{
        return 0.0;
    }
    // Creating the grading range for points per game
}public double apgCalculator(double Assists){
    if (Assists <= 8.93){
        return 95.0;
}
    
    else if(Assists>=6.79 && Assists <=8.92){
        return 90.0;
}
    else if(Assists>=6.77 && Assists <=6.78){
     return 88.0;
    }
    else if(Assists>=4.5 && Assists<=6.76){
        return 80;
    }else if(Assists>=3.5 && Assists<=4.49){
        return 78;
    }
     else if(Assists>=2.49 && Assists<=3.49){
        return 70;
    } else if(Assists>=1.7 && Assists<=2.48){
        return 68;
    } else if(Assists>=1.3 && Assists<=1.69){
        return 60;
    }     
    else{
        return 0.0;
    }
    // Creating the grading range for points per game
}public double spgCalculator(double Steals){
    if (Steals <= 1.63){
        return 95.0;
}
    
    else if(Steals>=1.3 && Steals <=1.62){
        return 90.0;
}
    else if(Steals>=1 && Steals <=1.29){
     return 88.0;
    }
    else if(Steals>=.8 && Steals<=.99){
        return 80;
    }else if(Steals>=.69 && Steals<=.79){
        return 78;
    }
     else if(Steals>=.64 && Steals<=.68){
        return 70;
    } else if(Steals>=.6 && Steals<=.63){
        return 68;
    } else if(Steals>=.55 && Steals<=.59){
        return 60;
    }     
    else{
        return 0.0;
    }
    // Creating the grading range for points per game
}public double bpgCalculator(double Blocks){
    if (Blocks <= 2.16){
        return 95.0;
}
    
    else if(Blocks>=1.64 && Blocks <=2.15){
        return 90.0;
}
    else if(Blocks>=1.4 && Blocks <=1.63){
     return 88.0;
    }
    else if(Blocks>=1 && Blocks<=1.39){
        return 80;
    }else if(Blocks>=.51 && Blocks<=.99){
        return 78;
    }
     else if(Blocks>=.4 && Blocks<=.5){
        return 70;
    } else if(Blocks>=.29 && Blocks<=.39){
        return 68;
    } else if(Blocks>=.19 && Blocks<=.28){
        return 60;
    }     
    else{
        return 0.0;
    }
    // Creating the grading range for points per game
}public double fgCalculator(double Fg){
    if (Fg <= 64.3){
        return 95.0;
}
    
    else if(Fg>=58.16 && Fg <=64.29){
        return 90.0;
}
    else if(Fg>=55 && Fg <=58.15){
     return 88.0;
    }
    else if(Fg>=51 && Fg<=54.99){
        return 80;
    }else if(Fg>=48.25 && Fg<=50.99){
        return 78;
    }
     else if(Fg>=45.23 && Fg<=48.24){
        return 70;
    } else if(Fg>=42.21 && Fg<=45.22){
        return 68;
    } else if(Fg>=39.19 && Fg<=42.20){
        return 60;
    }     
    else{
        return 0.0;
    }
}
// Creating the grading range for points per game
public double tpfgCalculator(double TpFg){
    if (TpFg <= 46.26){
        return 95.0;
}
    
    else if(TpFg>=43.25 && TpFg <=46.25){
        return 90.0;
}
    else if(TpFg>=40.24 && TpFg <=43.24){
     return 88.0;
    }
    else if(TpFg>=38.27 && TpFg<=40.23){
        return 80;
    }else if(TpFg>=36.27 && TpFg<=38.26){
        return 78;
    }
     else if(TpFg>=33.26 && TpFg<=36.26){
        return 70;
    } else if(TpFg>=30.25 && TpFg<=33.25){
        return 68;
    } else if(TpFg>=27.24 && TpFg<=30.24){
        return 60;
    }     
    else{
        return 0.0;
    }
    // Creating the grading range for points per game
}public double ftCalculator(double ft){
    if (ft <= 90.77){
        return 95.0;
}
    
    else if(ft>=86.57 && ft <=90.76){
        return 90.0;
}
    else if(ft>=83.82 && ft <=86.56){
     return 88.0;
    }
    else if(ft>=81.05 && ft<=83.81){
        return 80;
    }else if(ft>=78.23 && ft<=81.04){
        return 78;
    }
     else if(ft>=75 && ft<=78.22){
        return 70;
    } else if(ft>=69 && ft<=74.99){
        return 68;
    } else if(ft>=64 && ft<=68.99){
        return 60;
    }     
    else{
        return 0.0;
    }
    // Creating the grading range for points per game
}public double tpgCalculator(double Turnovers){
    if (Turnovers <= .44){
        return 95.0;
}
    
    else if(Turnovers>=.45 && Turnovers <=.6){
        return 90.0;
}
    else if(Turnovers>=.61 && Turnovers <=.76){
     return 88.0;
    }
    else if(Turnovers>=.77 && Turnovers<=.92){
        return 80;
    }else if(Turnovers>=.93 && Turnovers<=1.08){
        return 78;
    }
     else if(Turnovers>=1.09 && Turnovers<=1.24){
        return 70;
    } else if(Turnovers>=1.25 && Turnovers<=2){
        return 68;
    } else if(Turnovers>=2.01 && Turnovers<=2.81){
        return 60;
    }     
    else{
        return 0.0;
    }
}
public double calculateOverallScore(double points, double rebounds, double Assists, double Steals,double Blocks, double Fg, double TpFg, double ft, double Turnovers){
    double weightedppg=4.0;
    double weightedrpg=2.0;
    double weightedapg=2.0;
    double weightedspg=2.0;
    double weightedbpg=2.0;
    double weightedfg=3.0;
    double weighted3p=3.0;
    double weightedft=1.0;
    double Turnovers=0.5;
}
}


