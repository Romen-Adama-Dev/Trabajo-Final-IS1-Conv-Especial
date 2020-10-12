/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public class Exercises {
    
    public String exerciseName;
    
    public Exercises(String exercise){
        this.exerciseName = exercise;
    }

    public Exercises() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String exerciseName(){
        return exerciseName;
    }
}
