package objectProgramming;

public class FunctionGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// number of line segments to plot
		int n = Integer.parseInt(args[0]);

		// the function y = sin(4x) + sin(20x), sampled at n+1 points
		// between x = 0 and x = pi
		double[] x = new double[n + 1];
		double[] y = new double[n + 1];
		for (int i = 0; i <= n; i++) {
			x[i] = Math.PI * i / n;
			y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);
		}
	}
}
