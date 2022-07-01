package inhertance.bank;

public class Normal {


    /*A getNewObject(int objNumeber){
        return new A();
    }

    B getNewObjectB(int objNumeber){
        return new B();
    }*/

    Object getAnyNewObj(int objNum){
        if (objNum == 1){
            return new C();
        }else {
            return new B();
        }
    }



    public static void main(String[] args) {

        A a = new B();



        B b2 = new B();

        A a2 = b2;

        if (b2 instanceof B){
            System.out.println("True");
            System.out.println(a);
        }else {
            System.out.println("False");
            System.out.println(a);
        }

        B b = new B();
        //b.fun1();


        Normal normal = new Normal();


        if (normal.getAnyNewObj(1) instanceof C){
            C cObj = (C) normal.getAnyNewObj(1);
            System.out.println("C's object");
        }else {
            System.out.println("It's a different obj");
        }


        ModelClass modelClass = new ModelClass("Shiv", "BLR");

        System.out.println(modelClass.toString());



    }
}
