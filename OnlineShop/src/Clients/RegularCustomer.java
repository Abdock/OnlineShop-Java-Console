package Clients;

import Orders.Order;

public class RegularCustomer extends Customer
{
    private double discount;

    public RegularCustomer(String email, String name, String surname, double discount) {
        super(email, name, surname);
        this.discount = Math.max(0.05, Math.min(discount, 0.5));
    }

    public RegularCustomer(String email, String name, String surname) {
        super(email, name, surname);
        discount = 0.05;
    }

    @Override
    public void buy(Order order) {
        double price = order.getTotalPrice();
        price *= (1 - discount);
        System.out.println("Total price: " + price);
        double money = enterMoney(price);
        System.out.println("Your change: " + (money - price));
        history.add(order);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = Math.max(0.05, Math.min(discount, 0.5));
    }

    @Override
    public String toString() {
        return "RegularCustomer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", history=" + history +
                ", discount=" + discount +
                '}';
    }
}
