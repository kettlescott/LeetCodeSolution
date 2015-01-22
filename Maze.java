package com.scott.leetcode;

public class Maze {


	String [] [] maze =  {{"S","#","#","#","#","#"},
			              {".",".",".",".",".","#"},
			              {"#",".","#","#","#","#"},
			              {"#",".","#","#","#","#"},
			              {".",".",".","#",".","#"},
			              {"#","#","G",".",".","#"},
	};          
	boolean bFound ;
	
	int [][] memory = new int [maze.length][maze[0].length];
	
	public static void main(String[] args) {
       Maze maze = new Maze();
       maze.printPath();

	}
	
	
	public Maze(){	
		boolean [][] unvisited = new boolean [maze.length][maze[0].length];
		bFound = doFind(memory,0,0,"G",unvisited);
		
	}
	
	private  void printMaze(int [][] memory){
	   int row = memory.length;
	   int col = memory[0].length;
	   for (int i = 0;i<row ;++i){
		   for (int j = 0 ;j<col ;++j){
			  if (memory[i][j]==1){
				  System.out.print(memory[i][j]);
			  }else{
				  System.out.print(" ");
			  }
		   }
		   System.out.println();
	   }
	   
	}
	
   private boolean isOutSide(int x ,int y){
	   return x<0||x>=maze.length||y<0||y>=maze[0].length;
   }
   
   

   
   private boolean isNotOpen(int x ,int y){
	   return "#".equals(maze[x][y]);
   }
   
   public void printPath(){
      if (bFound){
    	  printMaze(memory);
      }else{
    	  System.out.println("cannot find a path to the destination");
      }
   }
   
   private boolean doFind(int [][] memory,int x, int y, String value,boolean [][] unvisited){
	   if (isOutSide(x,y)){	 
		   return false;
	   } else if (value.equals(maze[x][y])){
		   memory[x][y] = 1;
		   return true;
	   } else if (isNotOpen(x,y)){		   
		   return false;
	   }else{
		   
		   //go to north
		   if (!unvisited[x][y]){
			   memory[x][y] = 1;
			   unvisited [x][y] = true;
			   if (doFind(memory,x , y-1,value,unvisited)){		    	 
			    	 return true;
			     }
			     
			     //go to east
			     if (doFind(memory,x+1 , y,value,unvisited)){
			    	 return true;
			     } 
			     
			   //go to south  
			     if (doFind(memory,x , y+1,value,unvisited)){
			    	 
			    	 return true;
			     }
			   // go to west
			     if (doFind(memory,x-1, y,value,unvisited)){
			    	 return true;
			     }  
			     memory[x][y] = 0;
			     return false;  
			     
		   }else{			   
			   return false;   
		   }
		     
		     
	   }
   }

}
