public class Customer { private String name;
    private double balance;
    private ShoppingCart cart;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        cart = new ShoppingCart(name);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void addFunds(double amount) {
        balance += amount;
    }

    public boolean purchase(Storage storage) {
        if (balance >= cart.getTotal(storage)) {
            balance -= cart.getTotal(storage);
            cart = new ShoppingCart(name);
            return true;
        }
        return false;
    }

    public void setBalance(double v) {

    }
}

