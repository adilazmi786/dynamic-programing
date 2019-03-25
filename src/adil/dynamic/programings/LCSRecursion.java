package adil.dynamic.programings;

public class LCSRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "longest";
		String str2 = "stone";

		char[] X = str1.toCharArray();
		char[] Y = str2.toCharArray();
		int m = X.length;
		int n = Y.length;

		LCSRecursion ls=new LCSRecursion();
	    System.out.println("Length of LCS is" + " " + 
	                                  ls.lcs( X, Y, m, n ) ); 	
	}

	private static int lcs(char[] X, char[] Y, int m, int n) {
		// TODO Auto-generated method stub
		if(m==0 || n==0)
			return 0;
		if (X[m-1] == Y[n-1]) {
			return 1 + lcs(X, Y, m - 1, n - 1);
		} else
			return Math.max(lcs(X, Y, m - 1, n), lcs(X, Y, m, n - 1));

	}

}
