/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alien;

/**
 *
 * @author danbrost
 */
public class CreateAliens 
   {
   public static void main(String[] args)
   {
      Martian aMartian = new Martian();
      Jupiterian aJupiterian = new Jupiterian();
      System.out.println(aMartian.toString());
      System.out.println(aJupiterian.toString());
   }
}
