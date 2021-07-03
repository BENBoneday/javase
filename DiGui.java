public class DiGui
{
	public static void main(String[] args){
		java.util.Scanner L = new java.util.Scanner(System.in);
		S.p("ÇëÊäÈë½×³ËÊı");
		int x = L.nextInt();
		int z= jieCheng(x);
		S.p(z);

	}
	/*public static int jieCheng(int y)
	{
					int Ji=1;
		for(int i=1;i<=y;i++){
		Ji *=i;

		}
		return Ji;
	}*/
public static int jieCheng(int y){
	if(y==1){
		return 1;
	}
	return y*jieCheng(y-1);
}


}
