package com.choong.problem.knowledge.algorithm.dynamic;

import java.util.stream.IntStream;

/**
 * 
 * @title	: Overlapping Subproblems Property in Dynamic Programming 
 * @author	: CHOONG
 * @Desc	: GeeksforGeeks Dynamic Programming Lesson 1
 * @Url     : https://www.geeksforgeeks.org/overlapping-subproblems-property-in-dynamic-programming-dp-1/
 *
 */

public class Fibonacci {

  final int MAX = 100;
  final int NIL = -1;

  int[] lookup;

  public void initialize() {
    this.lookup = new int[MAX];
    IntStream.range(0, MAX).forEach(i -> lookup[i] = NIL);
  }

  public int fibonacciWithMemorization(int n) {
    if (n <= 1) {
      lookup[n] = n;
    } else if (lookup[n] != NIL) {
      return lookup[n];
    } else {
      lookup[n] = fibonacciWithMemorization(n - 1) + fibonacciWithMemorization(n - 2);
    }
    return lookup[n];
  }
  
  public int finbonacciWithBottomUp(int n) {
    int f[] = new int[n+1];
    
    f[0] = 0;
    f[1] = 1;
    
    for(int i=2; i <=n; i++ ) {
      f[i] = f[i-1] + f[i-2];
    }
    
    return f[n];
  }

}
