public class Book1
{
	public static void main(String[] args){
		Book s1= new Book();
	
		s1.setTitle("sasasa");
		s1.setPageNum(66);
        int x =s1. getPageNum();
		if(x<200){
			System.out.println("wrong");
			s1.setPageNum(200);
		}
		s1.detail();
	}
}
class Book
{
	private String title;
	private int pageNum;
	
	public String getTitle(){
		return title;
	}
public int getPageNum(){
		return pageNum;
	}
	public void setTitle(String s){
		
		title=s;
	}
public void setPageNum(int n){
	   
		pageNum=n;
	}
	public    void detail(){
		System.out.println(getTitle());
		System.out.println(getPageNum());
	}
}