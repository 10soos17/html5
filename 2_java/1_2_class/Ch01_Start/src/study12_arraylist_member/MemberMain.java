package study12_arraylist_member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		MemberBean mbean;
		
		MemberSetData mSet = new MemberSetData();
		MemberPrint mPrint = new MemberPrint();
		
		List<MemberBean> data = Arrays.asList(new MemberBean("hong", 1234, "홍길동"), new MemberBean("abcd", 3333, "이순신"));
		mbean = mSet.setData("hong", 1234, "홍길동");
		data = mSet.setDatas(data);
		
		mPrint.printData(mbean);
		mPrint.printDatas(data);
		
	}

}
