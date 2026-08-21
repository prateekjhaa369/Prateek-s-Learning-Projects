import java.util.*;
public class Main {
    public static void main(String[] args){
        Account account = new Account("1","Prateek",5000000.0);
        new ATMWindow(account);
    }
}
