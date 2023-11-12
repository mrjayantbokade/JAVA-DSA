package pack;

import java.util.Scanner;

public class CelciusToFareinheit {



    public static int FrequencyofDigits(long n, int d) {
        int count =0;

        while (n>=1){
            int rem = (int) n % 10;
            n /= 10;
            if(rem == d){
                count += 1;
            }
        }
        return count;
    }




    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tempInCelsius = sc.nextInt();
//
//        int F = tempInCelsius * (1.8 + 35);
//        System.out.println(F);


//        int radius = sc.nextInt();
//        int pi = 3;
//        System.out.println(pi*radius*radius);
//        System.out.println(2*pi*radius);


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//


//        String agentName = sc.nextLine();
//        System.out.println("Hi my name is Agent "+agentName);


//        float v1 = 10.5f;
//        float v2 = 12.5f;
//        float v3 = 12.5f;
//
//        float ans = (v1+v2+v3)/3;
//
//        int average = (int)ans;
//        System.out.println(average);


//        int a = 1042;
//        int b = 7;
//
//        System.out.println(a/b);
//        System.out.println(a%b);

//        Scanner in = new Scanner(System.in);
//
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int num3 = in.nextInt();
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);


//        Scanner sc = new Scanner(System.in);
//        double tempInCelsius = sc.nextInt();
//
//        double F = tempInCelsius *  1.8 + 35;
//        System.out.println(F);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//
//        if (n > 90) {
//            System.out.println("Excellent");
//        }
//
//
//            if (n > 80 && n <= 90) {
//                System.out.println("Good");
//            }
//            if (n > 70 && n <= 80) {
//                System.out.println("Fair");
//            }
//            if (n > 60 && n <= 70) {
//                System.out.println("Meets Expectations");
//            }
//            if (n < 60) {
//                System.out.println("Below Expectations");
//            }


//        Scanner sc = new Scanner(System.in);
//        int n;
//        n = sc.nextInt();
//        switch(n){
//            case 28:
//                System.out.println("i am young");
//                break;
//            default:
//                System.out.println("i am not young");
//        }


//
//        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//
//
//        switch(month){
//            case 1:
//                System.out.println("31");
//                break;
//            case 2:
//                System.out.println("28");
//                break;
//            case 3:
//                System.out.println("31");
//                break;
//            case 4:
//                System.out.println("30");
//                break;
//            case 5:
//                System.out.println("31");
//                break;
//            case 6:
//                System.out.println("30");
//                break;
//            case 7:
//                System.out.println("31");
//                break;
//            case 8:
//                System.out.println("31");
//                break;
//            case 9:
//                System.out.println("30");
//                break;
//
//            case 10:
//                System.out.println("31");
//                break;
//            case 11:
//                System.out.println("30");
//                break;
//            case 12:
//                System.out.println("31");
//                break;
//        }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        sc.close();
//
//
//        if(n%2 != 0 && m%2 != 0){
//            System.out.println("we are odd");
//        }else{
//            System.out.println("we are simple");
//        }


//
//        Scanner input = new Scanner(System.in);
////        int n = input.nextInt();
//        input.close();

//        long fac = 1;
//
//        for (int i=1; i<=n; i++){
//            fac = fac * i;
//        }
////        for(int i=n; i>=1; i--){
////            fac = fac * i;
////        }
//
//        System.out.println(fac);

//        int sum = 0;
//
//        while(n >= 1){
//            int rem = n % 10;
//            sum = sum + rem;
//            n = n/10;
//        }
//
//        System.out.println(sum);


//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n; j++){
//                System.out.print("_");
//            }
//            System.out.println();
//        }


//        int rev = 0;
//        while(n >= 1){
//            int rem = n % 10;
//            rev = (rev*10)+rem;
//            n = n/10;
//
//        }
//
//        System.out.println(rev);


//        char currentChar = 'A';
//        int n = 4; // You can change 'n' to control the number of rows

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(currentChar);
//            }
//            System.out.println();
//            currentChar++; // Move to the next alphabet
//        }


//        char alpha = 'A';
//        for(int i =1; i<=n; i++ ){
//            for(int j=1; j<=i; j++){
//                System.out.print(alpha);
//            }System.out.println();
//            alpha++;
//        }


//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        if(n == 1){
//            System.out.println(n+" is not a prime number");
//        }
//
//
//        int count = 0;
//        for(int i=2; i<n; i++){
//            if(n%i == 0){
//                count +=1;
//            }
//        }
//
//        if(count == 0 || n == 1){
//            System.out.println(n+" is a prime number");
//        }else{
//            System.out.println(n+" is not a prime number");
//        }
//        sc.close();


//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        long sum = 0;
//        for(long i=1; i<=N ; i++){
//            sum += i;
//        }
//
//        System.out.println(sum);
//        }

//        for (int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print("_");
//            }
//
//            for (int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i=1;i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        for (int i = 1; i<=n; i++){
//            for (int j=1; j <= n-i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        int a = 1;
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(a+" ");
//                a++;
//            }
//            System.out.println();
//        }


//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                int sum = i+j;
//
//                if (sum %2 ==0){
//                    System.out.print("1");
//                }else {
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=n; i++ ){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print("#");
//            }
//
//            System.out.println();
//        }




//        int count = 0;
//        for(int i=2; i<n; i++){
//            if(n%i == 0){
//                count +=1;
//            }
//        }
//
//        if(count != 0 || n ==1){
//            System.out.println(n+" is not a prime number");
//        }else{
//            System.out.println(n+" is a prime number");
//        }
//    }


//
//        for(int i=1; i<n; i++){
//            System.out.print("*");
//        }
//        for(int j=1; j<=n+1; j++){
//
//            System.out.println("*");
//        }



//        for(int i=1; i<=n; i++ ){
//            for(int j=i; j>=1; j--){
//                System.out.print(j);
//            }System.out.println();
//        }




            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            int d = sc.nextInt();
            System.out.println(FrequencyofDigits(n, d));
        }



        }







