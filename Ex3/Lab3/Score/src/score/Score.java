/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package score;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Score {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String loop = null;
        Scanner sc = new Scanner(System.in);
        Barcelona team1 = new Barcelona();
        RealMadrid team2 = new RealMadrid();
        Data data = new Data();
        data.register(team1);              
	data.register(team2);   
        
        while(!"".equals(loop)) {
            if(loop != null) {
               data.setSomeData(loop);
            }
            System.out.printf("Enter Score ");
            loop = sc.nextLine();
        }
    }        
}
