package pack;

public class Arrayoperations {


    int arr[] =  new int[5];
    int max = arr.length;
    int arrsize = 0;



    short z = 8;
    byte a = 7;
    int b = 2;
    long c = 10;
    double d = 2.23;
    float e = 2.1f;
    boolean check = true;
    char aa = 'k';
    String ss = "hello";
    int[] array = {2,2,4,2};



    public void insertatfirst(int data){
        if (arrsize == max){
            System.out.println("Array is full\nNo element can be inserted");
            return;
        }

        arr[0] = data;


    }
    public static void main(String[] args) {


        Arrayoperations opertate = new Arrayoperations();
        opertate.insertatfirst(88);



    }
}
