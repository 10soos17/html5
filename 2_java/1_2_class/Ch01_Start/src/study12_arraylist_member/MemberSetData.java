package study12_arraylist_member;

import java.util.ArrayList;
import java.util.List;

public class MemberSetData {
	MemberBean mbean;
	List<MemberBean> mbeanList = new ArrayList<MemberBean>();

//	public MemberSetData() {
//	}
//
//	public MemberSetData(MemberBean data) {
//		this.mbean = data;
//	}
//
//	public MemberSetData(List<MemberBean> data) {
//		for (MemberBean mbean : data) {
//			this.mbeanList.add(mbean);
//		}
//	}

	public MemberBean setData(String id, Integer pw, String name) {

		mbean = new MemberBean(id, pw, name);
		return this.mbean;
	}

	public List<MemberBean> setDatas(List<MemberBean> data) {

		for (MemberBean mbean : data) {
			this.mbeanList.add(mbean);
		}

		return this.mbeanList;
	}
}
