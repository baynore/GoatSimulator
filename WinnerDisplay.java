import java.util.Observable;
import java.util.Observer;

public class WinnerDisplay implements Observer, DisplayElement {

    Observable o;
    String name;
    int score;

    public WinnerDisplay(Observable o) {
    
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
        
        if (score > 1000) {
            System.out.println(name + " has won"); }
    }


}
