import java.util.Scanner;
public class if_else {

    //tax caculator
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;

        if(income<500000){
            tax=0;
        }
        else if(income>=500000 && income<120000){
            tax=(int)(income*0.2);
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("your income is: "+income);
        System.out.println("your tax is: "+tax);
    }
    
    


    //ternary operater
    //check if a student will pass or fail
    /* 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt(); 
        String reportcard=(marks>=33)?"pass":"Fail";
        System.out.println(reportcard);
    }
    */
        
    
}
