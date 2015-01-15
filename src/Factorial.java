
public class Factorial {
	public static int Fac(int n){
		if(n==0){
			return 1;
		}
		else if(n==1){
			return 1;
		}
		return n*Fac(n-1);
	}
	
	public static void main(String[] args){
		System.out.println(Fac(3));
	}
}
