/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExportDataIntoCSVFile;

/**
 *
 * @author atrin
 */
public class Student {
    private int NIM;
    private String StudentName;
    private String StudyProgram;
    private String Departement;

    public Student(int NIM, String StudentName, String StudyProgram, String Departement) {
        this.NIM = NIM;
        this.StudentName = StudentName;
        this.StudyProgram = StudyProgram;
        this.Departement = Departement;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudyProgram() {
        return StudyProgram;
    }

    public void setStudyProgram(String StudyProgram) {
        this.StudyProgram = StudyProgram;
    }

    public String getDepartement() {
        return Departement;
    }

    public void setDepartement(String Departement) {
        this.Departement = Departement;
    }
}