class Scratch {
    public static void main(String[] args) {
        System.out.println("First 20 even numbers");
        int count = 0;
        for(int i= 1; count<=20; i++){

            if(i%2==0){
                System.out.println(i);
                count += 1;
            }
        }
    }
}