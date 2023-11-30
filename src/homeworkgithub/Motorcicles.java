/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkgithub;

/**
 *
 * @author User
 */
public class Motorcicles {
    
    String brand;
    String model;
    int numberWheels;
    int gasDeposit;
    
    public Motorcicles(String brand, String model, int numberWheels, int gasDeposit) {
        this.brand = brand;
        this.model = model;
        this.numberWheels = numberWheels;
        this.gasDeposit = gasDeposit;
    }
    
    public Motorcicles() {
        brand = "Mitsubishi";
        model = "Ninja 500";
        numberWheels = 2;
        gasDeposit = 12;
      
//    public void print(String direction) {
//        
//        System.out.println("The motorcicle" + brand + "model" + model + "with" + gasDeposit + "Lts in total is going" + direction);
//        
//        //another println method:
//        System.out.println(String.format("The %s %s is driving at %.0f degrees" ,brand, model,gasDeposit, direction));
//        
//        //Second form:
//        System.out.printf("The %s %s is driving at %.0f degrees" ,brand, model, gasDeposit, direction );
//   }
            System.out.println("The motorcicle" + brand + "model" + model + "with" + gasDeposit + "Lts in total is going");
            System.out.println(String.format("The %s %s is driving at %.0f degrees" ,brand, model,gasDeposit));
    }

    

    
    
}
