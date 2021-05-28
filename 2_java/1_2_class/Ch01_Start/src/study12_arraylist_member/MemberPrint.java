package study12_arraylist_member;

import java.util.List;

public class MemberPrint {

	public void printData(MemberBean mbean) {
		System.out.println(mbean);
		// System.out.println(mbean.id + mbean.pw + mbean.name);
	}

	public void printDatas(List<MemberBean> list) {

		for (Object mbean : list) {
			if (mbean instanceof MemberBean) {
				System.out.println(mbean);

			}
			// System.out.println(mbean);
		}
	}

	public void printDatasGeneric(List<MemberBean> list) {
		for (Object mbean : list) {
			System.out.println(mbean);

		}
	}
}
