package candymachine;
import java.util.Scanner;
/**
 *
 * @author mlarrubia
 */
public class CandyMachine {
    private static Scanner kb = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        candyMachine();
        
        
        
    }
    public static void candyMachine() {
        System.out.println("How much money you got?");
        double money = kb.nextDouble();
        if (money > .49){
            System.out.println("what would you like to have");
            System.out.println("twix \n"
                    + "chips \n"
                    + "nutter butter \n"
                    + "peanut butter cup \n"
                    + "juicy fruit gum?");
            double cost;
            System.out.println("***CASE SENSITIVE***");
            // choice1 is unused, and is there to fix bug with scanner class
            String choice1 = kb.nextLine();
            String choice = kb.nextLine();
        
            switch (choice) {
               case "twix":
                cost = 0.65;
                    break;
               case "chips":
                cost = 0.50;
                    break;
               case "nutter butter":
                cost = 0.75;
                    break;
               case "peanut butter cup":
                cost = 0.65;
                    break;
               case "juicy fruit gum":
                cost = 0.55;
                    break;
               default:
                cost = 0;
                    break;
            }
            double change = money - cost;
            if (cost > 0){
               System.out.println("You have purchased " + choice + " for $" + cost);
            }
            else{
              System.out.println("you haven't selected a candy that is in stock");
            }
            
            System.out.println("Your change is " + change);
        }      
        else{
            System.out.println("Get more money!");
            
        }
    }
    
}
