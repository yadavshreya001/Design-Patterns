package adapter_Design_Pattern;

public interface BankApi {

    double getBalance();
    void transferFunds(String from, String to, Double amount);

}
