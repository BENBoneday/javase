import java.util.Random;
public class RandomTest {
    public static void main(String[] args) {
        Random random =new Random();

        int[] b=new int[5];
        for (int i= 0;i<5;i++) {
            int a = random.nextInt(6);
            for (int j=0;j<=i;j++){
                while (a==b[j]){
                    a=random.nextInt(6);


                }
               // b[i]=a;
               // System.out.println(b[i]);

            }
            b[i]=a;
           System.out.println(b[i]);

        }


        }
    }




