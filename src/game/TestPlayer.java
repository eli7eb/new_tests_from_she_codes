package game;

import java.util.Calendar;
import java.util.Date;

public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // instance variables - replace the example below with your own
	    //public static void main(String[]args){ 
	        Player myPlayer;
	        myPlayer= new Player();
	        Calendar cal = Calendar.getInstance();
	        Date today = new Date();
	        cal.setTime(today);
	        myPlayer._playerName = "Yossi";
	        myPlayer._playerScores = 5;

	        System.out.println("player's name:  "+myPlayer._playerName+"  player's Scores  "+myPlayer._playerScores);
	    
	        myPlayer.addPoints(11);
	//זה לא עובד לי לא מבינה למה..        
	        System.out.println("player's name:  "+myPlayer._playerName+"  player's Scores  "+myPlayer._playerScores);
	    }

	}

