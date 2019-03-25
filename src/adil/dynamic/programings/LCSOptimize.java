package adil.dynamic.programings;

public class LCSOptimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "longest";
		String str2 = "stone";

		char[] X = str1.toCharArray();
		char[] Y = str2.toCharArray();
		int m = X.length;
		int n = Y.length;
		int count[][] = new int[n+1][m+1];
		lcsOptimize(count, X, Y);
	}

	private static void lcsOptimize(int[][] count, char[] x, char[] y) {
		// TODO Auto-generated method stub

		int j;
		int i = 0;
		while (i <= y.length) {
			j=0;
			while (j <= x.length) {
				if(i==0 || j==0)
					count[i][j]=0;
				else if (y[i-1]==x[j-1])
					count[i][j] = 1 + count[i - 1][j - 1];
				else
					count[i][j] = Math.max(count[i - 1][j], count[i][j - 1]);

				j++;
			}
			i++;
		}
		System.out.println("Longest Subsequence: " + count[y.length][x.length]);
	}

}
