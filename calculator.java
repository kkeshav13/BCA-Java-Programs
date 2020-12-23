package Calc;

public class calculator{
    public int Sum(int a, int b)
    {
        return a +b;
    }
    public int Sub(int a, int b)
    {
        return a-b;
    }
    public static void main(String[] args){
        calculator obj = new calculator();
        System.out.println("The Sum is :");
        System.out.println(obj.Sum(10, 20));
        System.out.println("The Sub is :");
        System.out.println(obj.Sub(50, 40));
    }
}