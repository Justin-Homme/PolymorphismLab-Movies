package polymorphismLab;
/**
 * The parent class Movie which its children classes
 * (ex. RomanticComedy and ActionFilm) may inherit from
 * @author Justin Homme, Drew Rapley
 * @version 02/24/21
 *
 */
public class Movie {
	
	/**
	 * the title of the movie
	 */
	protected String title;
	
	/**
	 * the director of the movie
	 */
	protected String director;
	
	/**
	 * A constructor for the Movie class
	 * @param title
	 * @param director
	 */
	public Movie(String title, String director) {
		
		setTitle(title);
		setDirector(director);
	}
	/**
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * 
	 * @param director
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "This movie is \"" + title + "\", directed by " + director + ".";
	}
	
}
