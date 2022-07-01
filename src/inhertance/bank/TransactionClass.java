package inhertance.bank;

public class TransactionClass {

    public static void main(String[] args) {

        HdfcBank hdfcBank = new HdfcBank(10, "BLR");
        SbiBank sbiBank = new SbiBank();


        System.out.println(hdfcBank.branchName);
        System.out.println(sbiBank.branchName);

        hdfcBank.withdraw(1000);

    }
}
