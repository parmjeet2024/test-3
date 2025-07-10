import javafx.collections.ObservableList;

public class SampleData {
    public static void loadSampleData(ObservableList<PizzaOrder> orders) {
        // Sample Customer 1
        PizzaOrder order1 = new PizzaOrder(
            "Sakshi", 
            "4376694676", 
            "L", 
            4, 
            BillCalculator.calculate("XL", 3)
        );

        // Sample Customer 2
        PizzaOrder order2 = new PizzaOrder(
            "Navdeep", 
            "4375564486", 
            "XL", 
            5, 
            BillCalculator.calculate("L", 2)
        );

        // Sample Customer 3
        PizzaOrder order3 = new PizzaOrder(
            "Rajni ", 
            "6478891024", 
            "M", 
            3, 
            BillCalculator.calculate("M", 1)
        );

        orders.addAll(order1, order2, order3);
    }
}