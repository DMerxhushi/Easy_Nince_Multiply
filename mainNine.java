import java.util.Scanner;

public class mainNine {

    public static void main(String [] args){
        Scanner myInput = new Scanner(System.in);
        System.out.println("What would you like to multiply by nine: ");
        int multiply = myInput.nextInt();
        nineTimes call = new nineTimes();
        System.out.println(call.getAnswer(multiply));

    }
    
}
