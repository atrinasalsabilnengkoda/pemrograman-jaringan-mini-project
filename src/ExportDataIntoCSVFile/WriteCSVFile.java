/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExportDataIntoCSVFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author atrin
 */
public class WriteCSVFile {    
//Delimiters which has to be in the CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String LINE_SEPARATOR = "\n";
    
    //File header
    private static final String HEADER = "NIM,StudentName,StudyProgram,Departement";
    
    public static void main(String args[])
    {
    	//Creating Employee objects
    	Student std1 = new Student(184129221,"Atrina Salsabil Nengkoda","Teknik Informatika","Teknologi Informasi");
    	Student std2 = new Student(185149541,"Chrissabel Olivia","Administrasi Bisnis","Administrasi Niaga");
    	Student std3 = new Student(186122366,"Cicilia Stefani","Keuangan","Akuntansi");
    	Student std4 = new Student(187123231,"Muhammad Wisam Naufal","Teknik Sipil","Teknik Sipil");
    	Student std5 = new Student(188129335,"Ian Wahyu Ananto","Teknik Elektronika","Teknik Elektro");
    	
    	//Add Employee objects to a list
    	List stdList = new ArrayList();
    	stdList.add(std1);
    	stdList.add(std2);
    	stdList.add(std3);
    	stdList.add(std4);
    	stdList.add(std5);
    	
    	FileWriter fileWriter = null;
    	
    	try{
            fileWriter = new FileWriter("Student.csv");
            
            //Adding the header
            fileWriter.append(HEADER);	

            //New Line after the header
            fileWriter.append(LINE_SEPARATOR);

            //Iterate the empList
            Iterator it = stdList.iterator();
            
            while(it.hasNext()){
                Student std = (Student)it.next();
                fileWriter.append(String.valueOf(std.getNIM()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(std.getStudentName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(std.getStudyProgram());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(std.getDepartement()));
                fileWriter.append(LINE_SEPARATOR);
            }
            System.out.println("Write to CSV file Succeeded!!!");
    	}catch(Exception ee){
            ee.printStackTrace();
    	}finally{
            try{
                fileWriter.close();
            }catch(IOException ie){
                System.out.println("Error occured while closing the fileWriter");
    		ie.printStackTrace();
            }
    	}
    }
}