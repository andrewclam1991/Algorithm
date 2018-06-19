package com.andrewclam.ch1fundamentals.section05;

/**
 * Quick Union [Lazy approach]
 * Slightly improved version of {@link QuickFindUF}, where we attempt to
 * make the union operation faster.
 *
 * Imagine a forrest of trees,
 * Where each site contains the pointer reference to its parent site
 * and a root site have a self-reference , ex. if 6 is a root, its entry will be 6
 *
 * Overall complexity
 * constructor         union                find
 * --------------------------------------------------------
 * O(n)                O(tree height)       O(tree height)
 *
 * *worst case tree height == n, which would perform worst than {@link QuickFindUF}
 */
public class QuickUnionUF implements UF {
  private int count;
  private int[] id;

  /**
   * Constructor Initialization of the array entries
   * Complexity:
   * Space: O(n) linear
   * Time: O(n) linear time
   * where n is the size of array
   *
   * @param n the size or number of the entries
   */
  QuickUnionUF(int n) {
    count = n;
    id = new int[n];
    for (int i = 0; i < id.length; i++) { id[i] = i; }
  }

  /**
   * Complexity:
   * Space: O(1) constant, in-place
   * Time: O(n) linear time
   * where n is the size of the array {@link #id}
   *
   * @param p a site
   * @param q a site
   */
  @Override
  public void union(int p, int q) {
    int i = find(p);
    int j = find(q);
    id[i] = j; // perform union the root of p tree (i) to the root of q tree (j)
  }

  /**
   * Complexity:
   * Space: O(1), constant, in-place
   * Time: O(tree height), linear time
   * needs to chase parent pointers until root node references itself
   * potentially touching all other elements (n-1) within the array
   * worst case is where the tree is like a linked list (skinny tree)
   * where the tree height equals to n-1, number of elements less itself
   *
   * @param p a site
   * @return the root of the given site
   */
  @Override
  public int find(int p) {
    while (p != id[p]) { p = id[p]; }
    return p;
  }

  /**
   * Complexity:
   * Space: O(1), constant, in-place
   * Time: O(n), linear time
   * need to run {@link #find(int)} for both sites, 2n runtime
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
