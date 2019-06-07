import java.util.*;

public class q4{
	public static void main(String args[]){
		String a="* * * * * *";
		String b=" =============================";
		String c=" * * * * * ";
		String d="=========================================";
		
		for(int i=1;i<10;i++){
			if(i%2==0){
				System.out.println(c+b);
			}else{
				System.out.println(a+b);
			}
		}
		for(int j=1;j<7;j++){
			System.out.println(d);
		}
		
		
	}
}