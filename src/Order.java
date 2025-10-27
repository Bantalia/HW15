import java.util.Objects;
import java.util.Arrays;

class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Order[customer=" + customer + ", basket=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (!Objects.equals(customer, order.customer)) {
            return false;
        }
        if (basket == null && order.basket == null) {
            return true;
        }
        if (basket == null || order.basket == null) {
            return false;
        }
        if (basket.length != order.basket.length) {
            return false;
        }
        for (int i = 0; i < basket.length; i++) {
            Product p1 = basket[i];
            Product p2 = order.basket[i];
            if (p1 == null && p2 == null) {
                continue;
            }
            if (p1 == null || p2 == null) {
                return false;
            }
            if (!p1.equals(p2)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        // хэш по customer и корзине с учётом последовательности
        int result = Objects.hash(customer);
        result = 31 * result + Arrays.hashCode(basket);
        return result;
    }
}