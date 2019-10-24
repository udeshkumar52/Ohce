package jvmethds;
import java.util.*;


public class testbiggestnumber {

	public static void main(String[] args) {
		// here is the main code
		int playeronegoalscored = 23 , playertwogoalscored = 14;
		String playeronename, playertwoname; 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the player1 name");
		playeronename = in.nextLine();
		System.out.println("Enter the player2 name");
		playertwoname = in.nextLine();
		if(playeronegoalscored>playertwogoalscored) 
			System.out.println("the high scorer: " + playeronename);
		else
			System.out.println("the high scorer: " + playertwoname);
		
		}
}
