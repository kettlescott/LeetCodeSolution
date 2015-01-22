package com.scott.code;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="hi            this is a world";

		ReverseString.reverseAString(text);
		
		
	}
	
	private static class Node{
		Node next;
	}
	
	public static Node reverseSingleLinkedListRecursive(Node current , Node pre){
		Node next = current.next;		
		if (next == null){
		   	return current;
		}
		current.next = pre;
		
		return  reverseSingleLinkedListRecursive(next,current);
		
	}
	
	
	public static String reverseAString(String str){
		//reverse the whole sentence first
		
		char [] chs=str.toCharArray();
		
		doReverse(chs,0,chs.length-1);
		
		for (int i=0;i<chs.length;++i){
			int nextSpace=i;
			
			while (nextSpace<chs.length&&chs[nextSpace]!=' '){
				nextSpace++;
			}
			
			doReverse(chs,i,nextSpace-1);
			i=nextSpace;
			
		}
		
		
		
		
		
		return new String(chs);
	}
	
	
	
	
	public static void doReverse(char [] chs,int start, int end){
		for (int i=start,j=end;i<j;++i,--j){
			char tmp=chs[i];
			chs[i]=chs[j];
			chs [j]=tmp;
		}
		
		
		System.out.println(new String(chs));
	}

}
