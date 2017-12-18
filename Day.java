import java.util.ArrayList;
public class Day {
	private int start;
	private int close;
	private Object[][] shifts;
	private int[][] requirments;
	
	public Day() {
		start = 0;
		close = 0;
	}
	public Day(int s, int c) {
		start = s;
		close = c;
		shifts = new Object[(close+25)-start][10];
		requirments = new int[(close+25)-start][3];
	}
	public void create() {
		for (int i = 0; i<shifts.length;i++) {
			if(i<=15) {
			shifts[i][0] = 9+i;
			requirments[i][0] = 9+i;
			}
			else {
				shifts[i][0] = i-15;
				requirments[i][0] = i-15;
			}
				
		}
	}
	public void setRequirments(int s, int f, int n, String t) {
		
		for(int i=s-9; i<f-9; i++) {
			if(t== "Manager") {
				requirments[i][0] = n;
			}
			if(t== "Insider") {
				requirments[i][1] = n;
			}
			if(t== "Driver") {
				requirments[i][2] = n;
			}
			
		}
		
	}
	public void printRequirments() {
		for(int i =0; i<requirments.length;i++) {
			System.out.println(requirments[i][0]+", "+requirments[i][1]+", "+ requirments[i][2]);
		}
		
	}
	public void printShifts() {
		for(int i =0; i<shifts.length;i++) {
			System.out.println(shifts[i][0]);
		}
	}
	public void addShift() {
	}

}
