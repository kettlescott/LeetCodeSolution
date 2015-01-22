package com.scott.code;

public class StringtoInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringtoInteger t = new StringtoInteger ();
		System.out.println(t.atoi("2147483648"));
		                           
	}

    public int atoi(String str) {
        int i = 0 ,sum = 0;
        while (i < str.length() && str.charAt(i) == ' ') ++i;
        int sign = 1;
        if (i < str.length() && str.charAt(i) == '+') {
        	i++;
        } else if (i < str.length() && str.charAt(i) == '-') {
        	sign = -1;
        	i++;
        }
        while (i < str.length() && Character.isDigit(str.charAt(i))) {        	
        	if (sum > Integer.MAX_VALUE / 10 || sum == Integer.MAX_VALUE / 10 && (str.charAt(i) - '0') >= 8){             		
        		return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        	}
        	sum = sum * 10 + (str.charAt(i) - '0');
        	i++;
        }
        return sign * sum ;   
    }
	
	
}
