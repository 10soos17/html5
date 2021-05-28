package study12_arraylist_member;

import java.util.Arrays;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		MemberBean mbean;
		
		MemberSetData mSet = new MemberSetData();
		MemberPrint mPrint = new MemberPrint();
		
		mbean = mSet.setData("hong", 1234, "홍길동");
		
		List data = Arrays.asList("test",new MemberBean("hong", 1234, "홍길동"), new MemberBean("abcd", 3333, "이순신"));
	
		List<MemberBean> data1 = Arrays.asList(new MemberBean("hong", 1234, "홍길동"), new MemberBean("abcd", 3333, "이순신"));
		data = mSet.setDatas(data1);
		
		mPrint.printData(mbean);
		mPrint.printDatas(data);
		mPrint.printDatasGeneric(data1);
		
	}

}
