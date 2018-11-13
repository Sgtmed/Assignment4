/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alien;

import javax.swing.*;
import java.awt.*;

 /*
 * @author danbrost
 */
public class JDemoAliens extends JFrame 
{
    Martian aMartian = new Martian();
    Jupiterian aJupiterian = new Jupiterian();
  
public void paint(Graphics g)
{
   Martian.draw(g);
   Jupiterian.draw(g);
   
   //Create Font object
   Font titleFont = new Font( "Times New Roman", Font.BOLD, 21 );
   //set g object to font object
   g.setFont( titleFont );
   g.drawString("MARTIAN VS JUPITERIAN", 120, 100);

}
 

    public static void main(String[] args)
    {
        JDemoAliens frame = new JDemoAliens();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("JDemoAliens");
           
    }
}
