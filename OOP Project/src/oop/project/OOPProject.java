/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package oop.project;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;

public class OOPProject {
    public static void main(String[] args) {
        try{
       Scanner input=new Scanner(new File("resources/input.txt"));  
       int n=input.nextInt();
       Drawable [] Shapes= new Drawable[n];
       if(Shapes.length<2)
       {System.out.println("the size must be at least 2");}
       else{
       for(int i=0;i<n;i++)
       {
           String shapesType=input.next();
           double num=input.nextDouble();
          
           if(shapesType.equals("circle"))
           {
              Shapes[i]= new Circle(num);
           }
           else
           {
              Shapes[i]=new Cube(num);
           }
           
       }
       input.close();
     
      PrintWriter output=new PrintWriter("resources/sumAreas.txt");
      double sum=0;
      for(int i=0;i<n;i++)
      {
        sum+=Shapes[i].getArea();
      }
        output.println("The Sum="+sum);
        output.close();
        
        JFrame frame = new JFrame("Shapes GUI");
        Draw panel = new Draw(Shapes);
        frame.setSize(300, 300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       }
        }catch (Exception exp) {
                  System.out.println(exp.getMessage());
        }
    }
    
}


   
