package adapter_Design_Pattern;

public class PhonePe {

    //interface
    private BankApi bankApi;

    public PhonePe(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    public void performBankOperation(){
        bankApi.getBalance();
        //System.out.println("bankApi.getBalance() = " + bankApi.getBalance());
        bankApi.transferFunds("Shreya", "ABC", 1000.0);

    }
}
