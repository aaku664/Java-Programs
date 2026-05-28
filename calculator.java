import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("calculator"); 

       System.out.print("enter first number");
       int a= sc.nextInt();

       System.out.println("enter second number");
       int b = sc.nextInt();

       System.out.println("1.addition");
       System.out.println("2.subtraction");
       System.out.println("3.multiplication");
       System.out.println("4.division");

       System.out.println("enter your choice");
       int choice = sc.nextInt();

       switch(choice){
        case 1:
            System.out.println("answer"+(a+b));
            break;
       
       case 2:
            System.out.println("answer"+(a-b));
            break;
       
       case 3:
            System.out.println("answer"+(a*b));
            break;
       
       case 4:
            System.out.println("answer"+(a/b));
            break;

        default:
            System.out.println("invlid");    
       }sc.close();

    }
}
