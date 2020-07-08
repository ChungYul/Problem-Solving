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
    comb(arr, sel, n+1, k+1); // n-1Ck-1 ( n-1개 중에 k-1개를 뽑는 경우 )
    comb(arr, sel, n+1, k); // n-1Ck (n-1개 중에 k개를 뽑는 경우 )
  }

}
