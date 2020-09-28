import java.util.HashSet;

public class Main {

    private static HashSet<BankAccount> accounts = new HashSet<>();

    public static void main(String args[]){

        accounts.add(new BankAccount(231564,208441));
        accounts.add(new BankAccount(634262,133997));
        accounts.add(new BankAccount(546123,133990));

        for(BankAccount account : accounts){
            System.out.println(account);
        }

    }
}
