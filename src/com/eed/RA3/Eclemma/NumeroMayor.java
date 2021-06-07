package com.eed.RA3.Eclemma;

public class NumeroMayor {

  public static int numeroMayor(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (c > b) {
      return c;
    } else {
      return b;
    }
  }
  public static void main (String []args) {
    numeroMayor(3,5,4);
    numeroMayor(3,4,5);
    numeroMayor(5,4,3);
    numeroMayor(2,1,3);  
    }

}
