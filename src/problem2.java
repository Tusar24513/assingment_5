import javax.swing.*;

public class problem2 {
    public void numberCheck(double number){
        if(number == 0){
            System.out.println("Zero");
        }
        else{
            if(Math.abs(number) < 1){
                System.out.println("Small");
            }
            else if(Math.abs(number) > 1000000){
                System.out.println("Large");
            }
            if(number > 0){
                System.out.println("Positive");
            }
            else{
                System.out.println("Negative");
            }
        }
    }
    }
