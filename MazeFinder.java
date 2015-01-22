package com.scott.code;

import java.util.Stack;

public class MazeFinder {

	
	static private class Point{
		
		int x;
		int y;
		boolean isPath;
		
		public Point(int x , int y){
			this.x = x ;
			this.y = y ;
		}
		
	}
	
	
	String [] [] maze =  {{"S","#","#","#","#","#"},
            {".",".",".",".",".","#"},
            {".",".","#","#","#","#"},
            {"#",".","#","#","#","#"},
            {".",".",".","#",".","#"},
            {"#","#",".",".",".","G"},
};  
	
	Stack<Point> stack = new Stack<Point>();
	
	public static void main(String[] args) {
		MazeFinder finder = new MazeFinder();
		finder.findPath("G", 0, 0);
	}
	
	
	private boolean isOutSide(Point point){
		   return point.x<0||point.x>=maze.length||point.y<0||point.y>=maze[0].length;
	}
	   
	   
	
	private boolean isValidMove(Point p){
		return !isOutSide(p)&&!isNotOpen(p);
	}

	   
	   private boolean isNotOpen(Point point){
		   return "#".equals(maze[point.x][point.y]);
	   }
   
	public void findPath(String value,int x,int y){
		
		Point point = new Point(x,y);
		boolean [][] unvisited = new boolean [maze.length][maze[0].length];
		int [][] memory = new int [maze.length][maze[0].length];
		stack.push(point);
		boolean bFound = false;
		while(!stack.isEmpty()){
		   Point p = stack.pop();
		   if (!isOutSide(p)&&value.equals(maze[p.x][p.y])){
			   bFound = true;
			   break;
		   }else{
			   if (isValidMove(p)){
				   if (unvisited[p.x][p.y]){
					   continue;
				   }
				   unvisited[p.x][p.y] = true;
				   //west
				   stack.push(new Point(p.x-1,p.y));
				   //east
				   stack.push(new Point(p.x+1,p.y));
				   //north
				   stack.push(new Point(p.x,p.y-1));
				   //south
				   stack.push(new Point(p.x,p.y+1));
			   }			   
		   }
		}
		
		System.out.println(bFound);
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

}
