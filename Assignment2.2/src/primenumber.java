
public class primenumber {

	public static void main(String[] args) {
		for (int n=1; n<=100; n++) 
		{
			for(int d=1; d<=n; d++)
					{if (n%d==0 && d!=1 && d!=n) break;
					else if (d==n) System.out.println(n); }
			}
	}
}
