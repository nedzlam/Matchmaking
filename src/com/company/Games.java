package com.company;

public class Games {
    private String igrac1;
    private String igrac2;
    private String igrac3;

    public Games (String igrac1, String igrac2, String igrac3) {
        this.igrac1 = igrac1;
        this.igrac2 = igrac2;
        this.igrac3 = igrac3;
    }
    public String getIgrac1(){
        return igrac1;
    }
    public String getIgrac2(){
        return igrac2;
    }
    public String getIgrac3(){
        return igrac3;
    }
    public void setIgrac1(String igrac1){
        this.igrac1 = igrac1;
    }
    public void setIgrac2(String igrac2){
        this.igrac2 = igrac2;
    }
    public void setIgrac3(String igrac3){
        this.igrac3 = igrac3;
    }

    @Override
    public String toString() {
        return "Games{" +
                "igrac1='" + igrac1 + '\'' +
                ", igrac2='" + igrac2 + '\'' +
                ", igrac3='" + igrac3 + '\'' +
                '}';
    }
}
