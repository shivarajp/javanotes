package day8;

public class ChildClass extends ParentClass{

    void fun2(){
        System.out.println("I am child fun2");
    }

    @Override
    void fun1(){
        System.out.println("I am child fun");
    }

    public static void main(String[] args) {

        ChildClass child = new ChildClass();
        //child.fun1();


        ParentClass parentClass22 = new ChildClass();

        Object parent = new ChildClass(); //Upcasting

        Object cc = new Child2();


        if (parent instanceof Child2){
            Child2 c2 = (Child2) parent;
            c2.fun1();
        }else {
            ChildClass child22 = (ChildClass) parent;
            child22.fun1();
        }



        //parent.fun1();



        Object parent2 = new Child2();
        //parent2.fun1();

        Object parent3 = new GrandChild();
        //parent3.fun1();


        ParentClass parentClass = new ChildClass();
        //parentClass.fun2();


        if (parentClass instanceof Child2){
            Child2 cc2 = (Child2) parentClass;
            cc2.funChild2();
        }else {
            System.out.println("Its else part");
        }


        ChildClass childClass = (ChildClass) parentClass;

        ParentClass pp = new GrandChild();
        pp.fun1();

        //childClass.fun2();





    }

}
