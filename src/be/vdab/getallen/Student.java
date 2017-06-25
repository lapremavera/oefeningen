package be.vdab.getallen;

public class Student {

    private int gradeNumber= 0;
    private String naamStudent = "John";

    public Student (String naamStudent){
        this.naamStudent= naamStudent;
    }

    public Student(int gradeNumber, String naamStudent) {
        this.gradeNumber = gradeNumber;
        this.naamStudent = naamStudent;
    }

    public int getGradeNumber() {
        return gradeNumber;
    }

    public void setGradeNumber(int gradeNumber) {
        this.gradeNumber = gradeNumber;
    }

    public String getNaamStudent() {
        return naamStudent;
    }

    public void setNaamStudent(String naamStudent) {
        this.naamStudent = naamStudent;
    }
}
