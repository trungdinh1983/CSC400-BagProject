// =============== File: ExtendedBagDemo.java ===============
public class ExtendedBagDemo {
  public static void main(String[] args) {
    // Create first bag with fruits
    System.out.println("=== Creating first bag (fruits) ===");
    Bag<String> fruitBag = new Bag<>();
    fruitBag.add("apple");
    fruitBag.add("banana");
    fruitBag.add("apple"); // duplicate
    fruitBag.add("orange");
    fruitBag.add("apple"); // another duplicate

    System.out.println("First bag:");
    fruitBag.printBag();

    // Create second bag with more fruits
    System.out.println("=== Creating second bag (more fruits) ===");
    Bag<String> moreFruitBag = new Bag<>();
    moreFruitBag.add("banana");
    moreFruitBag.add("grape");
    moreFruitBag.add("grape"); // duplicate
    moreFruitBag.add("kiwi");

    System.out.println("Second bag:");
    moreFruitBag.printBag();

    // Test size method
    System.out.println("=== Testing size method ===");
    System.out.println("Size of first bag: " + fruitBag.size());
    System.out.println("Size of second bag: " + moreFruitBag.size());

    // Test merge method
    System.out.println("\n=== Testing merge method ===");
    fruitBag.merge(moreFruitBag);
    System.out.println("After merging second bag into first bag:");
    fruitBag.printBag();

    // Test distinct method
    System.out.println("=== Testing distinct method ===");
    Bag<String> distinctBag = fruitBag.distinct();
    System.out.println("Distinct elements from merged bag:");
    distinctBag.printBag();
  }
}