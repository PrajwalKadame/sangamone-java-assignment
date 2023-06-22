package funWithProgram;

public class Clock1 {
	public static void main(String[] args) {
		int startHour=9;
		int startMin=0;
		
		int endHour=20;
		int endMin=55;
		
		for(int i=startHour; i<=endHour; i++) {
			for(int j=startMin; j<=endMin; j+=5) {
				
				double hourAngle=30*((i%12)+(j/60));
				double minAngle=  6 * j;
				System.out.println(hourAngle+""+minAngle);
			}
		}
	}
}
