public class MainClass
{
	public static void main(String[] args){
		TV haierTV = new TV();
		haierTV.setChannel(5);
		System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
		Familiy zhangSanFamiliy = new Familiy();
		zhangSanFamiliy.buyTV(haierTV);
		System.out.println("zhangSanFamiliy��ʼ�����ӽ�Ŀ");
		zhangSanFamiliy.seeTV();
		int m = 2;
		System.out.println("zhangSanFamiliy�����ӽ�Ŀ����"+m+"Ƶ��");
		zhangSanFamiliy.remoteControl(m);
		System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
		System.out.println("zhangSanFamiliy�ٿ����ӽ�Ŀ");
		zhangSanFamiliy.seeTV();
	}
}