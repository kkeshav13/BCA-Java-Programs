class Shape{
    static final double PI = Math.PI;

    void Area(float a)
    {
        float A = a * a;
        System.out.println("Area of Square :" + A);
    }
    void Area(double a)
    {
        double A = PI * a * a;
        System.out.println("Area of the Circle :" + A);
    }
    void Area(int a , int b) {
        int A = a * b;
        System.out.println("Area of the Rectangle :" + A);
    }
}
class area{
    public static void main(String[] args){
        Shape obj = new Shape();

        obj.Area(8);
        obj.Area(6);
        obj.Area( 5, 4);
    }
}