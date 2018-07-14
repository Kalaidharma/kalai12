import java.util.Scanner;
public class Sum {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			sum=i+sum;
		}	
			System.out.println(sum);
		

}
}
