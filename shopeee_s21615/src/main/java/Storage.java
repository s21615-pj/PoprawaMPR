import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
        private Map<String, Double> prices = new HashMap<>();
        private Map<String, Integer> stock = new HashMap<>();

        public void init() {
            prices.put("mleko", 2.50);
            prices.put("piwo", 3.00);
            prices.put("ciastka", 2.00);
            prices.put("chleb", 2.50);
            prices.put("czekolada", 3.50);
            prices.put("woda", 1.50);
            prices.put("orzechy", 4.00);
            prices.put("masło", 4.50);
            prices.put("bułki", 2.50);
            prices.put("szynka", 5.00);
            prices.put("ser", 4.00);

            stock.put("mleko", 10);
            stock.put("piwo", 20);
            stock.put("ciastka", 15);
            stock.put("chleb", 5);
            stock.put("czekolada", 8);
            stock.put("woda", 25);
            stock.put("orzechy", 12);
            stock.put("masło", 6);
            stock.put("bułki", 8);
            stock.put("szynka", 10);
            stock.put("ser", 14);
        }

    public double getPrice(String item) {
        return 0;
    }

    public String[] getProductNames() {
        return new String[0];
    }

    public boolean contains(String itemName) {
        return false;
    }
}

