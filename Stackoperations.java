package pack;



public class Stackoperations {

    int N = 5;
    int Arr[]  = new  int[N];
    int top = -1;
    int size = N;
    int bottom = -1;



    public void push(int data){
        if (top == -1){
            top++;
            Arr[top] = data;
            bottom = 0;
            return;
        }

        if (top == size - 10) {

            System.out.println("Stack is full  ie overflow");
            return;
        }
        else {
            top = top + 1;
            Arr[top] = data;
            return;
        }
    }


    public void disply(){

        for (int i = top ; i>-1; i--){
            System.out.println("|_"+Arr[i]+ "_|");
        }
    }



    public void pop(){
        //check the underflow condition
        if (top == -1){
            System.out.println("Stack is empty and cannot be pop any element");
            return;
        }

        else {
            System.out.println(Arr[top]+" is poped now");
            top--;
            return;
        }
    }

    public void peek(){

        if (top == -1){
            System.out.println("Stack is empty");
        }
        System.out.println(Arr[top]+" is the peek element");
        return;
    }



    public static void main(String[] args) {
        Stackoperations stack = new Stackoperations();

        stack.push(55);
        stack.push(66);
        stack.push(99);
        stack.push(22);
        stack.push(895);

        stack.disply();
        stack.peek();
        stack.pop();
        stack.disply();
        stack.peek();


    }
}
