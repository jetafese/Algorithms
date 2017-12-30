/************************************************************
 * Programmer: Joseph
 * 
 * Class: CS40S
 * 
 * Assignment: Sorting Algorithms
 * 
 * Purpose: Objectify 2 sorting algorithms
 * 
 * Input: Array
 * 
 * Output: Sorted Array
 *************************************************************/

public class Sorter {
    
    private int [] array;
    private char [] charArray;
    private byte [] byteArray;
    
    /**************** Constructors ***************/
    
    //Purpose: Initialized Constructors
        // Input: Unsorted Array
        // Output: none
    
    public Sorter(int [] a){
        
        array = a;
    }
    
    public Sorter(byte [] b){
        
        byteArray = b;
    }
    
    public Sorter(char [] c){
        
        charArray = c;
    }
  
    /**************** Getters ***************/

    //Purpose: Get unsorted array
        // Input: None
        // Output: Current Array
    
    public String getIntArray (){
        
        String a = "";
        
        for(int i = 0; i < array.length; i++){
            a += array[i] + " ";
        }
        return a;
    }
    
      public String getByteArray (){
        
        String a = "";
        
        for(int i = 0; i < byteArray.length; i++){
            a += byteArray[i] + " ";
        }
        return a;
    }
    
     public String getCharArray (){
        
        String a = "";
        
        for(int i = 0; i < charArray.length; i++){
            a += charArray[i] + " ";
        }
        return a;
    }
    /**************** Setters ***************/

    //Purpose: Set unsorted array to sort
        // Input: Unsorted Array, int, byte and char
        // Output: None
    
    public void setArray (int [] a){
        
        array = a;
    }
    
    public void setArray (byte [] b){
        
        byteArray = b;
    }
    
    public void setArray (char [] c){
        
        charArray = c;
    }
    
    /**************** Load Array ***************/
    
    // Purpose: Load array with random values
        // Input: none
        // returns: none
    public void loadInt (){
       
        for(int x = 0; x < array.length; x++){            
              // populate array
              array[x] = (int)(Math.random() * 100 + 1);
            
        } // end int r = 0
 
    }  // end load int
    
    public void loadByte (){
       
        for(int x = 0; x < byteArray.length; x++){            
              // populate array
              byteArray[x] = (byte)(Math.random() * 127 + 1);
            
        } // end int r = 0
 
    } 
    
    public void loadChar (){
       
        for(int x = 0; x < charArray.length; x++){            
              // populate array
              charArray[x] = (char)(Math.random() * 26 + 97);
            
        } // end int r = 0
 
    } 
    
    /**************** Sort Arrays ***************/

    //Purpose: Sort array using Bubble Sort
        // Input: Unsorted Array
        // Output: array
    
    public void intBubbleSort (){
        
        int aLength;
        
        aLength = array.length;
        
        for(int j = 0; j < array.length; j++){
            
            for(int i = 1; i < aLength; i++){
            
                if(array[i - 1] > array[i]){
                  
                  this.swapInt(i - 1 , i);
                  
                } // end if
           
            } // end for i = 0
            
            aLength--;   // truncate array
            
        } // end for j = o
        
    } // end bubble sort
    
    public void byteBubbleSort (){
        
        int aLength;
        
        aLength = byteArray.length;
        
        for(int j = 0; j < byteArray.length; j++){
            
            for(int i = 1; i < aLength; i++){
            
                if(byteArray[i - 1] > byteArray[i]){
                  
                  this.swapByte(i - 1 , i);
                  
                } // end if
           
            } // end for i = 0
            
            aLength--;   // truncate array
            
        } // end for j = o
        
    } // end bubble sort
    
    public void charBubbleSort (){
        
        int aLength;
        
        aLength = charArray.length;
        
        for(int j = 0; j < charArray.length; j++){
            
            for(int i = 1; i < aLength; i++){
            
                if(charArray[i - 1] > charArray[i]){
                  
                  this.swapChar(i - 1 , i);
                  
                } // end if
           
            } // end for i = 0
            
            aLength--;   // truncate array
            
        } // end for j = o
        
    } // end bubble sort
    
    //Purpose: Sort array using Selection Sort
        // Input: Unsorted Array
        // Output: Sorted array
    
    public void intSelectionSort (){
        
        int min = 0;    // index for minimum value
        //aLength = array.length;
        
        for(int j = 0; j < array.length; j++){
        
            min = j;
        
            for(int i = min + 1; i < array.length; i++){
              
               if(array[min] > array[i]){
                   
                   min = i;     // set new index of lowest number
                   
               } // end if
              
            } // end for int i = j + 1
            
            // Swap
            if(array[min] != 0){
                   this.swapInt(j, min);
                   
            } // end if
        } // end for j
    } // end selection sort
    
    
    public void byteSelectionSort (){
        
        //int aLength;
        int min = 0;    // index for minimum value
        //aLength = array.length;
        
        for(int j = 0; j < byteArray.length; j++){
        
            min = j;
        
            for(int i = min + 1; i < byteArray.length; i++){
              
               if(byteArray[min] > byteArray[i]){
                   
                   min = i;     // set new index of lowest number
                   
               } // end if
              
            } // end for int i = j + 1
            
            // Swap
            if(byteArray[min] != 0){
                   this.swapByte(j, min);
                   
            } // end if
        } // end for j
    } // end selection sort
    
    public void charSelectionSort (){
        
        //int aLength;
        int min = 0;    // index for minimum value
        //aLength = array.length;
        
        for(int j = 0; j < charArray.length; j++){
        
            min = j;
        
            for(int i = min + 1; i < charArray.length; i++){
              
               if(charArray[min] > charArray[i]){
                   
                   min = i;     // set new index of lowest number
                   
               } // end if
              
            } // end for int i = j + 1
            
            // Swap
            if(charArray[min] != 0){
                   this.swapChar(j, min);
                   
            } // end if
        } // end for j
    } // end selection sort
    
    
    //Purpose: Sort array using the quick sort implementation
        // Input: array to be sorted
        // Output: none
    
    public void intQuickSort(int i, int j){
      
            /* assign values to stay constant for 
                evaluation through the process */
        
            int l = i;    // left side
            int r = j;    // right side
            
            int pivot;    
        
            // initialize pivot to be middle item
            pivot = array[(i + j) / 2];   
       
            while (i <= j) {  // make sure the left index < right index
           
                // traverse left side
                while (array[i] < pivot){
                    i++;
                }  
            
                // traverse right side
                while (array[j] > pivot){
                    j--;
                }
            
                // determine swap parameters
                if (i <= j){

                    this.swapInt(i, j);  // swap numbers
                    
                    // update control variables
                    i++;   
                    j--;

                }
        }
        
       if(l < j){   // quick sort left side
           intQuickSort(l, j);
       }
       
       if(i < r){  // quick sort right side
           intQuickSort(i, r);
       }
    } // end quick sort
    
    public void byteQuickSort(int i, int j){
      
            /* assign values to stay constant for 
                evaluation through the process */
        
            int l = i;    // left side
            int r = j;    // right side
            
            int pivot;    
        
            // initialize pivot to be middle item
            pivot = byteArray[(i + j) / 2];   
       
            while (i <= j) {  // make sure the left index < right index
           
                // traverse left side
                while (byteArray[i] < pivot){
                    i++;
                }  
            
                // traverse right side
                while (byteArray[j] > pivot){
                    j--;
                }
            
                // determine swap parameters
                if (i <= j){

                    this.swapByte(i, j);  // swap numbers
                    
                    // update control variables
                    i++;   
                    j--;

                }
        }
        
       if(l < j){   // quick sort left side
           byteQuickSort(l, j);
       }
       
       if(i < r){  // quick sort right side
           byteQuickSort(i, r);
       }
    } // end quick sort
    
    public void charQuickSort(int i, int j){
      
            /* assign values to stay constant for 
                evaluation through the process */
        
            int l = i;    // left side
            int r = j;    // right side
            
            int pivot;    
        
            // initialize pivot to be middle item
            pivot = charArray[(i + j) / 2];   
       
            while (i <= j) {  // make sure the left index < right index
           
                // traverse left side
                while (charArray[i] < pivot){
                    i++;
                }  
            
                // traverse right side
                while (charArray[j] > pivot){
                    j--;
                }
            
                // determine swap parameters
                if (i <= j){

                    this.swapChar(i, j);  // swap numbers
                    
                    // update control variables
                    i++;   
                    j--;

                }
        }
        
       if(l < j){   // quick sort left side
           charQuickSort(l, j);
       }
       
       if(i < r){  // quick sort right side
           charQuickSort(i, r);
       }
    } // end quick sort
    
    //Purpose: Swap two indeces and their components
        // Input: 2 values and their indeces
        // Output: Swapped indeces
    
    public void swapInt (int index1,
                      int index2){
        
        int f;
        int s;
        
        f = this.array[index1];
        s = this.array[index2];
        
        this.array[index1] = s;
        this.array[index2] = f;
        
    } // end swap
    
      public void swapByte (int index1,
                            int index2){
        
        byte f;
        byte s;
        
        f = this.byteArray[index1];
        s = this.byteArray[index2];
        
        this.byteArray[index1] = s;
        this.byteArray[index2] = f;
        
    } // end swap
    
    public void swapChar (int index1,
                            int index2){
        
        char f;
        char s;
        
        f = this.charArray[index1];
        s = this.charArray[index2];
        
        this.charArray[index1] = s;
        this.charArray[index2] = f;
        
    } // end swap
}
