import java.util.Scanner;

public class ShoppingApplication {

    private static Storage storage = new Storage();

    public static void main(String[] args) {
        storage.init();
        Customer customer = new Customer("Jan Kowalski", 50);
        customer.getCart().addItem("mleko", storage);
        customer.getCart().addItem("mleko", storage);
        customer.getCart().addItem("piwo", storage);
        double total = customer.getCart().getTotal(storage);

        if(total > customer.getBalance()){
            System.out.println("Zakup nie powiódł się. Brakuje " + (total - customer.getBalance()) + "zł");
        }else{
            customer.setBalance(customer.getBalance() - total);
            System.out.println("Zakup zakończony powodzeniem. Pozostało " + customer.getBalance() + "zł");
        }
    }
}


