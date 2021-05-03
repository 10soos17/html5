package pj_read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Write {
	
	String text;
	
	public static void main(String[] args) throws Exception {
		
		//String text = "Hello java! \nBye java~";//test text
		
		Write w = new Write();

		w.text = w.loadFile();
		w.toBinaryString(w.text);
		
		Read f = new Read();

		f.readFile_binToChar();

	}
	
	public String loadFile() throws FileNotFoundException {
		
		text = "";
		Scanner sc = new Scanner(new File("/Users/soos/Desktop/read.txt")); // 경로
		
		while(sc.hasNext()) { // 읽을 것이 남아 있을 때까지.
			text += sc.next();

		}
		//System.out.println(text);
		return text;
	}

	public void writeFile_charToBin(ArrayList<String> binArr) throws Exception{
		
		Writer wf = new FileWriter("/Users/soos/Desktop/rwBin.txt");

		int i = 0;
		
		
		while(binArr.size() > i) {

			wf.write(binArr.get(i));
			//System.out.println(binArr.get(i));
			i++;
		}

		wf.flush();
		wf.close();
		
		}
	
	public void toBinaryString(String text) throws Exception {
		//bit string 만들기
		System.out.println(text.length());
		
		ArrayList<String> binArr = new ArrayList<String>();
		
		int one = 0;
		int i = 0;
		
		while(text.length() > i) {
			
			one = text.charAt(i);
			String str = Integer.toBinaryString(one);
			
			while(str.length() < 32) {
				str = "0" + str;
			}
			str += ":";
			binArr.add(str);
			//System.out.println(str);
			i++;
		}
		
		writeFile_charToBin(binArr);
	}
}
