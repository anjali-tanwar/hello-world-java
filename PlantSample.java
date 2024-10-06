public class PlantSample {
    public static void main(String[] args) {
        String msg = "Hello World";
        String oo = " I am Runner.";
        System.out.println(msg + oo + (5+10+20) + " " + 5+10+20);


        PlantParent plantParent = new PlantParent();
        plantParent.buyPlant("Foliage");
        plantParent.buyPlant("Fruit");
        plantParent.buyPlant("Vegetable");
    }
}

class PlantParent {
    public void buyPlant(String type) {
        System.out.println("Today I bought a new plant and type is " + type);
    }
}