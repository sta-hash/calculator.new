import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the number");
        int number1 = myObj.nextInt();
        System.out.println(number1);
        int number2 = myObj.nextInt();
        System.out.println(number2);
        System.out.println("select the operation");
        System.out.println("1:addition");
        System.out.println("2:substraction");
        System.out.println("3:multiplication");
        System.out.println("4:division");
        System.out.println("enter the choice operation");
        int choice  = myObj.nextInt();
        int result;
        switch(choice){
            case 1:
            result= number1+number2;
            System.out.println("result is"+" "+result);
            break;
            case 2:
            result = number1-number2;
            System.out.println("result is"+" "+result);
            break;
            case 3:
            result = number1*number2;
            System.out.println("result is"+" "+result);
            break;
            case 4:
            result = number1 /number2;
            System.out.println("result is"+" "+result);
            break;
        }
        

    }

    
}
