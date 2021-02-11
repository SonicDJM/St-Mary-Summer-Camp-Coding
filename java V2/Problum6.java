 import java.util.Scanner;
public class Problum6{
  public static void main(String[] args) {
    double number1;
    double number2;
    String string1;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("enter a 2 numbers, and a string");
    number1 = keyboard.nextDouble();
    number2 = keyboard.nextDouble();
    string1 = keyboard.next();
    
    System.out.println(number1 + " " + number2 + " " + string1);
  }
}