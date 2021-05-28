package study12_arraylist_member;

import java.util.List;

public class MemberPrint {

	public void printData(MemberBean mbean) {
		System.out.println(mbean);
		// System.out.println(mbean.id + mbean.pw + mbean.name);
	}

	public void printDatas(List<MemberBean> list) {
		System.out.println("* printDatas *");
		for (int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void printDatasGeneric(List<MemberBean> list) {
		System.out.println("*** printDatasGeneric ***");
		for (MemberBean mbean : list) {
			System.out.println(mbean);

		}
	}
}
