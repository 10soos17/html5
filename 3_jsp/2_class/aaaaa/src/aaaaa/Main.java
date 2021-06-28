package aaaaa;

import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.util.*;

//https://blog.naver.com/s001lec
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//연령 숫자 - 정제...
		//마체중 - 정제...
		//장비... 정제... 합치기...
		System.out.println("진행중...");
		BufferedReader br = Files.newBufferedReader(Paths.get("/Users/soos/Desktop/git/lecture/lecture_choongang/3_jsp/2_class/temp/test.csv"));
		
		String line = "";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:ee"; 
		Connection conn = DriverManager.getConnection(url,"scott","scott");
		Statement stm = conn.createStatement();
		
		
		int exceptionCount = 0;
		
		
		
		while((line = br.readLine()) != null){
            //CSV 1행을 저장하는 리스트
            List<String> tmpList = new ArrayList<String>();
            //String array[] = line.split(",",19);
            String array[] = line.split(",",-1);
            //배열에서 리스트 반환
            //System.out.println(array[16]);
            //System.out.println(array.length);
            
            
            if(array.length > 19) {
            	
            	for(int i = 17 ; i < array.length - 2 ; i++) {
            		array[16] += array[i]; 
            	}
            	
            	array[16] = array[16].substring(1, array[16].length()-1);
            	System.out.println(array[16]);
            	array[17] = array[array.length - 2];
            	array[18] = array[array.length - 1];
            }
            
            //System.out.println(array[13]);
            
            //16 .. 장비
            //17 .. 날짜..
            //18 .. 경기 번호...
            
            
            String query = String.format("INSERT INTO Matchresult VALUES(%s,%s,'%s','%s','%s',%s,%s,'%s','%s','%s','%s','%s',%s,%s,%s,'%s','%s',%s)",
            		array[1],
            		array[2],
            		array[3],
            		array[4],
            		array[5],
            		array[6].charAt(0),
            		array[7],
            		array[8],
            		array[9],
            		array[10],
            		array[11],
            		array[12],
            		array[13].substring(0, 3),
            		array[14],
            		array[15],
            		array[16],
            		array[17],
            		array[18]
            		);
            
    		//DB연동...
            try {
            	stm.executeUpdate(query);
            }catch(Exception e) {
        		exceptionCount++;
            }
        }
		
		stm.close();
		conn.close();

		
		System.out.println("예외 개수 : " + exceptionCount);
		System.out.println("입력 완료...");
		

	}

}
