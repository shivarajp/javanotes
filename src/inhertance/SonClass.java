package inhertance;

public class SonClass extends Father{

    String name = "Shiv";

    void greet(){
        System.out.println("Hello");
    }

    @Override
    void drinks(){
        System.out.println("I like Sprite");
    }

    public static void main(String[] args) {
        SonClass obj = new SonClass();
        //obj.greet();
        //obj.drinks();

        //Father father = new Father();

        //Father father1 = null;
        Father father2 = new SonClass();

        SonClass sunObj = (SonClass) father2;

        Father newFather = sunObj;

        System.out.println(sunObj.skinTone);


        father2.drinks();

        //System.out.println(father2.skinTone);


    }

}
