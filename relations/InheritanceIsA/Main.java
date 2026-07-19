package relations.InheritanceIsA;

public class Main {
    public static void main(String args[]){
        BuyOrder order1 = new BuyOrder();
        int order1Id = order1.getId();
        order1.processOrder(order1Id);
    }
}
