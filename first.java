import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers for  + & * :");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("This is the product :" + a*b +"\n");
        System.out.println("This is the sum: "+ a+b);
    }
}