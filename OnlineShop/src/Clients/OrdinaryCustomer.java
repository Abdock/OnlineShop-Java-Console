package Clients;

import Orders.Order;

public class OrdinaryCustomer extends Customer
{
    public OrdinaryCustomer(String email, String name, String surname) {
        super(email, name, surname);
    }

    @Override
    public void buy(Order order) {
        double price = order.getTotalPrice();
        System.out.println("Total price: " + price);
        double money = enterMoney(price);
        System.out.println("Your change: " + (money - price));
        history.add(order);
    }

    @Override
    public String toString() {
        return "OrdinaryCustomer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", history=" + history +
                '}';
    }
}
