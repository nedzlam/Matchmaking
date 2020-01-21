package com.company;
import javax.management.monitor.StringMonitor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	int players_limit = 3;
	int brojac = 0;
	List<Games> games = new ArrayList<Games>();
	Scanner scannerString = new Scanner(System.in);
        int kraj = 0;
        System.out.println("Unesite imena igraca:");
        for(;;){
            String a = scannerString.nextLine();
            if(a.equals("")) break;
            String b = scannerString.nextLine();
            if(b.equals("")){
                System.out.println("Za igru su potrebna bar 2 igraca.");
                break;
            }
            String c = scannerString.nextLine();
            if(c.equals("")) {
                games.add(new Games(a, b, null));
                System.out.println(games.toString());
                break;
            }
           games.add(new Games(a, b, c));
            System.out.println(games.toString());
        //override metodu toString uvijek se tako vrsi ispis klasa, i samo sout(player)
    } }}
