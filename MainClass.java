public class MainClass
{
	public static void main(String[] args){
		TV haierTV = new TV();
		haierTV.setChannel(5);
		System.out.println("haierTV的频道是"+haierTV.getChannel());
		Familiy zhangSanFamiliy = new Familiy();
		zhangSanFamiliy.buyTV(haierTV);
		System.out.println("zhangSanFamiliy开始看电视节目");
		zhangSanFamiliy.seeTV();
		int m = 2;
		System.out.println("zhangSanFamiliy将电视节目换到"+m+"频道");
		zhangSanFamiliy.remoteControl(m);
		System.out.println("haierTV的频道是"+haierTV.getChannel());
		System.out.println("zhangSanFamiliy再看电视节目");
		zhangSanFamiliy.seeTV();
	}
}