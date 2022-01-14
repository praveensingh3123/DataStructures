package recursion;

import java.io.*;
import java.util.*;

public class GetKPCPattern {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String str = br.readLine();
	        ArrayList<String> words = getKPC(str);
	        System.out.println(words);
	    }
	    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	    public static ArrayList<String> getKPC(String str) {
	        if(str.length() == 0){
	            ArrayList<String> ret = new ArrayList<>();
	            ret.add("");
	            return ret;
	        }
	        
	        char ch = str.charAt(0);
	        String ros = str.substring(1);
	        ArrayList<String> res = getKPC(ros);
	        ArrayList<String> mres = new ArrayList<>();
	        String codech = codes[ch-'0'];
	        for(int i=0; i<codech.length();i++){
	            char chv = codech.charAt(i);
	            for(String r: res){
	                mres.add(chv + r);
	            }
	        }
	        return mres;
	    }
}
