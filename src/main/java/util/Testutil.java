package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Testutil {
	 public String a;
	  
	  public static void main(String [] args) {
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyy, HH:mm:ss");
		  LocalDateTime now = LocalDateTime.now().plusDays(1); 
	      String date_var=dtf.format(now).toString();
	      System.out.println(date_var);
	  }
}
