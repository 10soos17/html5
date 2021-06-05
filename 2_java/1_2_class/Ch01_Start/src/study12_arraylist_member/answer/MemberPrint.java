package study12_arraylist_member.answer;

import java.util.List;

public class MemberPrint {

	public void printData(MemberBean mbean) {
		System.out.println("ID: " + mbean.getId());
		System.out.println("PW: " + mbean.getPw());
		System.out.println("NAME: " + mbean.getName());
	}

	// List<MemberBean> list = new ArrayList<MemberBean>()
	public void printDatas(List<MemberBean> list) {// for
		System.out.println("* printDatas *");
		for (int i = 0; i < list.size(); i++) {
			printData(list.get(i));
		}
	}

	public void printDatasGeneric(List<MemberBean> list) {// Advanced for
		System.out.println("*** printDatasGeneric ***");
		for (MemberBean mbean : list) {
			printData(mbean);
		}
	}
}
