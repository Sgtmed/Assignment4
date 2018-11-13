package alien;

/**
 *
 * @author danbrost
 */
public abstract class Alien 
{
   private String alienType;
   protected int numLegs;
   protected int numArms;
   protected int numAntenna;

   public Alien(String type,int legs, int arms, int antenna)
   {
       alienType = type;
       numLegs = legs;
       numArms = arms;
       numAntenna = antenna;
   }
   public String toString()
   {
       String summary;
       summary = "A " + alienType + " has "+ numLegs + " legs, " +
               numArms + " arms and " +
               numAntenna + " antenna.";
       return summary;
   }
}
