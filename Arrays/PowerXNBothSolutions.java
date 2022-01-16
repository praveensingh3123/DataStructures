package arraysLB;

public class PowerXNBothSolutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x= 2.000;
		int n = 10;
		double ans = iterativePower(x,n);
		System.out.println(ans);

	}
	public static double iterativePower(double x, int n) {
        double ans =1.0;
        long nn = n;
        if(n<0){
            nn = -nn;   
        }
        while(nn>0){
            if(nn%2 == 1){
                ans *= x;
                nn = nn-1;
            }else{
                x = x*x;
                nn = nn/2;
            }
        }
        if(n<0) ans = (double)1.0/(double)ans;
        return ans;
    }
	//recursive solution
	public double myPow(double x, int n) {
        if(n>=0){
            return positive(x,n);
        }else{
            return negative(x,n);
        }
    }
    double positive(double x, int n){
        if(n== 0){
            return 1;
        }
        double op = myPow(x, n/2);
        if(n%2 == 0){
            return op*op;
        }else{
            return x*op*op;
        }
    }
    double negative(double x, int n){
        if(n== -1){
            return 1/x;
        }
        double op = myPow(x, n/2);
        if(n%2 == 0){
            return op*op;
        }else{
            return (1/x)*op*op;
        }
    }
}
