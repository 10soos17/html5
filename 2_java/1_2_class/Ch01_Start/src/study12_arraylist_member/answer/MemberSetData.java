package study12_arraylist_member.answer;

import java.util.ArrayList;
import java.util.List;

public class MemberSetData {

	public MemberBean setData() {

		MemberBean mbean = new MemberBean();
		mbean.setId("hong");
		mbean.setPw("1234");
		mbean.setName("홍길동");

		return mbean;
	}

	// List<MemberBean> list = new ArrayList<MemberBean>()
	public List<MemberBean> setDatas() {

		List<MemberBean> mbeanList = new ArrayList<MemberBean>();

		MemberBean mbean1 = new MemberBean();
		mbean1.setId("hong");
		mbean1.setPw("1234");
		mbean1.setName("홍길동");
		mbeanList.add(mbean1);

		MemberBean mbean2 = new MemberBean();
		mbean2.setId("admin");
		mbean2.setPw("2222");
		mbean2.setName("베타고");
		mbeanList.add(mbean2);

		return mbeanList;
	}
}
