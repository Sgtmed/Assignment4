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
public class Jupiterian extends Alien
{
    public Jupiterian()
    {
        super("Jupiterian",2,2,1);
    }
    static void draw(Graphics y)
    {
        // Antenna
        y.drawOval(343, 235, 10, 10);
        y.drawArc(330, 236, 60, 160, 45, 60);
        
        /* Body
        * drawRect(x,y,width,height) */
        y.drawRect(335, 260, 90, 60);
        y.drawLine(375,320,375,375);
        y.drawLine(385,320,385,375);
        
        // arms
        y.drawLine(335,285,290,330);
        y.drawLine(425, 285,480,330);
        y.drawString("Jupiterian:", 350, 400);
        y.drawString("2 arms, 2 legs and 1 Antenna", 300,  420);
    }
}
