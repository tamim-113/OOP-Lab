public class FoodItem {
    String name;
    int price;      // taka per piece
    int quantity;   // pieces in stock

    int stockValue() {
        return price * quantity;
    }

    void printLine() {
        System.out.println(name + " | Tk " + price + " | Qty " + quantity + " | Value " + stockValue());
    }
}