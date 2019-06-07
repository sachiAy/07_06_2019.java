import java.util.*;

public class q3{
	public static void main(String args[]){
	
		int x;
		
		Scanner obj3=new Scanner(System.in);
		
		x=obj3.nextInt();
		
		for(int i=1;i<11;i++){
			int y=x*i;
			System.out.println(x+"*"+i+"="+y);
		}
	}
}