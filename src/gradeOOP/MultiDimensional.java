package gradeOOP;

import java.util.Scanner;

public class MultiDimensional {
    private String name;
    private int korean;
    private int english;
    private int math;
    private double avg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
    public void createAvg() {
        this.avg = (double) (korean + english + math) / 3;
    }
    public double getAvg() {
        return this.avg;
    }


}
