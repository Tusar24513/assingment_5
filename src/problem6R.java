import java.util.Scanner;

public class problem6R {
    public static void main(String[] args) {
        problem4 number1=new problem4();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        number1.AllNumberSame(num1,num2,num3);
    }

}
