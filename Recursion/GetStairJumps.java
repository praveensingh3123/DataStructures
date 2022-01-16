package recursion;

import java.util.*;

public class Stepjumps3steps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 4;
		ArrayList<String> ans = jump(n);
		System.out.println(ans);
	}
	public static ArrayList<String> jump(int n) {
		if(n==0) {
			ArrayList<String> ss = new ArrayList<>();
			ss.add("");
			return ss;
		}if(n<0) {
			ArrayList<String> ss = new ArrayList<>();
			return ss;
		}
		ArrayList<String> nm1 = jump(n-1);
		ArrayList<String> nm2 = jump(n-2);
		ArrayList<String> nm3 = jump(n-3);
		ArrayList<String> ans = new ArrayList<>();
		
		for(String s: nm1) {
			ans.add(1 + s);
		}
		for(String s: nm2) {
			ans.add(2 + s);
		}
		for(String s: nm3) {
			ans.add(3 + s);
		}
		return ans;
		
	}

}
