import java.util.Scanner;

class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CHECK IF ITS LEAP YEAR OR NOT");
        System.out.println("Enrter the Year");
        int num = input.nextInt();

        if ((num % 4 == 0) && (num % 100 != 0) || (num % 400 == 0)){
            System.out.println(num + "is a leap year");
        }
        else{
            System.out.println("Not a  Leap Year");
        }
    }
}