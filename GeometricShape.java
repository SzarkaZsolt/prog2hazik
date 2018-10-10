
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */

    public class GeometricShape {

String color;
boolean filled;
Date date;

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }



    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        
    }

    
    
    public GeometricShape() {
    
      this.color="white";
      this.filled=false;
      this.date=new Date();
    
    }

    

    

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

   public Date getDateCreated()
   {
   return date;
   }

    @Override
    public String toString() {
        return "GeometricShape{" + "color=" + color + ", filled=" + filled + ", date=" + date + '}';
    }
    
}
