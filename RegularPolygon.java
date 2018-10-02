/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1;

import static java.lang.Math.pow;

/**
 *
 * @author szzs1
 */
public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getKerulet(){
        return side*n;
    }
    
    public double getTerulet(){
        double m;
        double tmp = side/2;
        m=Math.sqrt(Math.pow(side, 2)-Math.pow(tmp, 2));
        return ((side*m)/2)*n;
    }

    @Override
    public String toString() {
        return  "n=" + n + " side=" + side + " x=" + x + ", y=" + y + " Ker=" + getKerulet()+ " Ter="+ getTerulet();
    }
    
    
}
