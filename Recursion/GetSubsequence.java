package recursion;

import java.util.*;

public class GetSubsequencePepCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		ArrayList<String> list = gss(str);
		System.out.println(list);

	}
	public static ArrayList<String> gss(String str){
		if(str.length() == 0) {
			ArrayList<String> ret = new ArrayList<>();
			ret.add("");
			return ret;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rres = gss(ros);
		ArrayList<String> mres = new ArrayList<>();
		for(String r:rres) {
			mres.add("" + r);
			mres.add(ch + r);
		}
		
		return mres;
	}

}
