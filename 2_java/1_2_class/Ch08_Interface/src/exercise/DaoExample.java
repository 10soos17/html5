package exercise;
//DAO(Data Access Object): DB에 접근하기 위한 메소드들이 들어있는 곳 
public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		DaoExample d = new DaoExample();

		OracleDao ora = new OracleDao();
		d.dbWork(ora);
		d.dbWork(new MySqlDao());
		
		// dbWork(new OracleDao());
		// dbWork(new MySqlDao());
		
		//익명구현객체 
		DataAccessObject dao = new DataAccessObject() {
			@Override
			public void select() {
				System.out.println("Anonymous DB에서 검색");
			}

			@Override
			public void insert() {
				System.out.println("Anonymous DB에서 삽입");
			}

			@Override
			public void update() {
				System.out.println("Anonymous DB에서 수정");
			}

			@Override
			public void delete() {
				System.out.println("Anonymous DB에서 삭제");
			}
		};
		
		//익명구현객체 값을 parameter에 바로 넣기 
		d.dbWork(new DataAccessObject() {
			@Override
			public void select() {
				System.out.println("Oracle DB에서 검색");
			}

			@Override
			public void insert() {
				System.out.println("Oracle DB에서 삽입");
			}

			@Override
			public void update() {
				System.out.println("Oracle DB에서 수정");
			}

			@Override
			public void delete() {
				System.out.println("Oracle DB에서 삭제");
			}
		});

	}

}
