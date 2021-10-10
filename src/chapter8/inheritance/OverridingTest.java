package chapter8.inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerWho = new VIPCustomer(100010, "who", 100);
        int price = customerWho.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고, " + customerWho.showCustomerInfo());

        Customer customerGold = new GoldCustomer();

    }

}
