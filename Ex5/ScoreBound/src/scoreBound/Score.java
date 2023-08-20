package scoreBound;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        String loop = null;
        Scanner sc = new Scanner(System.in);
        team1 t1 = new team1();
        team2 t2 = new team2();
        Data data = new Data();
        data.addPropertyChangeListener(t1);              
	data.addPropertyChangeListener(t2);   
        
        while(!"".equals(loop)) {
            if(loop != null) {
               data.setString(loop);
            }
            System.out.printf("Enter Score ");
            loop = sc.nextLine();
        }
    }        
}
