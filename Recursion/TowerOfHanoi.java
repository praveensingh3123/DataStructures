package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		toh(n, 10, 11, 12);
	}
	public static void toh(int n, int start, int end, int helper) {
		if(n==0)return;
		toh(n-1, start, helper, end);
		System.out.println(n + "[" + start + " -> " + end + "]");
		toh(n-1, helper, end, start);
	}

}
