import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Teacher {
    int same_avg_Count = 0;


    public void Search_St_IF(St_information[] St, int num) throws InterruptedException {
        int check = 0;

                System.out.println(" < "+(num) + " > 번 학생");
                St_IF_Show(St[num-1]);
                check = 1;


        if(check == 0){
            System.out.println(" 일치하는 정보가 없습니다.");
        }
        check =0;
    }

    public void St_ranking(St_information[] St, Ranking_borad[] R1){
        Ranking_borad temp = null;

        for (int i = 0; i < St.length; i++) {
            R1[i] = new Ranking_borad(St[i].getName(), get_avg(St[i]));
        }
        for (int i = 0; i < St.length; i++) {
            for (int j = i+1; j < St.length; j++) {
                double dmy = R1[i].getRank_avg();
                double dmy2 = R1[j].getRank_avg();

                if ( dmy < dmy2 ){

                    temp = R1[i];
                    R1[i] = R1[j];
                    R1[j] = temp;

                }else if( dmy == dmy2 ){

                    temp = R1[i];
                    R1[i] = R1[j];
                    R1[j] = temp;
                    same_avg_Count++;

                }
            }

        }
        //석차입력
        for (int i = 0; i <  R1.length; i++) {
            if(i==0){
                R1[i].rank = (i+1);
            }else if(i!=0 && R1[i].rank_avg == R1[i-1].rank_avg){
                R1[i].rank = R1[i-1].rank;
            }else if(i!=0 && R1[i].rank_avg != R1[i-1].rank_avg){
                R1[i].rank = R1[i-1].rank+1;
            }
        }

        //석차출력
        for (int i = 0; i < R1.length; i++){
            System.out.println(R1[i].getRank()+" 등" +R1[i].getName() + " 점수 : " + R1[i].getRank_avg());
        }

    }

    public void St_get_ALLName(St_information[] St){

        for (int i = 0; i < St.length; i++) {
            System.out.println((i+1)+" 번 "+St[i].getName());
        }
    }

    public double St_ALL_getAVG(St_information[] St){
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < St.length; i++) {
            sum += get_avg(St[i]);
        }
        avg = sum / St.length;

        return avg;
    }

    public int St_ALL_Show(St_information[] St){
        return St.length;
    }

    public void St_IF_Show(St_information St){
        
        System.out.println("학생이름 : " + St.getName());
        System.out.println("국어점수 : " + St.getKor());
        System.out.println("수학점수 : " + St.getMath());
        System.out.println("영어점수 : " + St.getEng());
        System.out.println(" 총점 : " + get_sum(St));
        System.out.println(" 평균 : " + String.format("%.3f",get_avg(St)));
        System.out.println("--------------------------");

    }

    public void input_St_IF(St_information[] St){
        int kor = 0;
        int math = 0;
        int eng = 0;
        Scanner sc = new Scanner(System.in);

        String null_testing = null;

        for (int i = 0; i < St.length; i++) {

                System.out.print((i + 1) + "번째 학생이름을 입력해주세요 : ");
                String name = sc.next();

                System.out.println("국어, 영어, 수학 순서로 점수를 입력해주세요.");
                kor = sc.nextInt();
                math = sc.nextInt();
                eng = sc.nextInt();

                St[i] = new St_information(name, kor, math, eng);
        }

    }

    public int get_sum(St_information st){

        int sum = (st.kor + st.math + st.eng);

        return sum;
    }

    public double get_avg(St_information st){

        double avg =( (double) (st.kor + st.math + st.eng) / 3) ;

        return avg;
    }

}
