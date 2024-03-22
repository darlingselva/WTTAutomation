package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Testutil {
	 public String a;
	  
	  public static void main(String [] args) {
		  int i=1;
		 String listevent="(//sub-event-entries-list//div[@class='row m0']//div[@class='eventslist-card'])"+"["+(i+1)+"]"+"//div[@class='eventscard-title']";
	     System.out.println(listevent);
	     
	  }
}
