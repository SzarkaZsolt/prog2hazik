/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1;

import java.awt.BorderLayout;

/**
 *
 * @author szzs1
 */
public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont(1, 9);
        Pont p2 = new Pont(2, 8);
        Pont p3 = new Pont(5, 7);
        Pont p4 = new Pont(4, 6);
        
        
        p1.setY(p1.getY() + 5);
        p2.setY(p2.getY() + 5);
        
        
        p2.setX(p2.getX() - 3.4);
        p3.setX(p3.getX() - 3.4);
        
        System.out.println("elso feladat \n");
        System.out.println(p1.getX()+ " "+p1.getY()+" \n ");
        System.out.println(p2.getX()+ " "+p2.getY()+" \n ");
        System.out.println(p3.getX()+ " "+p3.getY()+" \n ");
        
        
        RegularPolygon rp1 = new RegularPolygon(3, 1, 0, 0);
        RegularPolygon rp2 = new RegularPolygon(6, 4, 0, 0);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println("masodik feladat \n");
        
        System.out.println(rp1.toString()+" \n "+rp2.toString()+" \n "+rp3.toString());
        
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);
        
        System.out.println("harmadik feladat \n");
        System.out.println(rec1.toString()+ "\n" +rec2.toString());
        
        
        System.out.println("negyedik feladat \n");
        
        System.out.println();
        
        
        
        System.out.println("feladat 5\n");
        QuadraticEquation q1 = new QuadraticEquation(55, 4, 17);
        QuadraticEquation q2 = new QuadraticEquation(96, 117, 6);
        QuadraticEquation q3 = new QuadraticEquation(1, 9, 2);
        if (q1.getRoot1()<0){
            System.out.println("The equation has no roots");
            
        }
        else if(q1.getRoot1()==0){
            System.out.println(q1.getRoot1());
        }
        else {
            System.out.println(q1.getRoot1()+" "+q1.getRoot2());
        }
         if (q2.getRoot1()<0){
            System.out.println("The equation has no roots");
            
        }
        else if(q2.getRoot1()==0){
            System.out.println(q2.getRoot1());
        }
        else {
            System.out.println(q2.getRoot1()+" "+q2.getRoot2());
        }
          if (q3.getRoot1()<0){
            System.out.println("The equation has no roots");
            
        }
        else if(q3.getRoot1()==0){
            System.out.println(q3.getRoot1());
        }
        else {
            System.out.println(q3.getRoot1()+" "+q3.getRoot2());
        }
        
        System.out.println("hatodik feladat\n");
        
        LinearEquation L1 = new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation L2 = new LinearEquation(0, 0, 9, 10, 11, 12);
        LinearEquation L3 = new LinearEquation(13, 22, 33, 44, 55, 66);
        
        if (L1.isSolvable()){
            System.out.println(L1.getX() +" "+ L1.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
        if (L2.isSolvable()){
            System.out.println(L2.getX() +" "+ L2.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
        if (L3.isSolvable()){
            System.out.println(L3.getX() +" "+ L3.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
        
        
    }
}
