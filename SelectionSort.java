package lab_10;

public class SelectionSort {
	private int temp;
	
	public SelectionSort() {  
	}
	
	public int[] basicSelectionSort(int[] x) {
		for (int i = 0; i < x.length; ++i) {
			for (int j= i+1; j < x.length; ++j) {
	
				if (x[j] < x[i]) {   
					temp = x[i];    
					x[i] = x[j];   
					x[j] = temp; 
					}            
				} // end of inner for loop   
			} // end of outer for loop
		return x;    
		} // end of basicSelectionSort method
}

