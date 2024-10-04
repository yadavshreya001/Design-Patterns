package adapter_Design_Pattern;

public class Client {
    public static void main(String[] args) {

        PhonePe phonepe = new PhonePe(new IciciBankAdapter());
        phonepe.performBankOperation();

    }
}
