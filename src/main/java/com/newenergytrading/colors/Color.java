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
        int zk = (int) (Math.random()*15+1);

        return "background-color:" + color + "; animation: mymove " + (Math.random()*3+1.1) + "s infinite" + "; border-radius: " + Math.random() +"px" + "; transform: rotate(" + Math.random() + "deg);" + "; width: " + Math.random() + "; margin-left: " + z + "%;" + " margin-top: " + zk + "%;";
    }

    public String getBackgroundStyle2() {
        int z = (int) (Math.random()*70+1);
        int zk = (int) (Math.random()*15+1);
        return "background-color:" + color + "; animation: mymove2 " + (Math.random()*10+2) + "s infinite" + "; border-radius: " + Math.random() +"px" + "; transform: rotate(" + Math.random() + "deg);" + "; width: " + Math.random() + "; margin-left: " + z + "%;" + " margin-top: " + zk + "%;";
    }

    public String getStarStyle() {
        int z = (int) (Math.random()*50+1);
        int zk = (int) (Math.random()*15+1);
        return "color:" + color + "; animation: mymove " + (Math.random()*6+1.1) + "s infinite" + "; border-radius: " + Math.random() +"px" + "; transform: rotate(" + Math.random() + "deg);" + "; width: " + Math.random() + "; margin-left: " + z + "%;" + " margin-top: " + zk + "%;" + " z-index:2;";
    }
    public String getDiscoMove() {
        int z = (int) (Math.random()*50+1);
        int zk = (int) (Math.random()*10+1);
        return "color:" + color + "; animation: discoMove " + (Math.random()*7+1.1) + "s infinite" + "; border-radius: " + Math.random() +"px" + "; transform: rotate(" + Math.random() + "deg);" + "; width: " + Math.random() + "; margin-left: " + z + "%;" + " margin-top: " + zk + "%;" + " z-index:2;";
    }
}
