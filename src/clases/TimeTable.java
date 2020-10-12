/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;


public class TimeTable extends Trainer{
    
    public void addRoutine(Routines routine){
        clientRoutines.add(routine);
    }
    
    public void deleteRoutine(Routines routine){
        clientRoutines.remove(routine);
    }
    
    public void addLessons(Lessons lessons){
        clientLessons.add(lessons);
    }
    
    public void deleteLessons(Lessons lessons){
        clientLessons.remove(lessons);
    }
    
    public void newExercise (String exerciseName){
        Exercises newExercise = new Exercises (exerciseName);
        exercises.add(newExercise);
    }
    
    public void deleteExercise (Exercises exercise){
        exercises.remove(exercise);
    }
    
    public void newRoutine(Integer serie, Integer duration, String routineName){
        Routines newRoutine = new Routines(serie, duration, routineName);
        routines.add(newRoutine);
    }
    
    public void deleteRoutineTrainer(Routines routine){
        routines.remove(routine);
    }
    
    public void newLesson(String lessonName, int size){
        Lessons newLesson = new Lessons (lessonName, size);
        lessons.add(newLesson);
    }
    
    public void deleteLesson(Lessons lesson){
        lessons.remove(lesson);
    }

    public void addLessons(ArrayList<Lessons> lessons) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addRoutine(ArrayList<Routines> routine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
