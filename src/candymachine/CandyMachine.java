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
        System.out.println("How much money do you have?");
        double money = kb.nextDouble();
            candyMachine();
        if (money > .50){
            candyMachine();
        }
        else{
            System.out.println("Get more money!");
        }
        
        
    }
    public static void candyMachine () {
        
        
        System.out.println("what would you like to have");
        String choice = kb.nextLine();
        double cost;
//        double twix = 0.65;
//        double chips = 0.50;
//        double nutterButter = 0.75;
//        double peanutButterCup = 0.65;
//        double juicyFruitGum = 0.55;
        
        switch (choice) {
            case "Twix":
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
        if (cost > 0){
            System.out.println("You have purchased " + choice + " for $" +cost);
        }
        else{
            System.out.println("you haven't selected a candy that is in stock");
        }
        
    }
    
}
