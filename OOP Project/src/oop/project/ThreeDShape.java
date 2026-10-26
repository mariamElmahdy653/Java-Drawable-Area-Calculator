package oop.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public abstract class ThreeDShape extends Shape {
    public abstract double getVolume();
    public ThreeDShape()
    {
        
    }
    public ThreeDShape(String Color)
    {
        super(Color);
    }
}
