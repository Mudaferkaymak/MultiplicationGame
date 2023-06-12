
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MÜDAFERKAYMAK
 */
public class settings implements Serializable{
     private int aMultStartPoint;
     private int aMultFinishPoint;
     private int bMultStartPoint;
     private int bMultFinishPoint;
     private int numberOfQuestion;
     private float maxSpeedScore;
     private float maxCorrectScore;
     private float maxTotalScore;
    private static final long serialVersionUID = -8686626538518655502L;
    public settings(int aMultStartPoint, int aMultFinishPoint, int bMultStartPoint, int bMultFinishPoint, int numberOfQuestion) {
        this.aMultStartPoint = aMultStartPoint;
        this.aMultFinishPoint = aMultFinishPoint;
        this.bMultStartPoint = bMultStartPoint;
        this.bMultFinishPoint = bMultFinishPoint;
        this.numberOfQuestion = numberOfQuestion;
        this.maxSpeedScore = 0;
        this.maxCorrectScore = 0;
        this.maxTotalScore = 0;
    }

    settings() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 



    public float getMaxSpeedScore() {
        return maxSpeedScore;
    }

    public void setMaxSpeedScore(float maxSpeedScore) {
        this.maxSpeedScore = maxSpeedScore;
    }

    public float getMaxCorrectScore() {
        return maxCorrectScore;
    }

    public void setMaxCorrectScore(float maxCorrectScore) {
        this.maxCorrectScore = maxCorrectScore;
    }

    public float getMaxTotalScore() {
        return maxTotalScore;
    }

    public void setMaxTotalScore(float maxTotalScore) {
        this.maxTotalScore = maxTotalScore;
    }



    public int getaMultStartPoint() {
        return aMultStartPoint;
    }

    public void setaMultStartPoint(int aMultStartPoint) {
        this.aMultStartPoint = aMultStartPoint;
    }

    public int getaMultFinishPoint() {
        return aMultFinishPoint;
    }

    public void setaMultFinishPoint(int aMultFinishPoint) {
        this.aMultFinishPoint = aMultFinishPoint;
    }

    public int getbMultStartPoint() {
        return bMultStartPoint;
    }

    public void setbMultStartPoint(int bMultStartPoint) {
        this.bMultStartPoint = bMultStartPoint;
    }

    public int getbMultFinishPoint() {
        return bMultFinishPoint;
    }

    public void setbMultFinishPoint(int bMultFinishPoint) {
        this.bMultFinishPoint = bMultFinishPoint;
    }

    public int getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public void setNumberOfQuestion(int numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }
     
     
     
     
     
     
}
