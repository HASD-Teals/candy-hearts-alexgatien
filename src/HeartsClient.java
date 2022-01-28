
public class HeartsClient {
    public static void main(String[] args) throws Exception {
        Heart groupOneHeart = new Heart("red", 3, "Hi", 5, 50);
        Heart groupTwoHeart = new Heart("teal", 5, "Love CS-A", 4.5, 200);
        Heart groupThreeHeart = new Heart("green", 2, "Go Girl!", 3.5, 75);
        System.out.println(groupOneHeart.report());

        Heart[] store = { groupOneHeart, groupTwoHeart, groupThreeHeart };
        System.out.println(buyOut(store));
        store[0].adjStock(30);
        System.out.println(store[0].getStock());
        order(store, "teal");

    }

    public static int buyOut(Heart[] store) {
        int l = 0;
        for (int i = 0; i < store.length; i++) {
            l = l + store[i].getStock();
        }
        return l;
    }

    public static void order(Heart[] store, String color) {
        double finalCost = 0;
        for (int i = 0; i < store.length; i++) {
            if (store[i].getColor().equals(color)) {
                finalCost = finalCost + (double) (store[i].getStock() * store[i].getCostPerPound());
            }
        }
        System.out.print("The cost to buy all of the ");
        System.out.print(color);
        System.out.print(" candy is ");
        System.out.println(finalCost);
    }

}
