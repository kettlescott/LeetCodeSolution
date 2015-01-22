package com.scott.code;

public class SearchBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
       System.out.println("We dont need no education".substring(13));
	}
	
	
	
	
	public int find(String text, String search, String wholeWord, int start){
		Trie t = new Trie();
		text = text.substring(start);
		boolean flag=false;;
        for (String word : text.split("\\s")){
        	t.addString(word);
        	flag=t.findFirstOccurance(search, wholeWord);
        	if (flag){
        		break;
        	}
        }
  
		if (flag){
			return 0;
		}
		return -1;
	}

}
