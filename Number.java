public class Number
{
	public static void main(String[] args){
		
		java.util.Scanner L = new java.util.Scanner(System.in);
		System.out.println("输入一个1~99999之间的数");
		int x = L.nextInt();
		int a = 0,b= 0;
		if(x<1||x>99999){
			System.out.println("超出范围");
		}
		else{
			if(x/10==0){
				System.out.println(x+"是1位数");
				System.out.println(x+"是回文数");
			}
			else if(x/100==0){
				System.out.println(x+"是2位数");
				
				if((x/10)==(x-(x/10)*10)){
				System.out.println(x+"是回文数");	
				}else{System.out.println(x+"不是回文数");}
			}
			else if(x/1000==0){
				System.out.println(x+"是3位数");
				if((x/100)==(x%10)){
				System.out.println(x+"是回文数");	
				}else{System.out.println(x+"不是回文数");}		
			}
			else if(x/10000==0){
				System.out.println(x+"是4位数");
				if((x/1000)==(x%10)&&((x%100)/10)==(x%1000)/100){
				System.out.println(x+"是回文数");	
				}else{System.out.println(x+"不是回文数");}	
				
			}
			else if(x/100000==0){
				System.out.println(x+"是5位数");
				if((x/10000)==(x%10)&&((x%10000)/1000)==(x%100)/10)
				System.out.println(x+"是回文数");	
				}else{System.out.println(x+"不是回文数");}
				}
		}
	         
	        
	}

