package com.bridglabz;

public class SumOfThreeNum {
    public static void main(String[] args) {
        int[] array={1,2,-4,-8,2,4,1,5,9};
        boolean flag=false;
        for(int i=0;i< array.length-2;i++){
            for(int j=i+1;j<array.length-1;j++){
                for(int k=j+1;k<array.length;k++){
                    if(array[i]+array[j]+array[k]==0)
                    System.out.println(array[i]+ "," +array[j]+","+array[k]+"==0");
                    flag=true;
                }
            }
        }
        if(flag=false){
            System.out.println("combination is not match");

        }
    }
}
