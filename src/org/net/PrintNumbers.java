package org.net;

public class PrintNumbers {
	    public static void main(String[] args) {
	        int rows = 7;
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            for (int k = i + 1; k <= rows; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
