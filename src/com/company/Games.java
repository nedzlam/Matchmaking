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

    @Override
    public String toString() {
        return "Games{" +
                "igrac1='" + igrac1 + '\'' +
                ", igrac2='" + igrac2 + '\'' +
                ", igrac3='" + igrac3 + '\'' +
                '}';
    }
}
