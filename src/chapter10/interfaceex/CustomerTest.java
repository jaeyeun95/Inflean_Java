package chapter10.interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        // Buy 와 Sell 타입이지만 customer로 인스턴스화 했기 때문에
        // customer메소드가 호출된다
        customer.order();
        buyer.order();
        seller.order();

    }

}
