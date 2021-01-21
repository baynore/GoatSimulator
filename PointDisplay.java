import java.util.Observable;
import java.util.Observer;

public class PointDisplay implements Observer, DisplayElement {

    Observable o;
    String name;
    int score;

    public PointDisplay(Observable o) {
    
        this.o = o;
        o.addObserver(this);
    
    }

    public void update(Observable obs, Object arg) {
    
        if (obs instanceof Goat) {
        
            Goat g = (Goat) obs;
            this.name = g.getName();
            this.score = g.getScore();
            display();
        
        }
    
    }

    public void display() {
    
        System.out.println(name + " ate something and now has " + score + " points");
    
    }
   

}
