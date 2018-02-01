import Present.Sweets;
import Present.Mars;
import Present.Twix;

public class Present {
    public static void main(String[] args){
        Mars mars1 = new Mars("mars1", 54, 5.75,"black");
        Mars mars2;
        mars2 = new Mars("mars2", 54, 5.75,"whight");
        Twix twix1;
        twix1 = new Twix("twix1", 47, 6.01, 2);
        Twix twix2 = new Twix();
        twix2.setCount(4);
        twix2.setName("twix2");
        twix2.setPrice(10.85);
        twix2.setWeight(92);
        Sweets [] box = {mars1,twix1,twix2,mars2,mars1,twix1};
        double allw = 0L;
        double allp = 0L;
        System.out.println("Our sweets: ");
        for (Sweets sw: box) {
            System.out.println(sw.toString());
            allw +=sw.getWeight();
            allp +=sw.getPrice();
        }
        System.out.println("Weight of sweets: " + allw);
        System.out.println("Cost of sweets: " + allp);
    }
}

