package oop.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Date;
public abstract class Shape implements Drawable {
   private String color;
   private  Date dateCreated;

    
   public Date getDateCreated() {
        return this.dateCreated=new Date();
    }
   @Override
    public abstract double getArea();
    public abstract double getPerimeter();
    
   

    public Shape(String color) {
        this.color = color;
        dateCreated=new Date();
    }

    public Shape() {
        color="black";
        dateCreated=new Date();
       
    }

   
   
    
}
