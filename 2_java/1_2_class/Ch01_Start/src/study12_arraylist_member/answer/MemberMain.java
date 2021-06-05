package study12_arraylist_member.answer;

public class MemberMain {

	public static void main(String[] args) {

		MemberSetData mSet = new MemberSetData();
		MemberPrint mPrint = new MemberPrint();

		mPrint.printData(mSet.setData());
		mPrint.printDatas(mSet.setDatas());
		mPrint.printDatasGeneric(mSet.setDatas());

	}

}
