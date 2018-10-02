package hazi1statikus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
public class StatikusMetódus {
    public static void rendez (int a, int b, int c){
        int tmp = 0;
        if (b < a){
            tmp = b;
            b = a;
            a = tmp;
        }
        if (c < a){
            tmp = c;
            c = a;
            a = tmp;
            
        }
        if (c < b){
            tmp = c;
            c = b;
            b = tmp;
        }
        System.out.println(a+" "+b+" "+c);
        
    }
     public static void maxmin (double a, double b, double c){
        double tmp = 0;
        if (a < 0){
            a = a* (-1);
        }
        if (b < 0){
            b = b* (-1);
        }
        if (c < 0){
            c = c*(-1);
        }
        
        if (b < a){
            tmp = b;
            b = a;
            a = tmp;
        }
        if (c < a){
            tmp = c;
            c = a;
            a = tmp;
            
        }
        if (c < b){
            tmp = c;
            c = b;
            b = tmp;
        }
         System.out.println(a+" "+c);
     }
    public static void harmadik(double a,double b,double c,double d){
        if(d >= 0){
            System.out.println(a+" "+c+" "+b+" "+d);
        }
        else {
            System.out.println(a+" "+b+" "+d+" "+c);
        }
        
        
    }
    public static boolean negyedik(double a,double b,double c){
        return(a + b > c && b + c > a && c + a > b);
    }
    public static void szokoev(int a,int b){
        int db = 0;
        for(int i = a; i <= b; i++){
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                db++;
            }
        }
        System.out.println(db);
    }
    public static void hatodik(int a){
        switch(a){
            case 1: System.out.println("elégtelen");break;
            case 2: System.out.println("elégséges");break;
            case 3: System.out.println("legjobbak");break;
            case 4: System.out.println("jó");break;
            case 5: System.out.println("jeles");break;
        }
        
        
    }
    public static void hetedik(int a,int b){
        int hanyados = 0;
        while (a >= b){
            hanyados++;
            a = a - b;
        }
        System.out.println(hanyados);
        
    }
    public static void nyolcadik(int a){
        int i;
        int db = 0;
        for(i = 1;i <= a; i++){
           if(a % i == 0){
               db++;
           } 
           
        }
        if(db == 2){
            System.out.println("primszám");
        }
        else{
            System.out.println("nem prim");
        }
    }
    public static void kilencedik(int n){
           int a = 0;
           int b = 1;
           
        int i = 0;
        if(n == 1){
            System.out.println(a);
            
        }    
        if(n == 2){
            System.out.println(a +" "+ b);
        }
        else{
        int osszeg;
            
            while (i < n){
                
                osszeg = a + b;
                System.out.println(osszeg);
                b = a;
                a = osszeg;
                osszeg = b;
                
                i++;
    
            }
    
        }
    }
   public static void tizedik (int n){
       int ujszam = 0;
       int maradek;
       while (n != 0)
       {
           maradek = n % 10;
           ujszam = ujszam * 10+maradek;
           n = n / 10;
           
       }
       System.out.println(ujszam);
       
   }
   
       public static void tizenegy(int szam){
           int k = 1;
           int szorzat = 1;
           while (k != szam + 1){
               szorzat = k * szorzat;
               k++;
           }
           System.out.println(szorzat);
           
       } 
       public static void tizenketto(int sz1,int sz2,int k ){
           int h = sz1;
           while(h != sz2){
               if(h % k == 0){
                   System.out.println(h);
               }
               h++;
       }
           
           
           
       }
        public static void tizenharom (int szam){
             int a = 0;
           int b = 1;
           
        int i = 0;
        
        int osszeg = 1;
            
            while (osszeg < szam){
                
                osszeg = a + b;
                
                b = a;
                a = osszeg;
                osszeg = b;
                
                i++;
        }
            System.out.println(osszeg);
        }
        
        
       
    
    
    
    public static void main(String[] args) {
        System.out.println("elso feladat\n");
        rendez(3, 8, 10);
        System.out.println("masodik feladat \n");
        maxmin(-3,-4,9);
        System.out.println("hamradik feladat \n");
        harmadik(40, 17, 24, 1);
        System.out.println("negyedik feladat \n ");
        System.out.println(negyedik(36.3, 5.6, 4.2));
        System.out.println("ötödik feladat \n");
        szokoev(1990, 2020);
        System.out.println("hatodik feladat \n");
        hatodik(3);
        System.out.println("hetedik feladat \n");
        hetedik(1000,100);
        System.out.println("nyolcadik feladat \n");
        nyolcadik(6);
        System.out.println("kilencedik feladat \n");
        kilencedik(20);
        System.out.println("tizedik feladat \n");
        tizedik(987);
        System.out.println(" tizenegyedik feladat \n");
        tizenegy(3);
        System.out.println("tizenkettedik feladat\n");
        tizenketto(5,50,5);
        System.out.println("tizenharmadik feladat\n");
        tizenharom(25);
        System.out.println("tizennegyedik feladat\n");
           }


}