package footlab;

import java.util.Scanner;

public class FootShape {

    private Foot shape;
    public void getShape(String shapeType) {
        switch(shapeType) {
            case "Eclipse":
                shape = drawAsEclipse();
                break;
            case "Rectangle":
                shape = drawAsRectangle();
                break;
        }
    }
    public String drawShape() {
        return shape.draw();
    }
    
    public Foot drawAsEclipse() {
        Eclipse e = new Eclipse();
        return  e;
    }
    public Foot drawAsRectangle() {
        Rectangle r = new Rectangle();
        return  r;
    }
    
    public static void main(String[] args) {
        FootShape app = new FootShape();
        Scanner sc = new Scanner(System.in);
        System.out.print("What to draw? 1. Eclipse, 2. Rectangle ");
        int type = sc.nextInt();
        switch(type) {
            case 1:
                app.getShape("Eclipse");
                break;
            case 2:
                app.getShape("Rectangle");
                break;  
        }
        System.out.println(app.drawShape());        
    }
}
