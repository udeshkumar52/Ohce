package jvmethds;
import java.util.Calendar;


public class ohcegreetings {
	public static void main(String[] args) { 
		int timeOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String name = "Udesh";
		if(timeOfDay >= 0 && timeOfDay <= 12){
	        System.out.println("Buenos dias " + name + " que tal?");
		}
	        else if(timeOfDay >= 12 && timeOfDay < 16){
	        System.out.println("Buenos tardes " + name + " que pasa?");   
	    }else if(timeOfDay >= 16 && timeOfDay < 21){
	    	System.out.println("gusta cafe y que tal tu dia?");
	    }else if(timeOfDay >= 21 && timeOfDay < 24){
	    	System.out.println("cansada y tu " + name);
	    }
	
}
}

