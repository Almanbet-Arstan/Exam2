package com.company;

public class LaFinta extends Pizza{
    private boolean withMushrooms;

    public LaFinta() {
    }

    public LaFinta(int price, int weight, boolean withMushrooms) {
        super(price, weight);
        setWithMushrooms(withMushrooms);
    }

    public boolean isWithMushrooms() {
        return withMushrooms;
    }

    public void setWithMushrooms(boolean withMushrooms) {
        if (!withMushrooms) System.out.println("Without mushrooms");
        else System.out.println("With mushrooms");
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
        return "LaFinta " +
                "withMushrooms = " + withMushrooms + super.toString();
    }
}
