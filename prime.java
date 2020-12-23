class Scratch {
    public static void main(String[] args) {
       // int flag = 1;
        System.out.println("Program to print Prime numbers upto 50! :");
        for (int i = 2; i <= 50; i++) {
             int flag =1 ;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
                if (flag == 1) {
                    System.out.println(i + " ");
                }


        }
    }
}