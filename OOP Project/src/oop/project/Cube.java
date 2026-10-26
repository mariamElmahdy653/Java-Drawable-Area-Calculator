package oop.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Cube extends ThreeDShape {
    
    private double side;
    
    public Cube(double side)
     {
        if(side>0)
           this.side=side;
        else
            System.out.println("the side must be positive");
     }
      public Cube(double side,String color) {
        super(color);
        if(side>0)
           this.side=side;
        else
            System.out.println("the side must be positive");
        
      }
    
    public void setSide(double side)
    {
        if(side>0)
           this.side=side;
        else
            System.out.println("the side must be positive");
    }
     public double getSide()
    {
        return side;
    }
     @Override
     public double getVolume()
     {
         return side*side*side;
     }
     
       @Override
    public double getPerimeter()
    {
        return 12*side;
    
    }
       @Override
   public double getArea()
    {
        return 6*(side*side);
    
    }
   @Override
    public String howToDraw()
    {
      return "";
    }

}
