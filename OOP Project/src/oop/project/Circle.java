package oop.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Circle extends Shape {
    private double radius;
    
    public void setRadius(double radius)
    {
         if(radius>0)
            this.radius= radius;
         else {System.out.println("the radius must be positive");}
    }
    
     public double getRadius()
    {
        return radius;
    
    }

    public Circle(double radius) {
        if(radius>0)
            this.radius= radius;
         else 
             System.out.println("the radius must be positive");
        
    }
     
      public Circle(double radius,String color) {
        super(color);
         if(radius>0)
            this.radius= radius;
         else 
             System.out.println("the radius must be positive");
       
    }
      
     @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    
    }
    @Override
   public double getArea()
    {
        
        return radius*radius*Math.PI;
    
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    @Override
     public String howToDraw()
    {
      return " ";
    }
    
}
