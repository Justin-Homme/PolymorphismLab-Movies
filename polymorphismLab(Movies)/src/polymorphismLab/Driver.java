package polymorphismLab;
/**
 * Polymorphism and Late Binding Lab
 * @author Nathan Gossett, Justin Homme, Drew Rapley
 * @author YOUR NAME HERE
 * @version Spring 2019
 *
 */
public class Driver {

	public static void main(String[] args) {
		//This chunk of code should work once you've completed part 1
		Movie m1 = new Movie("Star Wars", "George Lucas");
		System.out.println(m1);//calls Movie.toString()
		System.out.println(); //blank line
		
		//Once you've completed part 2, uncomment this chunk and verify things work
		RomanticComedy rc1 = new RomanticComedy("You've Got Mail", "Nora Ephron", "Joe Fox");
		System.out.println(rc1);//calls RomanticComedy.toString()
		System.out.println(); //blank line
		

		//This chunk of code will need to wait until you've completed part 3
		ActionFilm af1 = new ActionFilm("Transformers", "Michael Bay", 5213);
		System.out.println(af1); //calls ActionFilm.toString()
		System.out.println(); //blank line
		
		Movie m2 = af1;
		
//		ActionFilm af2 = m1; 	// cannot assign a Movie object to an ActionFilm variable
								// since Movie does not contain all the attributes that 
								// an object from ActionFilm may need
		
		System.out.println(m2);
		
		System.out.println("M2 title is: " + m2.getTitle());
		
//		System.out.println("M2 number of explosions is: " + m2.getNumExplosions());
		// we cannot call "getNumExplosions" since m2 is derived from Movie and thus
		// does not have a numExplosions attribute assigned to it
		
		
		//Leave this commented out until you do part 5
		
		Movie[] myMovies = new Movie[5];
		
		myMovies[0] = new Movie("Super Bad", "Greg Mottola");
		myMovies[1] = new RomanticComedy("When Harry Met Sally", "Rob Reiner", "Sally Albright");
		myMovies[2] = new ActionFilm("The Incredibles", "Brad Bird", 11);
		myMovies[3] = new Movie("Ted", "Seth MacFarlane");
		myMovies[4] = new Movie("Borat", "Larry Charles");
		
		System.out.println("My list of movies is: ");
		for(int i = 0; i < myMovies.length; i++){
			System.out.println(myMovies[i]);
			System.out.println();//blank line
		}

	}

}