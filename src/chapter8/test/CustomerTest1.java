package chapter8.test;

import chapter8.inheritance.Customer;
import chapter8.inheritance.VIPCustomer;

public class CustomerTest1 {
    public static void main(String[] args) {

        Customer lee = new Customer();
        lee.setCustomerID(10100);
        lee.setCustomerName("Lee");

        VIPCustomer kim = new VIPCustomer();
        kim.setCustomerID(10101);
        kim.setCustomerName("Kim");

        System.out.println(lee.showCustomerInfo());
        System.out.println(kim.showCustomerInfo());
    }

}
