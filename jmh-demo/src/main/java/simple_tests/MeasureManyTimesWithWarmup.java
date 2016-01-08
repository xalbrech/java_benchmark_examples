package simple_tests;

public class MeasureManyTimesWithWarmup {
	
	private static final int MEASUREMENTS = 400000;
	public static long result;
	private static final int WARMUP = 200;
	
	private static long factorial(int n) {
		long result = 1;
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		
		for (int i = 0; i < WARMUP; i++) {
			result = factorial(5_000);
		}	

		for (int i = 0; i < MEASUREMENTS; i++) {
			long start = System.nanoTime();
			result = factorial(5_000);
			long duration = System.nanoTime() - start;
			System.out.printf("%d\n", duration);
		}	
	}
	
}