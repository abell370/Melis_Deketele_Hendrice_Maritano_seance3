import java.util.Scanner;

import interpreter.ExpressionParser;

public class Cas3 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public static void main(String[] args) throws Exception {
        ExpressionParser parser = new ExpressionParser();

        System.out.println("[Calculator] Please enter the expression you want to calculate");
        System.out.print(ANSI_RED);
        System.out.println("\n / ! \\ Only integers and + and - operators allowed / ! \\ \n");
        System.out.print(ANSI_RESET);

        try(Scanner scanner = new Scanner(System.in)){
            String calculate = scanner.nextLine();
            System.out.println("Result : " + parser.parseClassic(calculate));
        }catch(Exception ex){
            System.out.println(ex);
            System.out.println("Error !");
        }
    }
}
