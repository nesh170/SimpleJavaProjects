
public class PowerN {
	
	public static int power(int base, int exp){
		if(exp==0){
			return 1;
		}
		else if (exp==1){
			return base;
		}
		else{
			return base*power(base,exp-1);
		}
	}
	
	public static void main(String[] args){
		System.out.println(power(3,4));
	}
}
