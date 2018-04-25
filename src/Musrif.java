
public class Musrif extends User{
	
	protected float ERA;

	public Musrif(int number, String lastName, String firstName, float average, float e){
		super(number,lastName,firstName,average);
		if(number<0 || number>99) throw new IllegalUserException("Number must be from 1 to 100.");
		if(average<=0 || average>=1) throw new IllegalUserException("Average must be between 0 and 1.");
		ERA = e;
	}
	
	public float getERA(){
		return ERA; 
	}
	
	public void setERA(float era){
		ERA = era; 
	}

/**
 * Takes a Musrif and returns its parameters as a string.
 */
	public String toString(){
		String info = number + "   " + lastName + ", " + firstName + "  " + average + "  " + ERA + "\n";
		return info;
	}
}
