package com.newenergytrading.colors;

public class Color {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBackgroundStyle() {
        int z = (int) (Math.random()*50+1);

        return "background-color:" + color + "; animation: mymove " + (Math.random()*2+1.1) + "s infinite" + "; border-radius: " + Math.random() +"px" + "; transform: rotate(" + Math.random() + "deg);" + "; width: " + Math.random() + "; margin-left: " + z + "%;";
    }
}
