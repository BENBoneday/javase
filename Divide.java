public class Divide
{
	public static void main(String[] args){
	java.util.Scanner L =new java.util.Scanner(System.in);
	System.out.print("please input age");
	int age = L.nextInt();
	if(age>=0&&age<=150){
		 if(age>=0&&age<=5)
		System.out.println(age+"Ӥ��");
		else if(age>=6&&age<=18)
		System.out.println(age+"�ٶ�");
		else if(age>=11&&age<=150)
			System.out.println(age+"����");
	}
	else System.out.println("�Ƿ���Ϣ");
	}
}