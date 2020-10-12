/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;



public class Lessons extends TimeTable{
    public String lessonsName; //unica
    public int size;
    
    public ArrayList<Exercises> exercise;
    
    public Lessons(){
        this.lessonsName = "";
        this.size = 0;
    }
    
    public Lessons(String lessonsName, int size){
        this.lessonsName = lessonsName;
        this.size = size;
        exercise = new ArrayList<>();
    }
    public String className(){
        return lessonsName;
    }
    public int getSize(){
        return size;
    }
    public void addExercise(Exercises exercise){
        exercises.add(exercise);
    }
    
    public void deleteExercise(Exercises exercise){
         exercises.remove(exercise);
    }
    
}
