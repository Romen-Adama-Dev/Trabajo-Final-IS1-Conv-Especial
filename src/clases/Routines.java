/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

public class Routines{
    public int serie;
    public int duration;
    public String routineName;
    public ArrayList<Exercises> exercises;
   
    public Routines (Integer serie, Integer duration, String routineName){
        this.routineName = routineName;
        this.serie = serie;
        this.duration = duration;
        exercises = new ArrayList<>();
        
    }
    
    public String routineName(){
        return routineName;
    }
    
    public int getSerie(){
        return serie;
    }
    
    public int getDuration(){
        return duration;
    }
    
    
    
}