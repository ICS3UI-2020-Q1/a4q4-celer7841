/**
 *
 * @author 
 */
 import java.util.Scanner;
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int counter = 1;
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers.");

    int number = sc.nextInt();
    while (counter <= number) {
     if(counter %3 == 0 && counter %5 == 0) {
        System.out.println("FizzBuzz");
      } 
      
      else if(counter %3 == 0) {
        System.out.println("Fizz");

      }
      else if(counter %5 == 0) {
        System.out.println("Buzz");
      }
      else{
        System.out.println (counter);
        }
      
      counter = counter + 1;
    }

    } 
}
