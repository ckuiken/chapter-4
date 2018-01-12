


/**
 * Write a description of class Shape here.
 * 
 * @author D. Appel 
 * @version 1
 */
public class Shape
{
    // instance variables - replace the example below with your own
    private int numSides;
    private double sideLength;
    final double PI = Math.PI;

    /**
     * Constructor for objects of class Shape
     */
    public Shape(int sides, double length)
    {
        // initialise instance variables
       
    }

    /**
     * Calculates the area of a polygon given A = 1/2 * apothem * perimeter
     * @return    area of a regualar polygon as a double
     */
    public double calculateArea()
    {
        double area = 0;
        
        return area;
    }
    
    /**
     * Calculates the perimeter of a regular polygon
     * @return returns the perimeter as a double
     */
    public double getPerimeter() {
       double perimeter = 0;
       
       return perimeter;
    }
    
    /**
     * Calculates the apothem of a regular polygon
     * @param length is the side of the polygon
     * @param sides is the number of sides (integer)
     * @return apothem-the apothem of a regular polygon
     */
    public double getApothem(int sides, double length){
       double apothem =0;
       
       return apothem;
    }
    
    /**
     * Calculates the measure of one interior angle of a regular polygon
     * @param side length of a regular polygon
     * @return the measure (in degrees) of an interior angle
     */
    public double interiorAngle(int sides) {
        double intAngle = 0;
        
        return intAngle;
    }
    
    /**
     * Calculates the measure of an exterior angle
     * @param number of sides of polygon (int)
     * @return measure of exterior angle (double)
     * 
     */
    public double exteriorAngle(int sides) {
       double extAngle = 0 ;
       
       return extAngle;
    }
    
    /**
     * Overrides the println method and provides formatted printing
     */
    public String toString() {
      String output = null;
      
      return output;
    }
}
