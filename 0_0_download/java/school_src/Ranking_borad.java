public class Ranking_borad {
    String name;
    double rank_avg;
    int rank;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRank_avg() {
        return rank_avg;
    }

    public void setRank_avg(double rank_avg) {
        this.rank_avg = rank_avg;
    }

    public Ranking_borad(String name, double rank_avg){
        this.name = name;
        this.rank_avg = rank_avg;
    }

}
