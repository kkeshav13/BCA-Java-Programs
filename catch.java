class Scratch {
    public static void main(String[] args) {
        try{
            int num = 500/0; // it will throw a exception
        }
        // handling the exception
        catch(ArithmeticException e){
            System.out.println("Error :" + e);
        }
    }
}