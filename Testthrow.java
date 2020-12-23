import java.io.IOException;

class Test {
    void method()throws IOException{
        throw new IOException("devide error");
    }
}
public class Testthrow{
    public static void main(String[] args){
        try{
            Test  test=   new Test();
            test.method();
        }catch(Exception e){
            System.out.println("Exception Handled Successfully");
        }
    }
}