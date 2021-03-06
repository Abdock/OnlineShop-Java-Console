package Clients;

import Orders.Order;

public class PrimaryCustomer extends Customer
{
    private double discount;
    private double cashback;

    public PrimaryCustomer(String email, String name, String surname, double discount, double cashback) {
        super(email, name, surname);
        this.discount = Math.max(0.05, Math.min(discount, 0.5)); // the minimum value of discount must be between 0.05 and 0.5
        this.cashback = Math.max(0.05, Math.min(cashback, 0.5)); // the minimum value of cashback must be between 0.05 and 0.5
        //[5%; 50%]
    }

    public PrimaryCustomer(String email, String name, String surname) {
        super(email, name, surname);
        discount = 0.05;
        cashback = 0.05;
    }

    @Override
    public void buy(Order order) {
        double price = order.getTotalPrice();
        price = price * (1 - discount);
        System.out.println("Total price: " + price);
        double money = enterMoney(price);
        System.out.println("Your change: " + (money - price) + " and your cashback: " + (price * cashback));
        history.add(order);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = Math.max(Math.min(discount, 0.5), 0.05);
    }

    public double getCache() {
        return cashback;
    }

    public void setCache(double cashback) {
        this.cashback = Math.max(Math.min(cashback, 0.5), 0.05);
    }

    @Override
    public String toString() {
        return "PrimaryCustomer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", history=" + history +
                ", discount=" + discount +
                ", cashback=" + cashback +
                '}';
    }
}
