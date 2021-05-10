import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean start = true;
        System.out.println("학생수를 입력해주세요.");
        St_information[] S1 = new St_information[sc.nextInt()];
        Ranking_borad[] R1 = new Ranking_borad[S1.length];

        Teacher t1 = new Teacher();

        while (start) {
            try {
                System.out.println("┌─────────────────────┐");
                System.out.println("   1. 학생 정보 입력");
                System.out.println("   2. 학생정보 검색");
                System.out.println("   3. 전체 학생 수 출력");
                System.out.println("   4. 반 평균 출력");
                System.out.println("   5. 반 명단 출력");
                System.out.println("   6. 반 석차");
                System.out.println("   7. 프로그램 종료");
                System.out.println("└─────────────────────┘");

                String choice_menu = sc.next();

                switch ( choice_menu ) {
                    case "1": {
                        t1.input_St_IF(S1);
                        break;
                    }
                    case "2": {
                        System.out.println(" 학생 번호를 입력해주세요. ");
                        int search_St = sc.nextInt();
                        try {
                            t1.Search_St_IF(S1,search_St);
                        }catch (NullPointerException e){
                            System.out.println("등록되어있지 않은 학번입니다.");
                            Thread.sleep(1000);
                        }

                        break;
                    }
                    case "3": {
                        System.out.println(" 전체 학생수는 < " + t1.St_ALL_Show(S1) + " > 명 입니다.");
                        Thread.sleep(2000);
                        break;
                    }
                    case "4":{
                        try {
                            System.out.println(" 반 평균 점수는 : " + t1.St_ALL_getAVG(S1) + " 입니다.");
                        }catch (NullPointerException e){
                            System.out.println("학생정보가 입력되어있지 않습니다.");

                        }

                        Thread.sleep(2000);
                        break;
                    }
                    case "5":{
                        try {
                            t1.St_get_ALLName(S1);
                        }catch (NullPointerException e){
                            System.out.println("학생정보가 입력되어있지 않습니다.");
                        }

                        Thread.sleep(2000);
                        break;
                    }
                    case "6":{
                        try {
                           t1.St_ranking(S1,R1);
                        }catch (NullPointerException e){
                            System.out.println("학생정보가 입력되어있지 않습니다.");
                        }
                        Thread.sleep(2000);
                        break;
                    }
                    case "7":{
                        start = false;
                        break;
                    }
                    default:{
                        System.out.println("메뉴를 정확히 골라주세요.");
                    }
                }
            } catch (Exception e) {
                System.out.println("오류발생.");

                continue;
            }
        }

    }
}
