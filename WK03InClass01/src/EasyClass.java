/**
 * Name: Bradley Wernick
 * Date: 2/4/2019
 * Explanation: EasyClass.java, WK03HW01
 */

public class EasyClass {
    private String name;
    private Integer count;
    private double score;

    public EasyClass(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public EasyClass(String name, Integer count, double score) {
        this.name = name;
        this.count = count;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
