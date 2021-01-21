
public class GoatSimulator {

    public static void main(String[] args) {

        Goat g1 = new Goat();
        Goat g2 = new Goat(); 
        
        ImageDisplay id1 = new ImageDisplay(g1);
        ImageDisplay id2 = new ImageDisplay(g2);

        PointDisplay pd1 = new PointDisplay(g1);
        PointDisplay pd2 = new PointDisplay(g2);

        ColorDisplay cd1 = new ColorDisplay(g1);
        ColorDisplay cd2 = new ColorDisplay(g2);

        WinnerDisplay wd1 = new WinnerDisplay(g1);
        WinnerDisplay wd2 = new WinnerDisplay(g2); 

        g1.setName("Edward");
        g2.setName("Alphonse");

        g1.addPoints(20);
        g2.addPoints(40);
        g1.addPoints(10);
        g2.addPoints(30);
        g1.addPoints(30);
        g2.addPoints(50);
        g1.addPoints(40);
        g2.addPoints(100);
        g1.addPoints(20);
        g2.addPoints(60);
        g1.addPoints(40);
        g2.addPoints(100);
        g1.addPoints(100);
        g2.addPoints(200);
        g1.addPoints(150);
        g2.addPoints(300);
        g1.addPoints(300);
        g2.addPoints(200);
        g1.addPoints(200);
        g2.addPoints(50);
  

    }
}
