/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.project;
import javax.swing.*;
import java.awt.*;


public class Draw extends JPanel{
    Drawable[] drawShapes ;
    public Draw(Drawable[] Shapes)
    {
        drawShapes=Shapes;
    }
    @Override
    protected void paintComponent(Graphics g){
       super.paintComponent(g);
        
      for(int i=0;i<drawShapes.length;i++)
        {
           if(drawShapes[i] instanceof Circle)
              {
                 Circle c=(Circle)drawShapes[i];
                 g.fillOval(50, 135,(int)(2*c.getRadius()) , (int)(2*c.getRadius()));
              }
           else if(drawShapes[i] instanceof Cube)
                {
                 Cube c=(Cube)drawShapes[i];
                 int Side=(int)c.getSide();
                 if (Side>0)
                 {
                 g.drawRect(210, 150,Side ,Side);
                 g.drawRect(220, 140,Side, Side);
                 
                 g.drawLine(210, 150, 220, 140);             
                 g.drawLine(210 + Side, 150, 220 + Side, 140);
                 g.drawLine(210, 150 + Side, 220, 140 + Side);
                 g.drawLine(210 + Side, 150 + Side, 220 + Side, 140 + Side); 
                }
                }
        }
    }    
}
