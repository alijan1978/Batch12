package Class26;

public class ShoppingCartTester {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        //shoppingCart.originalPrice = 100;
        shoppingCart.setDiscount(.20);
        shoppingCart.calculatePrice();
    }
}
