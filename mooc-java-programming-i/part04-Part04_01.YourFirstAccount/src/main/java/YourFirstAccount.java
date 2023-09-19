import java.util.Scanner;

public class YourFirstAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account Myaccount = new Account("My Account",100);
        Myaccount.deposit(20);
        System.out.println(Myaccount);
    }
}
