package util;

public class Testutil {
	 public String a;
	  
	  public static void main(String [] args) {
		  Testutil s = new Testutil();
	    s.a = "5";
	    try {
	      String b = (String) Testutil.class.getField("a").get(s);
	      System.out.println(b);
	    } catch  (Exception e)  {
	      e.printStackTrace();
	    } 
	  }
}
