package com.company;

public class Technical_literature extends Department{
    private boolean hasComputer;

    public Technical_literature(boolean hasComputer) {
        this.hasComputer = hasComputer;
    }

    public boolean isHasComputer() {
        return hasComputer;
    }

    public void setHasComputer(boolean hasComputer) {
        this.hasComputer = hasComputer;
    }

    @Override
    public String toString() {
        return "Technical_literature{" +
                "hasComputer=" + hasComputer +
                "} " + super.toString();
    }
}
