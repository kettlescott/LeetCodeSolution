package com.scott.code;

public class ExcelSheetColumnNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelSheetColumnNumber c= new ExcelSheetColumnNumber ();
		System.out.println(c.titleToNumber("GPJ"));
		System.out.println(c.convertToTitle(5158));
	}

    public int titleToNumber(String s) {
        int sum = 0 ;
        for ( char c : s.toCharArray()) {
        	sum = sum * 26 + (c - 'A' + 1);
        }
        return sum;
    }
    
    public String convertToTitle(int n) {	  	
   	 String result = "" ;
   	 while (n > 0) {
   		 result = ((char)(( n - 1) % 26 + 'A')) + result ;
   		 n = (n - 1) / 26 ;
   	 }		 
   	 return result ;
      }
	
}
