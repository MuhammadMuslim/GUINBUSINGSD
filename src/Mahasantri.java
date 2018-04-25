public class Mahasantri extends User {
	
	public Mahasantri (int number, String lastName, String firstName, float average){
		super(number,lastName,firstName,average);
	}

/**
 * Takes a Mahasantri and returns its parameters as a string.
 */
	public String toString(){
		String info = number + "  " + lastName + ", " + firstName + "  " + average + "\n";
		return info;
	}

}