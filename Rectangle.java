/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
public class Rectangle extends GeometricShape {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea()
    {
    double terulet=getWidth()*getHeight();
    
    return terulet;
    }
    
    public double getPerimeter()
    {
    double kerulet=(getWidth()+getHeight())*2;
    
    return kerulet;
    }

@Override
    public String toString() {
        return "created on "+date+"\n"+"color:"+color+" and filled:"+filled;
    }
    
}

