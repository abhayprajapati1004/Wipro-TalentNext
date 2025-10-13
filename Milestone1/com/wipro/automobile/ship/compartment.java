package com.wipro.automobile.ship;

public class compartment {
    private double height;
    private double width;
    private double breadth;

    
    public compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }


    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getBreadth() { return breadth; }
    public void setBreadth(double breadth) { this.breadth = breadth; }
}