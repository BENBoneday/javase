class MobileShop
{
	InnerPurchaseMoney  purchaseMoney1;
	InnerPurchaseMoney  purchaseMoney2;

private int mobileAmount;
MobileShop(){
	purchaseMoney1=new InnerPurchaseMoney(20000);
	purchaseMoney2=new InnerPurchaseMoney(10000);
}
void setMobileAmount(int m){
	mobileAmount = m;
}
int getMobileAmount(){
	return mobileAmount ;
}
class InnerPurchaseMoney
{
	int moneyValue;
	InnerPurchaseMoney(int m){
		moneyValue = m;
	}
	void buyMobile(){
		if(moneyValue>=20000){
			mobileAmount = mobileAmount -6;
			System.out.println("�ü�ֵ"+moneyValue+"���ڲ�����ȯ����6���ֻ�");
		}
		else if(moneyValue<20000&&moneyValue>=10000){
			mobileAmount = mobileAmount-3;
			System.out.println("�ü�ֵ"+moneyValue+"���ڲ�����ȯ����3���ֻ�");
		}
	}
}}
public class NewYear
{
	public static void main(String[] args){
		MobileShop shop = new MobileShop();
		shop.setMobileAmount(30);
		System.out.println("�ֻ�ר����Ŀǰ��"+shop.getMobileAmount()+"���ֻ�");
		shop.purchaseMoney1.buyMobile();
		shop.purchaseMoney2.buyMobile();
		System.out.println("�ֻ�ר����Ŀǰ��"+shop.getMobileAmount()+"���ֻ�");
	}
}