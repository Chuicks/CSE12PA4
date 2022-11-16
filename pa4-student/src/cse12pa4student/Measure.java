package cse12pa4student;

import java.util.List;
import static cse12pa4mysteries.Mysteries.*;
import java.util.ArrayList;
public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		/** TODO **/
		List<Measurement> report = new ArrayList<>();
		for(String name: toRun) {
			for(int n = startN; n <= stopN; n++) {
				if(name == "A") {
					long startTime = System.nanoTime();
					mysteryA(n);
					long endTime = System.nanoTime();
					Measurement measure = new Measurement(name, n, endTime - startTime);
					report.add(measure);
				}
				if(name == "B") {
					long startTime = System.nanoTime();
					mysteryB(n);
					long endTime = System.nanoTime();
					Measurement measure = new Measurement(name, n, endTime - startTime);
					report.add(measure);
				}
				if(name == "C") {
					long startTime = System.nanoTime();
					mysteryC(n);
					long endTime = System.nanoTime();
					Measurement measure = new Measurement(name, n, endTime - startTime);
					report.add(measure);
				}
				if(name == "D") {
					long startTime = System.nanoTime();
					mysteryD(n);
					long endTime = System.nanoTime();
					Measurement measure = new Measurement(name, n, endTime - startTime);
					report.add(measure);
				}
				if(name == "E") {
					long startTime = System.nanoTime();
					mysteryE(n);
					long endTime = System.nanoTime();
					Measurement measure = new Measurement(name, n, endTime - startTime);
					report.add(measure);
				}
				if(name == "F") {
					long startTime = System.nanoTime();
					mysteryF(n);
					long endTime = System.nanoTime();
					Measurement measure = new Measurement(name, n, endTime - startTime);
					report.add(measure);
				}
			}
		}
		return report;
	
	}
	

	public static String measurementsToCSV(List<Measurement> toConvert) {
		String line = "name,n,nanoseconds\n";
		
		for(Measurement measure: toConvert) {
			String name = measure.name;
			int n = measure.valueOfN;
			long nanoseconds = measure.nanosecondsToRun;
			line += name + "," + n + "," + nanoseconds + "\n";
		}
		return line;
	}
	
	/* Add any helper methods you find useful */
		
}
