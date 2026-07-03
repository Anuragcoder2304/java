import java.util.Scanner;

public class switch_case {
    //calculator
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a: ");
        int a = sc.nextInt();
        System.out.print("Enter second number b: ");
        int b = sc.nextInt();
        System.out.print("Enter the Operater :");
        char operater = sc.next().charAt(0);

        switch(operater){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '%':System.out.println(a%b);
            break;
            default : System.out.println("Wrong operator");

        }
    }
}
