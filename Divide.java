public class Divide
{
	public static void main(String[] args){
	java.util.Scanner L =new java.util.Scanner(System.in);
	System.out.print("please input age");
	int age = L.nextInt();
	if(age>=0&&age<=150){
		 if(age>=0&&age<=5)
		System.out.println(age+"婴儿");
		else if(age>=6&&age<=18)
		System.out.println(age+"少儿");
		else if(age>=11&&age<=150)
			System.out.println(age+"老年");
	}
	else System.out.println("非法信息");
	}
}