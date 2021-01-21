import java.util.Observable;
import java.util.Observer;

public class ColorDisplay implements Observer, DisplayElement {

    Observable o;
    String color;
    int score;

    public ColorDisplay(Observable o) {
    
        this.o = o;
        o.addObserver(this);
    
    }

    public void update(Observable obs, Object arg) {
    
        if (obs instanceof Goat) {
        
            Goat g = (Goat) obs;
            this.score = g.getScore();
            display();
        
        }
    
    }

    public void display() {
    
        if (score < 500) {
            color = "Green";
            System.out.println("The new color scheme is " + color); }
        else if (score >= 500 && score < 900) {
            color = "Yellow";
            System.out.println("The new color scheme is " + color); }
        else {
            color = "Red";
            System.out.println("The new color scheme is " + color); }
 
    }

}
