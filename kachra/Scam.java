package pack;


import jdk.jshell.Snippet;

abstract class Animal{

    public void glid(){

    }
     public void walk(){

     }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse can walk");
    }
}

class Snake extends Animal{
    public void glid(){
        System.out.println("snakes can glid");
    }
}


public class Scam {
    public static void main(String[] args) {


        Horse horse1 = new Horse();
        horse1.walk();

        Snake indian_saap = new Snake();
        indian_saap.glid();



    }


}
