package hazi1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
public class Rectangle {
    public double width;
    public double height;
    
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        
        return this.width * this.height;
    }
    
    public double getPerimeter() {
        
        return 2*(this.width + this.height);
    }
    
    
    

    @Override
    public String toString() {
        return "Rectangle\n" + "width=" + width + "\nheight=" + height + "\nArea=" + getArea() + "\nPerimeter=" + getPerimeter();
    }
  
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double h) {
        this.height=h;
    }
}