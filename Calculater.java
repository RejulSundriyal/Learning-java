import java.util.Scanner;
public class Calculater 
{
  public static void main(String args[])
  {
    char op;
    int num1,num2,result;
    Scanner user = new Scanner(System.in);
    System.out.println("Choose operator: +,-,*,/");
    op = user.next().charAt(0);
    System.out.println("Enter first number");
    num1 = user.nextInt();
    System.out.println("Enter second number");
    num2 = user.nextInt();
    switch (op) {
        case '+':
        result = num1 + num2;
        System.out.println("num1 + num2 ="  + result);
        break;
        case  '-':
        result = num1 - num2;
        System.out.println("num1+num2 ="  + result);
        break;
        case  '*':
        result = num1 * num2;
        System.out.println("num1*num2 ="  + result);
        break;
        case  '/':
        result = num1 / num2;
        System.out.println("num1/num2 ="  + result);
        break;
        default:
        System.out.println("Invalid operation");
        break;
 }
  }
}