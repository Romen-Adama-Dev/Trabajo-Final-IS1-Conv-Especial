/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.ArrayList;

public class Trainer extends Admin{
    
    public Trainer(String name, String lastName, String phone, String email, String addres) {
        super(name, lastName, phone, email, addres);
    }
    public static ArrayList<Exercises> exercises;
    public static ArrayList<Lessons> lessons;
    public static ArrayList<Routines> routines;
    public ArrayList<Routines> clientRoutines;
    public ArrayList<Lessons> clientLessons;
    private String fileName;
    
    public Trainer(){
        clientRoutines = new ArrayList<Routines>();
        clientLessons = new ArrayList<Lessons>();
        routines = new ArrayList<Routines>();
        lessons = new ArrayList<Lessons>();
        exercises = new ArrayList<Exercises>();
        
    }   
}
