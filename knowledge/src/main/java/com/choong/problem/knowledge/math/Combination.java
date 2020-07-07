package com.choong.problem.knowledge.math;

import java.util.Arrays;

public class Combination {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] arr = { 1,2,3,4};
    int[] sel = new int[2];
    comb(arr, sel, 0, 0);
  }
  
  static void comb(int[] arr, int[] sel, int n, int k) {
    if ( k == sel.length) {
      System.out.println(Arrays.toString(sel));
      return;
    }
    
    if ( n == arr.length) {
      return;
    }
    
    sel[k] = arr[n];
    comb(arr, sel, n+1, k+1);
    comb(arr, sel, n+1, k);
  }

}
