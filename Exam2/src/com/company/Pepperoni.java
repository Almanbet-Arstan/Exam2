package com.company;

public class Pepperoni extends Pizza{
    private boolean isSpicy;

    public Pepperoni(int price, int weight, boolean isSpicy) {
        super(price, weight);
        setSpicy(isSpicy);
    }

    public Pepperoni() {
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        if (!spicy) System.out.println("Not spicy");
        else System.out.println("Very spicy");
    }

    @Override
    protected void doPizza() {
        super.doPizza();
    }

    @Override
    protected void deliverPizza() {
        super.deliverPizza();
    }

    @Override
    public String toString() {
        return "Pepperoni " +
                "isSpicy = " + isSpicy() + super.toString();
    }
}
