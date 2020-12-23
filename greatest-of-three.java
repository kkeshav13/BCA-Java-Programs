import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
       // int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = input.nextInt();
        System.out.println("Second :");
        int b = input.nextInt();
        System.out.println("Third :");
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.println("The Greatest Numbers is :" + a);
        }
        else if(b>a && b>c){
            System.out.println("The Greatest Number is :"+ b);
        }
        else{
            System.out.println("The Greatest number is :" + c);
        }
        input.close();
    }
}