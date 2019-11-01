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
public class CarPark {
    
    private Car[] cars;
    
    public CarPark(){
        cars = new Car[15];
    }
    
    public boolean carsParked(Car carin) {
        
        for (int i=0; i< cars.length; i++){
            if(cars[i] == null){
                cars[i] = carin;
                return true;
            }
            
        }
        return false;
    }
    
    public boolean removeCar(String reg){
        
        for(int i=0; i< cars.length; i++){
            if(cars[i] != null) {
                if( cars[i].getRegNum() == reg ) {
                    cars[i] = null;
                    return true;
                }
            }
        } 
        return false;
    }
    
    public int getEmptySpaces(){
        
        int count = 0;
        
        for(int i=0; i< cars.length; i++){
            if(cars[i]== null){
                count++;
            }
        }
        return count;
    }
    
    
    
}
