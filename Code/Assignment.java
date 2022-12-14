package com.nabil;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1
{
 public static void main(String args[])
 {
  int n;
  int startTime,endTime,profit;
  int maxProfit = 0;
  int jobsLeft = 0;
  int earning = 0;
  int total = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your jobs");
  n = sc.nextInt();  
  int job[][] = new int[n][3];
  int temp[][] = new int[n][3];
  for(int i=0;i<n;i++)
  {
   startTime = sc.nextInt();
   endTime = sc.nextInt();
   profit = sc.nextInt();
   total = total+profit;
   job[i][0] = startTime;
   job[i][1] = endTime;
   job[i][2] = profit;
   temp[i][0] = startTime;
   temp[i][1] = endTime;
   temp[i][2] = profit;
  }
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n-1;j++)
   {
    if(temp[j][1] > temp[j+1][1] )
    {
     int t = temp[j][1];
     temp[j][1] = temp[j+1][1];
     temp[j+1][1] = t;
     t = temp[j][2];
     temp[j][2] = temp[j+1][2];
     temp[j+1][2] = t;
     t = temp[j][0];
     temp[j][0] = temp[j+1][0];
     temp[j+1][0] = t;
    }
   }
  }
  int lt = -1;
  for(int i=0;i<n;i++)
  {
   if(temp[i][0] >= lt)
   {
	  maxProfit = maxProfit +temp[i][2];
    lt = temp[i][1];
   }
   else
   {
	   jobsLeft++;
    earning =earning+ temp[i][2];
   }
  }
  int result[] = new int[2];
  result[0] = n-jobsLeft;
  result[1] = total-earning;
  System.out.println(Arrays.toString(result));
  
 }
}
