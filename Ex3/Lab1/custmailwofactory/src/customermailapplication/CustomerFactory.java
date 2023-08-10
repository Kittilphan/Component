/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customermailapplication;

/**
 *
 * @author USER
 */
public class CustomerFactory {
    public static Customer createCustomer(String type){
        if(type.equals("Regular")){
            return new RegularCustomer();
        }else if(type.equals("Mountain")){
            return new MountainCustomer();
        }else if(type.equals("Delinquent")){
            return new DelinquentCustomer();
        }
        return null;
    }
}
