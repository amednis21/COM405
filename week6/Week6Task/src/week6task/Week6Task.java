/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6task;


import java.util.Scanner;
/**
 *
 * @author amednis21
 */
public class Week6Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int state=1;
        
        CarPark carp = new CarPark();
        Scanner scanIn = new Scanner(System.in);
                
        System.out.println("Welcome to Pepega's Car Park!!!");
        System.out.println();
                        
        while(state==1){
            
            System.out.println("Please select one of the following options:");
            System.out.println();
            System.out.println("A – Add a car");
            System.out.println("B – Remove a car");
            System.out.println("C – View number of free spaces/number of cars in the car park");
            System.out.println("X – Quit");
            System.out.println();
            
            String userinput = scanIn.nextLine();
            System.out.println();
            
            if( userinput.equals("a") || userinput.equals("A") ){
                
                System.out.println("You have chosen A");
                System.out.println("Please enter a reg number:");
                String reg= scanIn.nextLine();
                System.out.println("Please enter the color of your car:");
                String color = scanIn.nextLine();
                System.out.println("Please add your car model:");
                String model = scanIn.nextLine();
                System.out.println();
                
                if( carp.carsParked(new Car (reg,color,model))){
                    System.out.println("Car has been added.");
                }
                else {
                    System.out.println("Unfortunatelly,carpark is full");
                }
            
            }
            else if( userinput.equals("b") || userinput.equals("B") )  {
                
                System.out.println("You have chosen B");
                System.out.println("Please enter a reg number");
                String reg = scanIn.nextLine();
                
                if( carp.removeCar(reg)){
                    System.out.println("Car sucsessfully removed");
                    System.out.println();
                }
                else {
                    System.out.println("Car not found");
                    System.out.println();
                }
            }
            else if( userinput.equals("c") || userinput.equals("C") ) {
                
                System.out.println("Empty spaces on parking: " + carp.getEmptySpaces());
            }
            else if( userinput.equals("x") || userinput.equals("X") ) {
                state = 0;
                System.out.println("Thank you for using our service, user");
                System.out.println("Goodbye and have a nice day!");
            }
            else{
                System.out.println("-------ERROR------- Invalid input.");
                System.out.println("");
                
            }
            
        }
        
        scanIn.close();
        
    }
    
}
