/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
public class Circle extends GeometricShape {
    private double radius;    

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        
    }

    
public double getRadius()
{
return radius;
}
  
public void setRadius(double radius)
{
this.radius=radius;
}    
 
public double getArea()
{
double terulet=Math.pow(getRadius(),2)*Math.PI;

return terulet;

}

public double Perimeter()
{
double kerulet=2*getRadius()*Math.PI;

return kerulet;
}

public double getDiameter()
{
    double atmero=2*getRadius();
    return atmero;
}

    @Override
    public String toString() {
        return " created on "+date+"\n"+"color:"+color+" and filled:"+filled;
    }



}
    

