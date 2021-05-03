package pj_read;

import java.io.File;
import java.util.Scanner;

public class Read {
	
	public static void main(String[] args) throws Exception {


	}
	
	public void readFile_binToChar() throws Exception{

		Scanner sc = new Scanner(new File("/Users/soos/Desktop/rwBin.txt")); // 경로
		
		while(sc.hasNext()) { // 읽을 것이 남아 있을 때까지.
			String[] binArr= sc.next().split(":");//32bit 끊기 
			
			binarytoChar(binArr);

		}
	}

	public void binarytoChar(String[] binArr) {
			
		int i =0;
		String str = "";
			
		while(binArr.length > i) {
			
			Integer StoI = Integer.parseInt(binArr[i], 2);
			int Itoi = (int) StoI;
			char Itoc = (char) Itoi;
			
			str += Itoc;
			
			i++;
		}
		System.out.println(str);
	}

}