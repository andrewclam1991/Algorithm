package com.andrewclam.ch1fundamentals.section05;

/**
 * Union-Find API
 * Each site begins as its own components, because it is connected to itself.
 * ex for an array of [1,2,3,5,6,7]
 * a set of connected sites are represented as a component {},
 * such that if 1,2,3 are connected, it is represented as a single {1,2,3} component
 *
 * Every implementation has to
 * - Define a data structure to represent the known connections.
 * - Develop efficient union(), find(), connected() and count() implementations that are
 * based on that data structure
 *
 * Example Impl:
 * - Uses site-indexed array id[] as basic data structure
 */
public interface UF {

  /**
   * Union operation merges two components if thw two sites are in different components
   * @param p a site
   * @param q a site
   */
  void union(int p, int q);

  /**
   * @param p a site
   * @return an integer component id of a given site
   */
  int find(int p);

  /**
   * @param p a site
   * @param q a site
   * @return flag that determines whether two sites are in the same component
   * Note: when p == q, sites are the same, by definition returns true.
   */
  boolean connected(int p, int q);

  /**
   * @return the number of components, or groups of sites that are connected.
   */
  int count();
}
