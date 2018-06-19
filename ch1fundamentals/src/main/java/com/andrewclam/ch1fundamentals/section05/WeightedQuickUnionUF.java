package com.andrewclam.ch1fundamentals.section05;

/**
 * Weighted Quick Union
 * Improved version of {@link QuickUnionUF} where we address the
 * skinny tree problem by always choosing to attach the smaller tree to a larger tree
 * we can do that keeping track of the size of each tree.
 *
 * Overall complexity
 * constructor         union                   find
 * ------------------------------------------------------
 * O(n)                O(log(n))               O(log(n))
 */
public class WeightedQuickUnionUF implements UF {
  private int count;
  private int[] id;
  private int[] size;

  WeightedQuickUnionUF(int n){
    count = n;
    id = new int[n];
    for(int i = 0; i < id.length; i++) { id[i] = i; }
  }

  @Override
  public void union(int p, int q) {

  }

  @Override
  public int find(int p) {
    return 0;
  }

  @Override
  public boolean connected(int p, int q) {
    return find(p) == find(q);
  }

  @Override
  public int count() { return count; }
}
