public class InputArray
{
	public static void main(String[] args){
		int  [] a = {100,200,300};
		int c = a.length;
		System.out.println(c);
		System.out.println(a);
		int b[][] = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
		int d = b.length;
		System.out.println(d);
		System.out.println(b[4][2]);
		b[4] = a;
		System.out.println(b[4][2]);
		
		
	}
}