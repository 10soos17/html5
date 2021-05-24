package p14.Date_Calendar;

import java.text.MessageFormat;

public class MessageFormatEx {

	public static void main(String[] args) {
		String tableName = "cust_info";
		String msg = "insert into" + tableName + "values(''{0}'', ''{1}'', ''{2}'',''{3}'');";
	
		Object[][] arguments = {
				{"홍길동","02-1234-1234","27","07-09"},
				{"알파고","031-1234-1234","30","10-07"}
		};
	
		//반복문을 통한 출력
		for(int i=0;i<arguments.length;i++) {
			
				String res = MessageFormat.format(msg,arguments[i]);
		
				System.out.println(res);


		}
	}

}
