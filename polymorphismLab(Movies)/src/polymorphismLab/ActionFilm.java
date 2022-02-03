package polymorphismLab;

/**
 * The child class "ActionFilm" of its parent class "Movie"
 * @author Justin Homme, Drew Rapley
 * @version 02/24/21
 *
 */
public class ActionFilm extends Movie {

	/**
	 * how many explosions are in the movie
	 */
	private int numExplosions;
	
	/**
	 * the constructor for the class "ActionFilm"
	 * @param title
	 * @param director
	 * @param numExplosions
	 */
	public ActionFilm(String title, String director, int numExplosions) {
		
		super(title, director);
		
		setNumExplosions(numExplosions);
	}

	/**
	 * 
	 * @return numExplosions
	 */
	public int getNumExplosions() {
		return numExplosions;
	}

	/**
	 * 
	 * @param numExplosions
	 */
	public void setNumExplosions(int numExplosions) {
		this.numExplosions = numExplosions;
	}
	
	@Override
	public String toString(){
		
		return super.toString() + "\n" + "It is an Action Film, and has "
				+ numExplosions + " explosions.";
	}
}
