import java.util.Scanner;

public class HelloWorld{
  private static Scanner in = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("I hate this editor");
    System.out.print("What is your name? >");
    String name = in.nextLine();
    System.out.println("Goodbye "+name);
  }

}
