package inhertance.bank;

public class A {

    String name = "A";

    A(String name){
        this.name = name;
        System.out.println("I am A's constructor 2");
    }

    A(){
        System.out.println("I am A's constructor");
    }

    void fun1(){
        System.out.println("Im A's fun1");
    }

}
