package com.scott.code;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort sort = new Sort ();
		int [] data = {6,5,4,3,2,1} ;
		sort.insertSort(data) ;
		for (int  c : data) 
			System.out.print(c + " ");
	}
	
	
	public void bubbleSort(int [] A){
		for (int i = 0 ; i < A.length ; ++i) {
			for (int j = A.length - 1 ; j > 0 ; --j) {
				 if (A[j] < A[j - 1]) {
					 int tmp = A[j] ;
					 A[j] = A[j - 1];
					 A[j - 1] = tmp ;
				 }
			}
		}
	}
	
	public void insertSort (int [] A){
		for (int i = 1 ; i < A.length ; ++i) {
			int j = i - 1 ;
			int key = A[i] ;
			while (j >= 0 && key < A[j]){				
				A[ j + 1] = A[j] ;
				j--;
			}
			A[j + 1] = key;			
		}
	}

}
