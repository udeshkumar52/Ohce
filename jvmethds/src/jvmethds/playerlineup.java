/*** the main code to line up players 
 * by ranking
 */

package jvmethds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class playerlineup {
	private String player name;    // access specifiers 
    private int player age;
    private int rankbynumberofgoals; 
    private int player ranking;
}
    
	public playerlineup(int i, String string, int j) { //constructor
      
		
	}
		public void getranking() { // getter
		
}

	public static void main(String[] args) { // main code
        List<playerlineup> footballTeam = new ArrayList<>();
        playerlineup player1 = new playerlineup(59, "John", 20);
        playerlineup player2 = new playerlineup(67, "Roger", 22);
        playerlineup player3 = new playerlineup(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);
    
}
