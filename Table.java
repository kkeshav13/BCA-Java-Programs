import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the number");
        int tab = input.nextInt();
        System.out.println("Table of "  + tab + " is :");
        for(int i=1; i<=10; i++){
            System.out.println(tab * i);
        }

    }
}