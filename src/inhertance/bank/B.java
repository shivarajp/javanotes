package inhertance.bank;

public class B extends A{

    B(){
        //super("Hello");
        System.out.println("I am B's constructor");
    }

    void fun1(){
        System.out.println("Im B's fun1");
        super.fun1();
    }

}
