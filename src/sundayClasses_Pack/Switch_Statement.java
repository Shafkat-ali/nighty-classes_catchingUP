package sundayClasses_Pack;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//SCANNER CLASS
		
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Please enter value between 1 and 5!");
	
    int switchValue = scanner.nextInt();

    
//SWITCH STATEMENT #1    
      switch(switchValue) {
          case 1:
              System.out.println("Value was 1");
              break;
          case 2:
              System.out.println("Value was 2");
              break;
          case 3:case 4:case 5:
              System.out.println("was a 3 or a 4, or a 5");
              System.out.println("Actually it was a " + switchValue);
              break;
          default:
              System.out.println("Was not 1,2,3, 4 or 5");
              break;
      }

  //////////////////
 //SWITCH STATEMENT #2
      
      System.out.println("Please enter letter between A through G!");
      
      String stringVal = scanner.nextLine();
      
      
      switch(stringVal) {
          case "A":
              System.out.println("A was found");
              break;
          case "B":
              System.out.println("B was found");
              break;
          case "C": case "D" : case "E":
              System.out.println(stringVal + " was found");
              break;
          default:
              System.out.println("Could not find A, B, C, D or E");
              break;
      }

      
  /////    
//SWITCH STATEMENT #3
      
      System.out.println("Please enter a month of the year in all UPPERCASE!");
      String month = scanner.nextLine();
      
      switch(month.toUpperCase()) {
          case "JANUARY":
              System.out.println("Jan");
              break;
          case "FEBRUARY":
              System.out.println("Feb");
              break;
          case "MARCH":
              System.out.println("Mar");
              break;
          case "APRIL":
              System.out.println("Apr");
              break;
          case "MAY":
              System.out.println("May");
              break;
          case "JUNE":
              System.out.println("Jun");
              break;
          case "JULY":
              System.out.println("Jul");
              break;
          case "AUGUST":
              System.out.println("Aug");
              break;
          case "SEPTEMBER":
              System.out.println("Sep");
              break;
          case "OCTOBER":
              System.out.println("Oct");
              break;
          case "NOVEMBER":
              System.out.println("Nov");
              break;
          case "DECEMBER":
              System.out.println("Dec");
              break;
          default:
              System.out.println("Not sure");
      }
		
		
      //////////////
		

	}

}
