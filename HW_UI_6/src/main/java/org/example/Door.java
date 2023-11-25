package org.example;

public class Door {
    protected String door1 = "Auto";
    protected String door2 = "Goat";
    protected String door3 = "Goat";

    public Door(String door1, String door2, String door3) {
        this.door1 = door1;
        this.door2 = door2;
        this.door3 = door3;
    }

    public Door(){}

    public String getDoor1() {
        return door1;
    }

    public void setDoor1(String door1) {
        this.door1 = door1;
    }

    public String getDoor2() {
        return door2;
    }

    public void setDoor2(String door2) {
        this.door2 = door2;
    }

    public String getDoor3() {
        return door3;
    }

    public void setDoor3(String door3) {
        this.door3 = door3;
    }
}

