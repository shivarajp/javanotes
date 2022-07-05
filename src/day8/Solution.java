package day8;

public class Solution extends Student{

    static final String name = "null";
    static String name2 = "Patil";

    public static void main(String[] args) {

        Object object = new Student();
        Student student = new Student();

        System.out.println(student.toString());

        name2 = "Hello";
        name2 = "33";

        student.getName();

        System.out.println(object.getClass());

        System.out.println(object.hashCode());

        System.out.println(object.toString());

        //System.out.println(object.equals(object2));

    }

}
