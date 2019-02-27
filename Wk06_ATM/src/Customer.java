public class Customer {
    private double balance;
    private int pin;
    private String name;
    private String bankName;

    public Customer(){
        this("", 0000, 0, "");
    }

    public Customer(String name, int pin, double balance, String bankName){
        this.name = name;
        this.pin = pin;
        this.balance = balance;
        this.bankName = bankName;
    }

    //TODO: toString formatting
    @Override
    public String toString() {
        return "Customer{" +
                "balance=" + balance +
                ", pin=" + pin +
                ", name='" + name + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
