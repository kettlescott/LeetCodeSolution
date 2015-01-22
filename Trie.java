package com.scott.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Trie {

    private Node root;

	public static void main(String[] args) {
//		Trie trie = new Trie();
//		trie.addString("java");
//		trie.addString("javt");
//		trie.addString("comput");
//
//		Iterator<String> it = trie.keysWithPrefix("c").iterator();
//	    while(it.hasNext()){
//	    	System.out.println(it.next());
//	    }
	    
//		trie.addString("comput");
//		trie.addString("cater");
////		boolean flag = trie.isMatched("caterer");
////		System.out.println(flag);
////		trie.commonPrefix();
//		System.out.println(trie.recommend("caterer"));
////		System.out.println(trie.isMatched("rub"));
//		System.out.println(5%2);
		
//		int num;
//		boolean isPrime = true;
//		num = 14;
//		for(int i=2; i <= num/2; i++) {
//			if((num % i) == 0) {
//			isPrime = false;
//			break;
//			}
//			}
//		
//			if(isPrime) System.out.println("Prime");
//			else System.out.println("Not Prime");
	
//		   char [] txt = {'a' ,'b' , 'c'};
//		   for (int i =2 ; i>=0;--i){
//			   System.out.print(txt[i]);
//		   }
//		   
//		   System.out.println();       
		
		
		for(int i=0;i<3;++i){
		 for(int j=i;j<3;++j){
			System.out.print(".");
		}
		    System.out.println();
		}
		
	}
	
	public Trie(){
		root = new Node (' ');
	}
	
	
	public void addString(String word){
		Node current = root;
		for (int i = 0 ; i<word.length() ;++i){
			if (current.subNodes[word.charAt(i)]==null){
				current.subNodes[word.charAt(i)] = new Node (word.charAt(i));
				current.size++;
				current.subNodes[word.charAt(i)].parent = current;
				
			}
			current = current.subNodes[word.charAt(i)];
			
		}
		current.isFull = true;
	}
	
	public void addString(String word ,int row, int col){
		Node current = root;
		for (int i = 0 ; i<word.length() ;++i){
			if (current.subNodes[word.charAt(i)]==null){
				current.subNodes[word.charAt(i)] = new Node (word.charAt(i));
				if ( current.subNodes[word.charAt(i)].row > row || current.subNodes[word.charAt(i)].row==row &&  current.subNodes[word.charAt(i)].col>col){
					current.subNodes[word.charAt(i)].row = row;
	            	current.subNodes[word.charAt(i)].col = col;	
				}				 
				current.size++;
				current.subNodes[word.charAt(i)].parent = current;				
			}
			current = current.subNodes[word.charAt(i)];
		}
    }
	
	public Node addString(Node current,String word,int deep){
		if (current == null){
			current = new Node (word.charAt(deep));
		}
		if (word.length() == deep){
			current.isFull = true;
			return current;
		}
		current.subNodes[word.charAt(deep)] = addString(current.subNodes[word.charAt(deep)],word, ++deep);
		return current;
	}
	public boolean isMatched(String target){
		Node current = root;
		char [] chs = target.toCharArray();
		for (int i =0 ; i<chs.length ;++i){
		   if (current.subNodes[chs[i]]!=null){
			   current = current.subNodes[chs[i]];
		   }else{
			   return false;
		   }
		}
		return current.isFull;
	}
	
	public String find(String word){
		Node current = root;
		boolean flag = true;
		char [] chs = word.toCharArray();
		for (int i =0 ; i<chs.length ;++i){
		   if (current.subNodes[chs[i]]!=null){
			   current = current.subNodes[chs[i]];
		   }else{
			   flag= false;
			   break;
		   }
		}
		if(flag){
			System.out.println(root.subNodes[word.charAt(0)].col);
		}
		
		return "";
	}
	
	
	private static class Node {
		public char c ;
		public boolean isFull;
		public int size;
		public Node parent;
		public Node [] subNodes = new Node [256];
		public int row;
		public int col;
		
		public Node (char c){
			this.c = c;
		}
	}
	
	public Iterable<String> keys(){
		return keysWithPrefix(""); 
	}
	
	
	public Iterable<String> keysWithPrefix(String pre){
		Node current = root;
		Queue<String> q = new LinkedList<String>();
		char [] chs = pre.toCharArray();
		for (int i = 0 ; i<chs.length ;++i){
			current = current.subNodes[chs[i]];
		}		
		collect (current,pre,q);
		return q;		
	}
	
	private void collect(Node node,String pre,Queue<String> queue){
		if (node.size==0){
			queue.add(pre);	
			return;
		}
		for (int i = 0 ; i<256;++i){
			if (node.subNodes[i]!=null){
				collect(node.subNodes[i],pre+(char)i,queue);					
			}			
		}		
	}
	
	
	public String recommend(String word){
		Node current = root;
		StringBuilder sb = new StringBuilder();
		char [] chs = word.toCharArray();
		for (int i = 0 ; i<chs.length;++i){
			if (current.subNodes[chs[i]]!=null){
				current = current.subNodes[chs[i]];
				sb.append(chs[i]);
			}else{
				break;
			}
		}
		
		return sb.toString();
		
	}
	
	public void commonPrefix(){
		Node node = dfs(root, 0);
//		System.out.println(node.c);
		printCommonPrefix(node);
	}
	
	private void printCommonPrefix(Node node){
		if (node.c!=' '){
			printCommonPrefix(node.parent);
		}
		System.out.print(node.c);
	}
	
	
	private Node dfs(Node node, int deep){
		int max =-1;
	    Node Deepnode = node;
	    if (node.size<1){
	    	return node.parent;
	    }
	    for (int i = 0 ;i<node.subNodes.length;++i){
	    	if (node.subNodes[i]!=null){
	    		Node sub = node.subNodes[i];
	    		Node tmp = dfs(sub,deep+1);
	    		if (deep>max){
	    			max = deep;
	    			Deepnode = tmp;
	    		}
	    	}
	    }
	    return Deepnode;
	}
	
	
	public boolean findFirstOccurance(String pattern, String wholeWord){
		Node current = root;
		char [] chs = pattern.toCharArray();
		for (int i =0 ; i<chs.length ;++i){
		   if (current.subNodes[chs[i]]!=null){
			   current = current.subNodes[chs[i]];
		   }else{
			   return false;
		   }
		}
		
		if ("Y".equals(wholeWord)){
			return current.isFull;
		}else{
			return true;
		}
	}

}
