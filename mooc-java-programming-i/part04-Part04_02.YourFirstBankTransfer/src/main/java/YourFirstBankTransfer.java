
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account Matthewsaccount = new Account("Matthews account",1000);
        Account Myaccount = new Account("My account",0);
        Matthewsaccount.withdrawal(100);
        Myaccount.deposit(100);
        System.out.println(Matthewsaccount);
        System.out.println(Myaccount);

    }
}
