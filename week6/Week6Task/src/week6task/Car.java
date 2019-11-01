/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6task;

/**
 *
 * @author amednis21
 */
public class Car {
    
    private String reg;
    private String color;
    private String model;
    
    public Car(String regnumberin,String colorin, String modelin){
        
        reg = regnumberin;
        color = colorin;
        model = modelin;
    }
    
    public String getRegNum(){
        return reg;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getModel(){
        return model;
    }
    
    
}
