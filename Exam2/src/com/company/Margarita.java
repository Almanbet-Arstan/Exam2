package com.company;

public class Margarita extends Pizza{
    private boolean withMeat;

    public Margarita() {
    }

    public Margarita(int price, int weight, boolean withMeat) {
        super(price, weight);
        setWithMeat(withMeat);
    }

    public boolean isWithMeat() {
        return withMeat;
    }

    public void setWithMeat(boolean withMeat) {
        if (!withMeat) System.out.println("Without meat");
        else System.out.println("With meat");
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
        return "Margarita " +
                "withMeat = " + isWithMeat() + super.toString();
    }
}
