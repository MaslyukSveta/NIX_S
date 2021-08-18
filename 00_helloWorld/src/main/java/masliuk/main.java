package masliuk;

class A {
    public void print(){
        System.out.println("A");
    }

}

class B extends A {
    public void printB(){
        System.out.println("B");
    }
}

public class main {
    public static void main(String [] args){

        A a = new B();

        ((B) a).printB();



    }
}
