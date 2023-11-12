package pack;

public class Queueoperations {
    int N = 5;
    int [] arr = new int[N];
    int size = N;
    int front = -1;
    int rear = -1;



    public void display(){

        System.out.println();
        if (front == rear){
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("front | ");
        for (int i=front; i<=rear; i++){
            System.out.print(arr[i] +" | ");
        }
        System.out.print("rear");

    }
    public void enqueue(int data){
        if (rear == size-1){
            System.out.println("Queue is full cannot insert a element");
            return;
        }

        if (rear == -1 && front == -1){
            front = rear = 0;
            arr[rear] = data;
            return;
        }
        else {
            rear++;
            arr[rear] = data;
        }


    }

    public void dequeue(){

        if (front == -1 && rear == -1){
            System.out.println("Queue is empty ");
            return;
        }
        if (front == rear){
            front = rear = -1;
            return;
        }

        front++;
    }


    public static void main(String[] args) {
        Queueoperations queue = new Queueoperations();
        queue.enqueue(55);
        queue.enqueue(55);
        queue.enqueue(55);
        queue.enqueue(55);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}
