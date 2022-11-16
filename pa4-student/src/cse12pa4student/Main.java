package cse12pa4student;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Measurement> abc = Measure.measure(new String[]{"C", "D"}, 40, 50);
		String ans = Measure.measurementsToCSV(abc);
		System.out.println(ans);
	}
}
