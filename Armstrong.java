import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Armstrong numbers "+ "\n Enter your number");
        int num = in.nextInt();
        int len = String.valueOf(num).length();
        int demo = num;
        int result = 0;
     //   System.out.println("len" + len);
        while(demo != 0){
            int rem = demo % 10;
            result += Math.pow(rem, len);
            demo /= 10;
            // System.out.println("rem = " + rem + " result" + result + " demo" + demo + "\n");
        }
      //  System.out.println("res"+ result);
        if(result == num){
            System.out.println("Yes this is a Armstrong number");
        }
        else{
            System.out.println("Nooooooo");
        }
    }
}