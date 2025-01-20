// =============== File: BagDemo.java ===============
/**
 * Demo program showing how to use the Bag class
 */
public class BagDemo {
  public static void main(String[] args) {
    // Create new bag to hold strings
    Bag<String> fruitBag = new Bag<>();

    // Test 1: Adding items
    System.out.println("=== Adding fruits to bag ===");
    fruitBag.add("apple");
    fruitBag.add("banana");
    fruitBag.add("apple"); // Adding second apple
    fruitBag.add("orange");
    fruitBag.add("apple"); // Adding third apple

    // Show what's in the bag
    fruitBag.printBag();

    // Test 2: Checking if items exist
    System.out.println("=== Testing contains method ===");
    System.out.println("Contains apple? " + fruitBag.contains("apple"));
    System.out.println("Contains grape? " + fruitBag.contains("grape"));

    // Test 3: Counting items
    System.out.println("\n=== Testing count method ===");
    System.out.println("Count of apple: " + fruitBag.count("apple"));
    System.out.println("Count of banana: " + fruitBag.count("banana"));

    // Test 4: Removing items
    System.out.println("\n=== Removing one apple ===");
    fruitBag.remove("apple");

    // Show updated contents
    fruitBag.printBag();

    // Test 5: Check contains and count after removal
    System.out.println("Contains apple after removal? " + fruitBag.contains("apple"));
    System.out.println("Count of apple after removal: " + fruitBag.count("apple"));
  }
}