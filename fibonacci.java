import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
        int i=0, j=1, n=0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while(i<num){
            n= i+j;
            System.out.println(n);
            i = j;
            j = n;
        }
        input.close();
    }
}