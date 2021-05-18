package p05.anonymous.localvariable;

public class Anonymous {

	private int field;

	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		field = 10;
//		arg1 = 100;//고정상수이므로 변경 불가 
//		arg2 = 100;//
//		var1 = 200;//고정상수이므로 변경 불가 
//		var2 = 200;//

		// 익명 구현 객체: 파라미터 변수나 일반 변수는 값 변경 불가 
		Calculatable c = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}

		};
		System.out.println(c.sum());
	}

}
