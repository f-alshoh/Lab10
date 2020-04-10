package lab_10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testSelectionSort {

	@Test
	
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	

    public testSelectionSort() {
    }
    
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
        
        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
        
    }
 
    
  public void testNegative(){
        
        /** Test data contains negative values only **/
    	
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
          
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;   
   	 	Sortedarr[1] = -9;
   	 	Sortedarr[2] = -8;
   	 	Sortedarr[3] = -7; 
   	 	Sortedarr[4] = -2;


    	SelectionSort test = new SelectionSort();
    	arr = test.basicSelectionSort(arr);
    	assertArrayEquals(Sortedarr, arr);
    	
    }
      
    
    
    public void testMixed(){
        
        /** Test data contains with both positive, negative and zeros **/
    	int[] arr = new int[5];
    	arr[0] = 4;
    	arr[1] = 2; 
   	 	arr[2] = 0;
   	 	arr[3] = -6;   
   	 	arr[4] = -8;
   	 
   	 	int[] Sortedarr = new int[5];
   	 	Sortedarr[0] = -8;   
   	 	Sortedarr[1] = -6;
   	 	Sortedarr[2] = 0;
   	 	Sortedarr[3] = 2; 
   	 	Sortedarr[4] = 4;


    	SelectionSort test = new SelectionSort();
    	arr = test.basicSelectionSort(arr);
    	assertArrayEquals(Sortedarr, arr);
    	
    }
    

   public void testDuplicates(){
        
        /** Test data contains duplicates **/
    	int[] arr = new int[5];
    	arr[0] = 7;
    	arr[1] = 2; 
   	 	arr[2] = 5;
   	 	arr[3] = 2;   
   	 	arr[4] = 9;
   	 
   	 	int[] Sortedarr = new int[5];
   	 	Sortedarr[0] = 2;   
   	 	Sortedarr[1] = 2;
   	 	Sortedarr[2] = 5;
   	 	Sortedarr[3] = 7; 
   	 	Sortedarr[4] = 9;


    	SelectionSort test = new SelectionSort();
    	arr = test.basicSelectionSort(arr);
    	assertArrayEquals(Sortedarr, arr);
    
    } 
    

    
}
