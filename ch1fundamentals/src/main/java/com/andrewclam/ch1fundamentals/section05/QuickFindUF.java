package com.andrewclam.ch1fundamentals.section05;

/**
 * Quick find UF implementation of a Union-Find API
 * This implementation enforces uses the site-indexed array to store the
 * left root component
 */
public class QuickFindUF implements UF {
  private int[] id;

  /**
   * Number of component(s) within the sites that are disjointed
   * When this number is 0, this means there is a path from any site to
   * any other site within the array.
   * This number is initialized to the size of the site array, since each site
   * is only connected to itself at first.
   */
  private int count;

  QuickFindUF(int n) {
    // initialize the component id array
    count = n;
    id = new int[n];
    for (int i : id) { id[i] = i; }
  }

  /**
   * Complexity:
   * Space: Not applicable
   * Time: O(n), requires a loop touching each element to check
   *
   * @param p a site
   * @param q a site
   */
  @Override
  public void union(int p, int q) {
    int pId = find(p); // get the root component id of p
    int qId = find(q); // get the root component id of q
    if (pId == qId) { /* Already connected, do nothing*/ return; } else {
      /*
       * Not connected, we need to change all component value
       * to one of the root ids, for consistency, we will check for pId (left)
       * and join (merge,union) with the qId (right), this choice is arbitrary.
       * Note: this is expensive:
       */

      for (int i : id) {
        // Too expensive, it checks every component value that matches the pId,
        // if so, change it to the right
        if (id[i] == pId) id[i] = qId;
      }

      // after union, two component merges into one, so
      // decrement one component from the overall count
      count--;
    }
  }

  /**
   * Complexity:
   * Space: Not applicable
   * Time: O(1), very fast lookup
   *
   * @param p a site
   * @return the component (root) id of the given site
   */
  @Override
  public int find(int p) { return id[p]; }

  /**
   * Complexity:
   * Space: Not applicable
   * Time: O(1), dependent on {@link #find(int)} implementation
   *
   * @param p a site
   * @param q a site
   * @return whether the two sites are connected
   */
  @Override
  public boolean connected(int p, int q) {
    return find(p) == find(q);
  }

  @Override
  public int count() { return count; }
}
