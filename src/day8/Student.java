package day8;

public class Student {

    String name = "shiv";
    String lastName = "patil";
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {

        String value = "Name = " + name + " and Lastname = " + lastName;

        return value;
    }


}
