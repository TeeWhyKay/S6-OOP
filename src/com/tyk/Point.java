package com.tyk;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        Point pt =  new Point(x,y);
        return this.distance(pt);
    }

    public double distance(Point pt) {
        return Math.sqrt(Math.pow((this.getX() - pt.getX()),2) + Math.pow((this.getY() - pt.getY()),2));
    }
}
