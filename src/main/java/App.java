import java.util.Calendar;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Num1 = myApp.readCurrentAge();
        String Num2 = myApp.readRetireAge();
        int int1 = Integer.parseInt(Num1);
        int int2 = Integer.parseInt(Num2);
        int yearsLeft = myApp.yearsLeft(int1, int2);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = myApp.retireYear(currentYear, yearsLeft);
        String outputString = myApp.generateOutputString(yearsLeft, currentYear, retireYear);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readCurrentAge(){
        System.out.print("What is your current age? ");
        return in.nextLine();
    }

    public String readRetireAge(){
        System.out.print("At what age would you like to retire? ");
        return in.nextLine();
    }

    public int retireYear(int currentYear, int yearsLeft){
        return currentYear + yearsLeft;
    }

    public int yearsLeft(int int1, int int2){
        return int2 - int1;
    }

    public String generateOutputString(int yearsLeft, int currentYear, int retireYear){
        return String.format("You have %d years left until you can retire.\nIt's %d, so you can retire in %d", yearsLeft, currentYear, retireYear);
    }
}