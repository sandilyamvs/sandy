class Rounding
{
	static int round(int n)
	{
		int a,b;
		a=(n/10)*10;
		b=a+10;
		return (n-a>b-n)?b:a;
	}
	public static void main(String args[])
	{
		int n=4551;
		System.out.println(round(n));
	}
}