public class Number
{
	public static void main(String[] args){
		
		java.util.Scanner L = new java.util.Scanner(System.in);
		System.out.println("����һ��1~99999֮�����");
		int x = L.nextInt();
		int a = 0,b= 0;
		if(x<1||x>99999){
			System.out.println("������Χ");
		}
		else{
			if(x/10==0){
				System.out.println(x+"��1λ��");
				System.out.println(x+"�ǻ�����");
			}
			else if(x/100==0){
				System.out.println(x+"��2λ��");
				
				if((x/10)==(x-(x/10)*10)){
				System.out.println(x+"�ǻ�����");	
				}else{System.out.println(x+"���ǻ�����");}
			}
			else if(x/1000==0){
				System.out.println(x+"��3λ��");
				if((x/100)==(x%10)){
				System.out.println(x+"�ǻ�����");	
				}else{System.out.println(x+"���ǻ�����");}		
			}
			else if(x/10000==0){
				System.out.println(x+"��4λ��");
				if((x/1000)==(x%10)&&((x%100)/10)==(x%1000)/100){
				System.out.println(x+"�ǻ�����");	
				}else{System.out.println(x+"���ǻ�����");}	
				
			}
			else if(x/100000==0){
				System.out.println(x+"��5λ��");
				if((x/10000)==(x%10)&&((x%10000)/1000)==(x%100)/10)
				System.out.println(x+"�ǻ�����");	
				}else{System.out.println(x+"���ǻ�����");}
				}
		}
	         
	        
	}

