
public class driver {

	public static void main(String[] args) {
		Day d = new Day(9,3);
		d.create();
		//d.printShifts();
		d.setRequirments(9, 20, 2, "Driver");
		d.printRequirments();

	}

}
