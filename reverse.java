import java.util.Scanner;

public class reverse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        int reverse = 0;

        while(num !=0 ){
            int digit = num % 10;
            reverse = reverse*10 + digit ;
            num /=10;
        }
        System.out.println("Revrsed number :" + reverse);
    }
}