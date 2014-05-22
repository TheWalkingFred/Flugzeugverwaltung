/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 09.05.2014
  * @author 
  */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class zeit {
   public static String datum() {
    SimpleDateFormat formatter = new SimpleDateFormat(
    "dd.MM.yyyy");
    Date currentTime = new Date();
    //System.out.println(formatter.format(currentTime)); 
    String time = formatter.format(currentTime); 
    return time;     
  }
  public static void main(String[] args) {
    datum();
  } // end of main
  
} // end of class zeit
