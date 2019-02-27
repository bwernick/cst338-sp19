public class ATM {
    //priavte ArrayList<Customer> customers = new ArrayList<Customer>();
    private String bankName;
    private double balance;
    private int serial;
    private String location;

    //TODO: Create Two Constructors
    public ATM(String bankName){
        this(100, bankName, "Unknown");
    }

    public ATM(int serial, String bankName, String location){
        this.bankName = bankName;
        this.serial = serial;
        this.location = location;
    }

    void displayMenu(){
        System.out.println("displayMenu not implemented");
    }

    void status(){
        System.out.println("status not implemented");
    }

    void setATM(double balance, String location){
        System.out.println("setATM not implemented");
    }

    void addFund(double money){
        System.out.println("addFund not implemented");
    }

    boolean isCustomer(String name){
        System.out.println("isCustomer not implemented");
        return false;
    }

    //TODO: getCustomer
    Customer getCustomer(String name){
        System.out.println("getCustomer not implemented");
        return new Customer();
    }

    void withdrawal(String name, int pin, double amount){
        System.out.println("withdrawal not implemented");
    }

    void deposit(String name, int pin, double amount){
        System.out.println("deposit not implemented");
    }

    boolean transfer(String name1, int pin1, double amount, String name2, int pin2){
        System.out.println("transfer not implemented");
        return false;
    }

    private Customer findCustomer(String custName, int custPin){
        System.out.println("findCustomer not implemented");
        return new Customer();
    }

    //TODO: Formatting toString
    @Override
    public String toString() {
        return "ATM{" +
                "bankName='" + bankName + '\'' +
                ", balance=" + balance +
                ", location='" + location + '\'' +
                '}';
    }
}
