import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Integer> items;
    private double total;

    public ShoppingCart() {
        this.items = new HashMap<>();
        this.total = 0;
    }

    public ShoppingCart(String name) {

    }

    public void addItem(String itemName, Storage storage) {
        if (!storage.contains(itemName)) {
            System.out.println("Przedmiot " + itemName + " nie jest dostępny w sklepie");
            return;
        }
        if (items.containsKey(itemName)) {
            items.put(itemName, items.get(itemName) + 1);
        } else {
            items.put(itemName, 1);
        }
        this.total += storage.getPrice(itemName);
    }

    public double getTotal(Storage storage) {
        return total;
    }

    public Map<String, Integer> getItems() {
        return items;
    }
}



