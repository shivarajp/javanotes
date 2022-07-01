package inhertance.bank;

public class HdfcBank extends Bank{

    int interestRate;
    String homeLoan;
    String offerCard;


    HdfcBank(int intRate, String branchCode){
        super();

        this.interestRate = intRate;
    }

    void getYourPA(){

    }

    @Override
    void withdraw(int amount){
        //security
        if (amount > 0){
            super.withdraw(amount);
        }

    }

}
