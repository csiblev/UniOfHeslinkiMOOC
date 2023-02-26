
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account Matthew = new Account("Matthews account", 1000.0);
        Account Me = new Account("My account", 0);
        Matthew.withdrawal(100.0);
        Me.deposit(100.0);
        System.out.println(Matthew);
        System.out.println(Me);
    }
}
