/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szzs1
 */
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("1. feladat");
        Circle circle = new Circle(1.0);
        
        System.out.println("A circle"+ circle.toString());
        System.out.println("The radius is "+circle.getRadius());
        System.out.println("The area is "+circle.getArea());
        System.out.println("The diameter is "+circle.getDiameter());
        
        Rectangle rectangle = new Rectangle(2.0,4.0);
        
        System.out.println(System.getProperty("line.separator")+"A rectangle "+rectangle.toString());
        System.out.println("The area is "+rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        
        System.out.println("2. feadat");
        Triangle triangle=new Triangle(1,1.5,1,"yellow",true);
        
        
        System.out.println("Triangle: "+triangle.toString());
        System.out.println("The Area:"+triangle.getArea());
        System.out.println("The Perimeter"+triangle.getPerimeter());
        
        Random rnd = new Random();
    int[] t = new int[30];
    for (int i = 0; i < t.length; i++) {
    t[i] = rnd.nextInt(10);
    }
    printArray(t);
    long timeStart = System.currentTimeMillis();
    insertionSort(t);
    long timeEnd = System.currentTimeMillis();
    printArray(t);
    System.out.println(timeEnd - timeStart);
    }
    
    static void printArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
    System.out.print(a[i] + " ");
    }
    System.out.println();
    }
    static void insertionSort(int[] a) {
         
    }
    Scanner sc=new Scanner(System.in);

    public Main() {
        this.t = new KereskedelmiEgyseg[]
        {
            new Pekseg(new String[] {"kifli","zsömle"},"Alma","Budapest",new Date(92, 4, 2)),
            new NemzetiDohanybolt(new String[] {"PallMAll","Viceroy","Sophiane"},"V","Győr",new Date(94, 5, 6)),
            new Pekseg(new String[] {"kifli","zsömle","Fornetti"},"Körte","Budapest",new Date(103, 04, 11)),
            new Pekseg(new String[] {"kifli","zsömle","rácsos"},"Barack","Debrecen",new Date(107, 9, 20)),
            new NemzetiDohanybolt(new String[] {"Camel","Marlboro","Sophiane"},"X","Pécs",new Date(98, 5, 8)),
            new Pekseg(new String[] {"pogácsa","zsömle"},"Szőlő","Budapest",new Date(115, 4, 2)),
            new NemzetiDohanybolt(new String[] {"PallMAll","Sophiane"},"E","Szeged",new Date(108, 8, 11)),
            new Pekseg(new String[] {"zsömle"},"Szilva","Kecskemét",new Date(111, 10, 2)),
            new NemzetiDohanybolt(new String[] {"PallMAll","Marlboro","Sophiane"},"A","Nyíregyháza",new Date(70, 1, 2)),
            new NemzetiDohanybolt(new String[] {"PallMAll","Marlboro","Sophiane"},"T","Nyíregyháza",new Date(114, 2, 17))
                
        };
    }
        System.out.println("Adja meg melyik napnak akarja frissiteni az órarendjét!");
    String nap=sc.nextLine();
        System.out.println("Adja meg hány órát akar felvenni "+nap+"-i napra!");
    int hanyora=sc.nextInt();
        System.out.println();
    
        //System.out.println(nap);
        //System.out.println(hanyora);
    
    
       Orarend n1=new Orarend("hetfo");
       Orarend n2=new Orarend("kedd");
       Orarend n3=new Orarend("szerda");
       Orarend n4=new Orarend("csutortok");
       Orarend n5=new Orarend("pentek");
     
     Ora o;  
     int i = 0;  
     while(i < hanyora){
     
         System.out.println(i+1+"."); 
         System.out.println("Írja be az adott kódot!");
     int kod=sc.nextInt(); 
         System.out.println("Adja meg az adott óra nevét!");
     String nev=sc.next(); 
         System.out.println("Adja meg az adott óra kezdetét!");
     int kezdete=sc.nextInt();
     
     o=new Ora(kod, nev, kezdete); 
     
     if(nap.equals("hetfo")) 
     {
         if (n1.oratHozzaad(o)==false)
             i--;
         
         n1.oratHozzaad(o);
         
     }
     
     if("kedd".equals(nap))
     {
         if (n2.oratHozzaad(o)==false)
             i--;
         
         n2.oratHozzaad(o);
     }
     if("szerda".equals(nap))
     {    
        if (n3.oratHozzaad(o)==false)
             i--;
         
        n3.oratHozzaad(o);
     }
     
     if("csutortok".equals(nap))
     {
         if (n4.oratHozzaad(o)==false)
             i--;
         
         n4.oratHozzaad(o);
     }
     
     if("pentek".equals(nap))
     {    
         if (n5.oratHozzaad(o)==false)
             i--;
         
         n5.oratHozzaad(o);
     }
     
     i++;// 
     
     
        System.out.println("");
        System.out.println("A hétfői nap");
        System.out.println("");
        int k=0;
     for(Ora item: n1.orarend){
         
            System.out.println((k+8)+" óra "+item);
            k++;
     }
     System.out.println("");
        System.out.println("A keddi nap");
        System.out.println("");
        k=0; 
     for(Ora item: n2.orarend){
          
         System.out.println((k+8)+" óra "+item);
         k++;
     }
     
     System.out.println("");
        System.out.println("A szerdai nap");
        System.out.println("");
        k=0;
     for(Ora item: n3.orarend){
           
         System.out.println((k+8)+" óra "+item);
         k++;
     }
     
     System.out.println("");
        System.out.println("A csutortoki nap");
        System.out.println("");
        k=0;
     for(Ora item: n4.orarend){
           
         System.out.println((k+8)+" óra "+item);
         k++;
     }
        
     System.out.println("");
        System.out.println("A penteki nap");
        System.out.println("");
         k=0;
    for(Ora item: n5.orarend){
          
         System.out.println((k+8)+" óra "+item);
         k++;
     }
    }
     KereskedelmiEgyseg []t;
    
    Autó []ll = new Autó[]
    {
        new Autó("IUL-136",75),
        new Autó("BKL-003",100),
        new Teherautó(3500, "TZV-443", 120),
        new Teherautó(1500, "ZUL-300", 100),
        new Autó("BHS-560", 100),
        new Teherautó(2300, "JUH-111", 70),
        new Autó("TTL-100", 120),
        new Teherautó(3000, "VUH-430", 100),
        new Autó("BBO-400", 100),
        new Teherautó(2900, "LEL-002", 75)
    };

    
    Teherautó []lu = new Teherautó[]
    {
        new Teherautó(2400,"IUS-936",80),
        new Teherautó(2400,"BNX-523",90),
        new Teherautó(3500,"TZV-443", 120),
        new Teherautó(1500,"ZUL-300", 100),
        new Teherautó(1500,"CVS-260", 100),
        new Teherautó(2300, "JUH-111", 70),
        new Teherautó(6000, "ERL-700", 120),
        new Teherautó(3000, "VUH-430", 100),
        new Teherautó(1200, "BSO-100", 100),
        new Teherautó(2900, "LEL-002", 75)
    };
         
    
       rendezMaxSzállíthatóTeherCsökkenőleg(lu);
       
       for(Teherautó zsolti;lu)
       {
           System.out.println(zsolti);
       }
        
        System.out.println("");
       System.out.println("A max motor teljesítmény:"+keresMaxMotorTeljesítmény(ll));
    
    }
    
 public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó []teher)
 {
 int seged;
     
  for(int i=0;i<teher.length-1;i++)
   for(int j=i+1;j<teher.length;j++)
   {
   if(teher[i].maxSzallíthatóTeher<teher[j].maxSzallíthatóTeher)
   {
   seged=teher[i].maxSzallíthatóTeher;
   teher[i].maxSzallíthatóTeher=teher[j].maxSzallíthatóTeher;
   teher[j].maxSzallíthatóTeher=seged;
   
   }
       
   
   }
 
 
 
 }
    
 public static Auto keresMaxMotorTeljesítmény(Autó[] kocsi)
 {
 Autó max=kocsi[0];
     
 for(int i=0;i<kocsi.length;i++)
 {
 if(kocsi[i].motorTeljesítmény>max.motorTeljesítmény)
   {
    max=kocsi[i]; 
   }

 
 }
 
 return max;
 }
    
        
    
    peksegKereső(t);
    }
    
  public static void peksegKereső(KereskedelmiEgyseg[] valt)
  {
  for(int i=0;i<valt.length;i++)
     {
     if(valt[i] instanceof Pekseg)
      {
          System.out.println(valt[i]);   
      } 
     }
}
}}}}}}}}}}}}}}}}}}}}

     
     
     
       


        
    
        
               
        
        
       
        
    
    

