
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
   */
  public void add(T item) {
    if (item == null) {
      throw new IllegalArgumentException("Cannot add null item to bag");
    }
    elements.put(item, count(item) + 1);
  }

  /**
   * Remove one copy of an item from the bag
   */
  public void remove(T item) {
    if (item == null) {
      throw new IllegalArgumentException("Cannot remove null item from bag");
    }
    if (contains(item)) {
      int currentCount = count(item);
      if (currentCount == 1) {
        elements.remove(item);
      } else {
        elements.put(item, currentCount - 1);
      }
    }
  }

  /**
   * Check if item exists in bag
   */
  public boolean contains(T item) {
    if (item == null) {
      throw new IllegalArgumentException("Cannot check for null item in bag");
    }
    return elements.containsKey(item);
  }

  /**
   * Count how many times an item appears
   */
  public int count(T item) {
    if (item == null) {
      throw new IllegalArgumentException("Cannot count null item in bag");
    }
    return elements.getOrDefault(item, 0);
  }

  /**
   * Get total number of elements in bag (including duplicates)
   */
  public int size() {
    int totalSize = 0;
    for (int count : elements.values()) {
      totalSize += count;
    }
    return totalSize;
  }

  /**
   * Merge another bag into this one
   */
  public void merge(Bag<T> otherBag) {
    if (otherBag == null) {
      throw new IllegalArgumentException("Cannot merge with null bag");
    }
    // Add all elements from other bag
    for (Map.Entry<T, Integer> entry : otherBag.elements.entrySet()) {
      T item = entry.getKey();
      int otherCount = entry.getValue();
      // Add to current count
      elements.put(item, count(item) + otherCount);
    }
  }

  /**
   * Create new bag with only distinct elements (count of 1 for each)
   */
  public Bag<T> distinct() {
    Bag<T> distinctBag = new Bag<>();
    // Add each element exactly once
    for (T item : elements.keySet()) {
      distinctBag.add(item);
    }
    return distinctBag;
  }

  /**
   * Print all items and their counts
   */
  public void printBag() {
    System.out.println("Bag contents (size: " + size() + "):");
    for (Map.Entry<T, Integer> entry : elements.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
    }
    System.out.println();
  }
}