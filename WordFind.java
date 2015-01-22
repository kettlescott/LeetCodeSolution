package com.scott.code;

import java.util.Iterator;

public class WordFind {

	
	public static void main(String[] args) {
           String [] grid ={"EASYTOFINDEAGSRVHOTCJYG",
        		            "FLVENKDHCESOXXXXFAGJKEO",
        		            "YHEDYNAIRQGIZECGXQLKDBI",
        		            "DEIJFKABAQSIHSNDLOMYJIN",
        		            "CKXINIMMNGRNSNRGIWQLWOG",
        		            "VOFQDROQGCWDKOUYRAFUCDO",
        		            "PFLXWTYKOITSURQJGEGSPGG"};	

           String [] wordList ={"GOING"};
           WordFind find = new WordFind();
           String [] coordinator = find.findWords(grid, wordList);
           System.out.print("{");
           for (String coor : coordinator){
        	   if ("".equals(coor)){
        		   System.out.print("\""+" "+"\""+",");
        	   }else{
        		   System.out.print("\"" +coor+"\""+",");
        	   }        	   
           }
           System.out.print("}");
           System.out.println();

	}
	
	
	public String [] findWords(String [] grid, String [] wordList){
		Trie t = new Trie();
		int numOfRow = grid.length;
		if (numOfRow==0){
			return new String[]{};
		}
		int numOfCol = grid[0].length();
		StringBuilder diagonal = new StringBuilder();
		StringBuilder down = new StringBuilder();
		
		for (int i = 0; i<numOfRow ;++i){
		  for (int j = 0 ;j<numOfCol ; ++j){
			  //horizontal;
			  t.addString(grid[i].substring(j)+" "+i+":"+j,i,j);
			  
			  int diagonalNum = j;
			  int moveDown = i;
			  //diagonal
			  while (moveDown<numOfRow&&diagonalNum<numOfCol){
				  diagonal.append(grid[moveDown++].charAt(diagonalNum++));
			  }
			  t.addString(diagonal.toString()+" "+i+": " + j,i,j);

			  //down
			  int row = i;
			  while (row< numOfRow){
				  down.append(grid[row++].charAt(j));
			  }
			  t.addString(down.toString()+" "+i+" : " + j,i,j);
			  diagonal.setLength(0);
			  down.setLength(0);  
		  }		
		}
		
		String [] coordinator = new String [wordList.length];
		
		int i = 0 ;
		while (i<wordList.length){
			coordinator[i] = t.find(wordList[i]);
			i++;
		}
		
		Iterator<String> it = t.keys().iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
 				
		return coordinator;
	}

}
