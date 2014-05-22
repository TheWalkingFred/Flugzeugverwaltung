/**
  *
  * <b>Description:<\b><br/>
  *
  * @version 1.0 from 27.03.2014
  * @author 
  */
import java.util.*;
public class menukontrolle {
  public static int menu (String menu[]) {
    boolean test = true;
    int wahl;
    do {
      wahl = menukontrolle.auswahl(menu);
      test = menukontrolle.test(wahl,menu.length);
    } while (test);
    return wahl;
  }
  
  public static void leer() {
    System.out.println();  
  }
  
  public static int menu_end_hauptprogramm (String menu[]) {
    boolean test = true;
    int wahl;
    do {
      wahl = menukontrolle.auswahl_end_hp(menu);
      test = menukontrolle.test(wahl,menu.length);
    } while (test);
    return wahl;
  }
  
  public static int auswahl_end_hp (String menu[]) {
    int num = 1, wahl = 0;
    int end = menu.length + 1;
    for (int i = 0;i < menu.length ;i++ ) {
      System.out.println(num + ". " + menu[i]);
      num++;
    } // end of for
    System.out.println(end + ". Beenden");
    System.out.print("Bitte wählen:");
    wahl = menukontrolle.eingabe(menu);
    
    return wahl;
  }
  
  public static int submenu (String menu[]) {
    boolean test = true;
    int length = menu.length;
    int wahl;
    do {
      wahl = menukontrolle.subauswahl(menu);
      test = menukontrolle.test(wahl,length);
    } while (test);
    return wahl;
  }
  
  public static int auswahl_ohne_back (String menu[])  {
    boolean test = true;
    int length = menu.length - 1;
    int wahl;
    do {
      wahl = menukontrolle.subauswahl2(menu);
      test = menukontrolle.test(wahl,length);
    } while (test);
    return wahl;
  }
  
  public static int subauswahl2 (String menu[]) {
    int num = 1, wahl = 0;
    //int end = menu.length + 1;
    for (int i = 0;i < menu.length ;i++ ) {
      System.out.println(num + ". " + menu[i]);
      num++;
    } // end of for
    System.out.print("Bitte wählen:");
    wahl = menukontrolle.eingabe(menu);
    return wahl;
  }
  
  public static int subauswahl (String menu[]) {
    int num = 1, wahl = 0;
    int end = menu.length + 1;
    for (int i = 0;i < menu.length ;i++ ) {
      System.out.println(num + ". " + menu[i]);
      num++;
    } // end of for
    System.out.println(end + ". Zurück");
    System.out.print("Bitte wählen:");
    wahl = menukontrolle.eingabe(menu);
    
    return wahl;
  }
  
  public static int auswahl (String menu[]) {
    int num = 1, wahl = 0, end = 0;
    end = menu.length + 1;
    for (int i = 0;i < menu.length ;i++ ) {
      System.out.println(num + ". " + menu[i]);
      num++;
    } // end of for
    System.out.println(end + ". Beenden");
    System.out.print("Bitte wählen:");
    wahl = menukontrolle.eingabe(menu);
    if ( wahl == end ) {
      System.exit(0);
    } // end of if
    return wahl;
  }
  
  public static boolean test (int wahl, int length){
    boolean test = true;
    length = length + 1;
    if ( wahl < 1 || wahl > length) {
      System.out.println("Bitte eine Auswahl von 1 bis " + length + " treffen!");
      
    } else {
      test = false;
    } // end of if-else
    return test;
  }
  
  public static int eingabe (String menu[]) {
    int anz = menu.length, wahlint = 0, wahllength = 0;
    String wahl = "";
    String menuneu[] = new String[anz];
    menuneu = menukontrolle.menuverarbeitung(menu);
    boolean test = false, testint = true;
    String alphabet[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    
    wahl = Tastatur.liesString();
    wahllength = wahl.length();
    try {
      wahlint = Integer.valueOf(wahl);
    } catch(NumberFormatException e) {
      test = true;
      testint = false;
    } 
    if ( test && wahllength == 1) {
      for (int i = 0 ; i < alphabet.length ; i++ ) {
        if (wahl.equalsIgnoreCase(alphabet[i])==true) {
          wahlint = i + 1;
          i = alphabet.length;
          test = false;
          
        } // end of if
      } // end of for
    } // end of if
    if (test && wahllength > 1) {
      for (int i = 0 ;i < menuneu.length ; i++ ) {
        if (wahl.toLowerCase().contains(menuneu[i].toLowerCase())==true) { //|| wahl.equalsIgnoreCase(end)==true || wahl.equalsIgnoreCase(back)==true ) { //|| wahl.equalsIgnoreCase(end)==true || wahl.equalsIgnoreCase(back)==true){
          wahlint = i + 1;
          if (wahlint == menuneu.length) {
            wahlint = i;
          } // end of if
          i = menuneu.length;
        } // end of if
        
      } // end of for
      
    } // end of if
    
    else if (testint){
      wahlint = Integer.valueOf(wahl);
    } // end of if-else
    return wahlint;
    
  }
  
  public static String[] menuverarbeitung ( String menu[] ) {
    int anz = menu.length + 2;
    String menuneu[] = new String[anz];
    int menuend = menu.length;
    int menuback = menu.length + 1;
    for (int i = 0;i < menu.length ;i++ ) {
      menuneu[i] = menu[i];
    } // end of for
    menuneu[menuend] = "beenden";
    menuneu[menuback] = "zurück";
    
    
    return menuneu;
  }
  
  
  
  
  public static void endausgabe ( String ausgabe ) {
    System.out.println();
    System.out.println("------------------------------");
    System.out.println(ausgabe);
    System.out.println("------------------------------");
    
    
  }
  
  public static void main(String[] args) {
    
  }
}
