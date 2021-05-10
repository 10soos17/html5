public class St_information {
    String name;
    int kor;
    int eng;
    int math;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public St_information(String name, int kor, int math, int eng){
        this.name = name;
        this.eng = eng;
        this.kor = kor;
        this.math = math;
    }
}
