import java.util.Scanner;

public class TrackingGrade {

	//declare instance data
	private int score1, score2;
	private float average;
	private String name;

	// ---------------------------------------------
	//constructor
	// ---------------------------------------------
	public TrackingGrade(String studentName) {
		//add body of constructor
		this.name = studentName;
	}

	// ---------------------------------------------
	//inputGrades: prompt for and read in student's grades for test1 and test2.
	//Use name in prompts, e.g., "Enter's Joe's score for test1".
	// ---------------------------------------------
	Scanner scan = new Scanner(System.in);

	public void inputGrades() {
		//add body of inputGrades
		System.out.print("Enter's " + name + "'s score for test1: ");
    score1 = scan.nextInt();

		System.out.print("Enter's " + name + "'s score for test2: ");
    score2 = scan.nextInt();
	}

	// ---------------------------------------------
	//getAverage: compute and return the student's test average
	// ---------------------------------------------

	//add header for getAverage
	public float getAverage() {
		//add body of getAverage
		return average = (float)(score1 + score2) / 2;
	}

	// ---------------------------------------------
	//getName: print the student's name
	// ---------------------------------------------

	//add header for printName
	public String getName() {
		//add body of printName
		return name;
	}

	// to string method
	public String toString() {
		return "Name: " + name + "\t" + "Test 1: " + score1 + "\t" + "Test 2: " + score2;
	}
}