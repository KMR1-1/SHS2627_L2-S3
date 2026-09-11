/**
* Une classe Cercle créée le 07/09/2026
* @author Jérôme David
* @version 1.0
*/
public class Cercle{
	double rayon;
	
	/**
	* Computes the perimeter of the circle
	* @return the total perimeter
	*/
	public double perimetre(){
		return 2 * rayon * Math.PI;
	}
	
	
	/**
	* Computes the area of the circle
	* @return the total area
	*/	
	public double surface(){
		return rayon * rayon * Math.PI;
	}
		
}
