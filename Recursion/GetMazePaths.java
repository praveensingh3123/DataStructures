package recursion;

import java.util.*;

public class GetMazePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int m = 2;
		ArrayList<String> ll = getMazePaths(0,0,n-1,m-1);
		System.out.println(ll);

	}
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr ==dr && sc==dc){
            ArrayList<String> p = new ArrayList<>();
            p.add("");
            return p;
            
        }
        if(sr>dr ||sc>dc){
            ArrayList<String> p = new ArrayList<>();
            return p;
        }
        ArrayList<String> paths = new ArrayList<>();
            
        for(int i =1; i<= dc-sc; i++){
            ArrayList<String> hpaths = getMazePaths(sr, sc + i, dr, dc);
            for(String hpath : hpaths){
                paths.add("h" + i + hpath);
            }
        }
        for(int i =1; i<= dr-sr; i++){
            ArrayList<String> vpaths = getMazePaths(sr+i, sc, dr, dc);
            for(String vpath : vpaths){
                paths.add("v" + i + vpath);
            }
        }
        for(int i =1; i<= dr-sr && i<= dc-sc; i++){
            ArrayList<String> dpaths = getMazePaths(sr+i, sc + i, dr, dc);
            for(String dpath : dpaths){
                paths.add("d" + i + dpath);
            }
        }
        return paths;
    }

}
