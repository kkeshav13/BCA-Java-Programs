import java.util.Scanner;

class simpleintrest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Interest Program");
        System.out.println("Enter the Principal:");
        float p = input.nextFloat();
        System.out.println("Rate:");
        float r = input.nextFloat();
        System.out.println("Time");
        float t = input.nextFloat();
        System.out.println("Simple Interest =" + (p*r*t)/100);
    }
}