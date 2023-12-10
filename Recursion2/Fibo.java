public   class Fibo {









//    static int fibokunal(int n) {
//        // base condition
//        if (n==0){
//            return n;
//        }
//        if (n < 2) {
//            return n;
//        }
//        System.out.println(n);
//        return fibokunal(n-1) + fibokunal(n-2);
//
//    }
    public static void   fib(int n, int a, int b){


        if (n == 0){
            return ;
        }


        int c = a+b;
        System.out.println(c);
        fib(n-1, b, c);


    }

     public int fibo(int n){

            if(n < 2){
                return  n;
            }


            return fibo(n-1) + fibo(n-2);




        }

    public static void main(String[] args) {


        Fibo obj1 = new Fibo();
        System.out.println(obj1.fibo(4));

        int n =4;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

         fib(n-2, 0, 1);
//
//            int ans = fibokunal(4);
//            System.out.println(ans);

    }





    }



