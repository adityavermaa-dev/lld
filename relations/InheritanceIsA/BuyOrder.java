package relations.InheritanceIsA;

public class BuyOrder extends Order{
    int getId(){
        return (int)(Math.floor(Math.random()*10 + 1));
    }
}
