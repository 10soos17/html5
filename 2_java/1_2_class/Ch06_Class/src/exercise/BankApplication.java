package exercise;

import java.util.Scanner;

public class BankApplication {
	private static Account20 ac = new Account20("0","0",0);
	private static Account20[] accountArray = new Account20[100];
	private static Scanner sc = new Scanner(System.in);
	
	private static int count=0;
	private static String ano;
	private static String owner;
	private static int balance;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}

	
	//계좌 생성하기	
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성: ");
		System.out.println("---------");
		
		System.out.println("계좌번호: ");
		ano = sc.next();
		System.out.println("계좌주: ");
		owner = sc.next();
		System.out.println("초기입금액: ");
		balance = sc.nextInt();
		
		if(count < 100) {
			accountArray[count] = new Account20(ano, owner, balance);
			count+=1;
			System.out.println("계좌가 생성되었습니다.");
		}else {
			System.out.println("계좌를 생성할 수 없습니다.");			
		}
	}
	
	//계좌 목록보기
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록: ");
		System.out.println("---------");
		for(int i=0; i<count;i++) {
			System.out.println(accountArray[i]);
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금: ");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		
		ano = sc.next();
		ac = findAccount(ano);

		if(ac.getAno() !="0") {
			System.out.println("계좌주: "+ac.getOwner());
			System.out.print("예금액: ");
			
			balance = sc.nextInt();
			
			balance = ac.getBalance()+balance;
			ac.setBalance(balance);
			
			System.out.println("예금이 성공되었습니다.");
			System.out.println("잔액: "+ ac.getBalance());
		}else {
			System.out.println("없는 계좌번호입니다.");
		}
		
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금: ");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		
		ano = sc.next();
		ac = findAccount(ano);
		
		if(ac.getAno() !="0") {
			System.out.println("계좌주: "+ac.getOwner());
			System.out.print("출금액: ");
			balance = sc.nextInt();

			if(ac.getBalance()>=balance) {
				
				balance = ac.getBalance()-balance;
				ac.setBalance(balance);
				
				System.out.println("출금이 성공되었습니다.");
				System.out.println("잔액: "+ ac.getBalance());
			}else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("잔액: "+ ac.getBalance());
			}
		}else {
			System.out.println("없는 계좌번호입니다.");
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account20 findAccount(String ano) {
		for(int i=0;i<count;i++) {
			if(accountArray[i].getAno().equals(ano)) {
				ac = accountArray[i];
				break;
			}
		}
		return ac;
	}
}
