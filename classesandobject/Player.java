package com.classesandobject;

public class Player {
    static int totalPlayers = 0;
    String playerName;
    
    public static void main(String[] args) {
    	Player player1 = new Player();
    	Player.totalPlayers++;
    	Player player2 = new Player();
    	Player.totalPlayers++;
    	
    	System.out.println("Total Players: "+Player.totalPlayers);
    	System.out.println(player1);
    	System.out.println(player2);
    }
}
