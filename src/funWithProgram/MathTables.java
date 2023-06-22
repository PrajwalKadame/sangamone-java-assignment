package funWithProgram;

public class MathTables {
    public static void main(String[] args) {
		int start=3;
		int end=20;
		
		for(int i=start; i<=20; i++) {
			for(int j=1; j<=10; j++) {
				int result=i*j;
				System.out.println(i+" * "+j+" = "+result);
			}
			System.out.println();
		} 
	}
}