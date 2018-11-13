/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alien;
import java.awt.Graphics;

/**
 *
 * @author danbrost
 */
public class Martian extends Alien 
{
    public Martian()
    {
        super("Martian",4,4,2);
    }
    static void draw(Graphics x)
    {
        // Antenne
        x.drawLine(120, 240 , 120, 260);
        x.drawLine(130, 240 , 130, 260);
        x.drawOval(115, 230, 10, 10);
        x.drawOval(125, 230, 10, 10);
        
        /* body
         * drawOVal(x,y,width,height) */
        x.drawOval(75, 260, 100, 60);
        
        /*
         * right side arms
         * drawArc(x, y, Width, Height, Start Angle, Arc Angle) */
        x.drawArc(10, 300, 100, 10, 70, 170);
        x.drawArc(10, 295, 100, 10, 70, 170);
        x.drawArc(10, 290, 100, 10, 70, 170);
        x.drawArc(10, 285, 100, 10, 70, 170);
        
        // Left side arms
        x.drawArc(140, 290, 100, 10, 250, 170);
        x.drawArc(140, 285, 100, 10, 250, 170);
        x.drawArc(140, 280, 100, 10, 250, 170);
        x.drawArc(140, 275, 100, 10, 250, 170);
      
        /* Legs
         * drawline(x1,y1,x2,y2) */
        x.drawLine(110,320,110,375);
        x.drawLine(120,320,120,375);
        x.drawLine(130,320,130,375);
        x.drawLine(140,320,140,375);
        
        //Labels
        x.drawString("Martian:", 100, 400);
        x.drawString("4 arms, 4 legs and 2 Antennae", 30,  420);
    }
}
