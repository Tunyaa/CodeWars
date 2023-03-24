

package com.mycompany.greed;


public class Greed{
  public static int greedy(int[] dice){
    int[][] points = {{100, 1000}, {0, 200}, {0, 300}, {0, 400}, {50, 500}, {0, 600}};
    int count;
    int totalPoints = 0;
      for(int j = 1; j != 7; j++){
        count = 0;
            for(int i = 0; i != dice.length; i++){//
              if(j==dice[i]) count++;
              if(count==3){
                totalPoints += points[j-1][1];
                count = 0;
              }
            }
        totalPoints += count * points[j-1][0];
      }
    return totalPoints;
  }
}
