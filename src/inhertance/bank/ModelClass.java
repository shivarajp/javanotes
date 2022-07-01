package inhertance.bank;

public class ModelClass {

    String name = "Shiv";
    String address = "BLR";

    ModelClass(String n, String a){
        name = n;
        address = a;
    }

    @Override
    public String toString() {
        return " "+name + " and " + address;
    }
}
