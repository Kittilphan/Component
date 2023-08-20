package scoreEvent;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        String loop = null;
        Scanner sc = new Scanner(System.in);
        team1 t1 = new team1();
        team2 t2 = new team2();
        Source source = new Source();
        source.addObserver(t1);              
	source.addObserver(t2);   
        
        while(!"".equals(loop)) {
            if(loop != null) {
               source.setSomedata(loop);
            }
            System.out.printf("Enter Score ");
            loop = sc.nextLine();
        }
    }        
}
