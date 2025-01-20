
// =============== File: Bag.java ===============
import java.util.HashMap;
import java.util.Map;

/**
 * A bag (multiset) implementation that allows duplicates
 * T can be any type (String, Integer, etc.)
 */
public class Bag<T> {
  // Store items and how many times each appears
  private Map<T, Integer> elements;

  // Create new empty bag
  public Bag() {
    elements = new HashMap<>();
  }

  /**
   * Add one item to the bag
   * Example: bag.add("apple")
   */
  public void add(T item) {
    // Get current count (or 0 if not found) and add 1
    elements.put(item, count(item) + 1);
  }

  /**
   * Remove one copy of an item from the bag
   * Example: bag.remove("apple")
   */
  public void remove(T item) {
    if (contains(item)) {
      int currentCount = count(item);
      if (currentCount == 1) {
        // Last one - remove completely
        elements.remove(item);
      } else {
        // Reduce count by 1
        elements.put(item, currentCount - 1);
      }
    }
  }

  /**
   * Check if item exists in bag
   * Example: if (bag.contains("apple"))
   */
  public boolean contains(T item) {
    return elements.containsKey(item);
  }

  /**
   * Count how many times an item appears
   * Example: int appleCount = bag.count("apple")
   */
  public int count(T item) {
    return elements.getOrDefault(item, 0);
  }

  /**
   * Print all items and their counts
   * Example: bag.printBag()
   */
  public void printBag() {
    System.out.println("Bag contents:");
    for (Map.Entry<T, Integer> entry : elements.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
    }
    System.out.println();
  }
}
