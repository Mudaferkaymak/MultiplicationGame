
import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MÜDAFERKAYMAK
 */
public class Record {
    private int time;
    private String question;
    private String truth;
    private int questionNumber;
    private int exercise;
    private String name;
    private float totalTime;
    private float timeScore;
    private float correctScore;
    private float totalScore;
    private Date date;
    private int totalCorrect;

    public Record(int exercise, String name, Date date,int totalCorrect, float correctScore, float timeScore, float totalScore, float totalTime ) {
        this.exercise = exercise;
        this.name = name;
        this.totalTime = totalTime;
        this.timeScore = timeScore;
        this.correctScore = correctScore;
        this.totalScore = totalScore;
        this.date = date;
        this.totalCorrect = totalCorrect;
    }

    Record() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTruth() {
        return truth;
    }

    public void setTruth(String truth) {
        this.truth = truth;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public int getExercise() {
        return exercise;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public float getTimeScore() {
        return timeScore;
    }

    public void setTimeScore(int timeScore) {
        this.timeScore = timeScore;
    }

    public float getCorrectScore() {
        return correctScore;
    }

    public void setCorrectScore(int correctScore) {
        this.correctScore = correctScore;
    }

    public float getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalCorrect() {
        return totalCorrect;
    }

    public void setTotalCorrect(int totalCorrect) {
        this.totalCorrect = totalCorrect;
    }
    
    
}
