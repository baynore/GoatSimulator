import java.util.Observable;

public class Goat extends Observable {

    String name;
    int score;

    public Goat() {
        
        score = 0;
    
    }

    public String getName() {
       
        return name;
    
    }

    public int getScore() {
    
        return score;
    
    }
    
    public void setName(String name) {
        
        this.name = name;
    
    }
    
    public void setScore(int score) {
    
        this.score = score;
    
    }

    public void addPoints(int points) {
        
        if (points > 0) {
            
            score += points;
            setChanged();
            notifyObservers();
        
        }
    }
}
