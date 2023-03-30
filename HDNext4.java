package org.example.OOP.HW4;

public class HDNext4 extends HotDrink4{
    private int temp;
    public HDNext4(String name, int volume, int temp) {
        super(name, volume);
        this.temp = temp;
    }
    @Override
    public String toString() {
        return "HDNext { " + "name = " + name + ", temp = " + temp + ", volume = " + volume + " }";
    }
    public int getTemp() {
        return temp;
    }

}
