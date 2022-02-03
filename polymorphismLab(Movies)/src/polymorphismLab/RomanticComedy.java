package polymorphismLab;

/**
 * the child class "RomanticComedy" of its parent class "Movie"
 * @author Justin Homme, Drew Rapley
 * @version 02/24/21
 *
 */
public class RomanticComedy extends Movie {

	/**
	 * the "best friend" character in the Romantic Comedy
	 */
	private String bestFriend;
	
	/**
	 * The constructor for the class "RomanticComedy"
	 * @param title
	 * @param director
	 * @param bestFriend
	 */
	public RomanticComedy(String title, String director, String bestFriend) {
		super(title, director);
		
		setBestFriend(bestFriend);
	}
	
	/**
	 * 
	 * @return bestFriend
	 */
	public String getBestFriend() {
		return bestFriend;
	}

	/**
	 * 
	 * @param bestFriend
	 */
	public void setBestFriend(String bestFriend) {
		this.bestFriend = bestFriend;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " It is a Romantic Comedy.\n" +
				bestFriend + " is the main character's best friend who was"
				+ " right in front of them\n" + "the whole time but they didn't"
				+ " realize they were in love.";
	}
	
}
