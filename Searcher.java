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

public class Searcher {
    
    private int [] array;
    private char [] charArray;
    private byte [] byteArray;
    
    /**************** Constructors ***************/
    
    //Purpose: Initialized Constructors
        // Input: Unsorted Array
        // Output: none
    
    public Searcher(int [] a){
        
        array = a;
    }
    
    public Searcher(byte [] b){
        
        byteArray = b;
    }
    
    public Searcher(char [] c){
        
        charArray = c;
    }
  
    /**************** Getters ***************/

    //Purpose: Get unsearched array
        // Input: None
        // Output: Current Array
    
    public String getIntArray (){
        
        String a = "";
        
        for(int i = 0; i < array.length; i++){
            a += array[i] + " ";
        }
        return a;
    }
    
    //Purpose: Get unsearched array
        // Input: None
        // Output: Current Array
    
    
    public String getByteArray (){
        
        String a = "";
        
        for(int i = 0; i < byteArray.length; i++){
            a += byteArray[i] + " ";
        }
        return a;
    }
    
    //Purpose: Get unsearched array
        // Input: None
        // Output: Current Array
    
    public String getCharArray (){
        
        String a = "";
        
        for(int i = 0; i < charArray.length; i++){
            a += charArray[i] + " ";
        }
        return a;
    }
    
    /**************** Setters ***************/

    //Purpose: Set unsearched array to search
        // Input: Unsearched Array, int
        // Output: None
    
    public void setArray (int [] a){
        
        array = a;
    }
    
    //Purpose: Set unsearched array to search
        // Input: Unsearched Array,byte
        // Output: None
    
    public void setArray (byte [] b){
        
        byteArray = b;
    }
    
    //Purpose: Set unsearched array to search
        // Input: Unsearched Array, char
        // Output: None
    
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
    
    // Purpose: Load array with random values
        // Input: none
        // returns: none
    
    public void loadByte (){
       
        for(int x = 0; x < byteArray.length; x++){            
              // populate array
              byteArray[x] = (byte)(Math.random() * 127 + 1);
            
        } // end int r = 0
    } // end method
    
    // Purpose: Load array with random values
        // Input: none
        // returns: none
    
    public void loadChar (){
       
        for(int x = 0; x < charArray.length; x++){            
              // populate array
              charArray[x] = (char)(Math.random() * 26 + 97);
            
        } // end int r = 0
    } // end method
    
    /**************** Search Arrays ***************/
    
    //Purpose: search an integer array for the value
        // Input: value
        // Output: none
    
    public void intLinearSearch(int value){
        
        int x = 0;  // counter
        
        for(int i = 0; i < array.length; i++){
           
            if(array[i] == value)
            {
                
                this.printInt(i);    // send info to a printer method
                x = 0;               // reset control variable
                    
            } // end if
            else
            {
                
                x++;                // increment control variable
                
            } // end else
        } // end for i = 0
        
        if(x == array.length){
            
            System.out.println("Element " + value + " not found.");
        
        }
    } // end int  linear search

    //Purpose: search a byte array for the value
        // Input: value
        // Output: none
    
     public void byteLinearSearch(byte v){
        
        int x = 0;  // counter
        
        for(int i = 0; i < byteArray.length; i++){
           
            if(byteArray[i] == v)
            {
                
                this.printByte(i);    // send info to a printer method
                x = 0;               // reset control variable
                    
            } // end if
            else
            {
                
                x++;                // increment control variable
                
            } // end else
        } // end for i = 0
        
        if(x == byteArray.length){
            
            System.out.println("Element " + v + " not found.");
        
        }
    } // end byte linear search
    
    //Purpose: search a char array for the value
        // Input: value
        // Output: none
    
    public void charLinearSearch(char value){
        
        int x = 0;
        
        for(int i = 0; i < charArray.length; i++){
           
            if(charArray[i] == value)
            {
                
                this.printChar(i);    // send info to a printer method
                x = 0;               // reset control variable
                    
            } // end if
            else
            {
                
                x++;                // increment control variable
                
            } // end else
        } // end for i = 0
        
        if(x == charArray.length){
            
            System.out.println("Element " + value + " not found.");
        
        }
    } // end byte linear search
    
    //Purpose: search a sorted integer array for the value
        // Input: value
        // Output: none
    
    public void intBinarySearch(int value, int l, int h){
        
        int low = l;     // lowest index
        int high = h;    // highest index
        int mid = 0;     // mid point

        int found = 0;
        
        while(found == 0){
            
            if(high < low)
            {
                System.out.println("Element " + value + " not found.");
                found = 1;
            } // end if
            else
            {
                mid = low + (high - low)/2;
                
                if (array[mid] < value) {
                    low = mid + 1;
                }
                if (array[mid] > value){
                    high = mid - 1;
                }
                if (array[mid] == value){
                    this.printInt(mid);
                    found = 1;
                }
            } // end else
        } // end while
    } // end method
 
    //Purpose: search a sorted byte array for the value
        // Input: value
        // Output: none
    
    public void byteBinarySearch(byte value, int l, int h){
        
        int low = l;     // lowest index
        int high = h;    // highest index
        int mid = 0;     // mid point

        int found = 0;
        
        while(found == 0){
            
            if(high < low)
            {
                System.out.println("Element " + value + " not found.");
                found = 1;
            } // end if
            else
            {
                mid = low + (high - low)/2;
                
                if (byteArray[mid] < value) {
                    low = mid + 1;
                }
                if (byteArray[mid] > value){
                    high = mid - 1;
                }
                if (byteArray[mid] == value){
                    this.printByte(mid);
                    found = 1;
                }
            } // end else
        } // end while
    } // end method

    //Purpose: search a sorted char array for the value
        // Input: value
        // Output: none
    
    public void charBinarySearch(char value, int l, int h){
        
        int low = l;     // lowest index
        int high = h;    // highest index
        int mid = 0;     // mid point

        int found = 0;
        
        while(found == 0){
            
            if(high < low)
            {
                System.out.println("Element " + value + " not found.");
                found = 1;
            } // end if
            else
            {
                mid = low + (high - low)/2;
                
                if (charArray[mid] < value) {
                    low = mid + 1;
                }
                if (charArray[mid] > value){
                    high = mid - 1;
                }
                if (charArray[mid] == value){
                    this.printChar(mid);
                    found = 1;
                }
            } // end else
        } // end while
    } // end method 
    
    /**************** Report messages ***********/
    
    //Purpose: Print success messages
        // Input: array index
        // Output: none
    
    public void printInt (int index){
        
        System.out.println("Element " + array[index] + 
                " found at index " + index);
        
    } // end printInt
    
    //Purpose: Print success messages
        // Input: array index
        // Output: none
    
    public void printByte (int index){
        
        System.out.println("Element " + byteArray[index] + 
                " found at index " + index);
        
    } // end printInt
    
    //Purpose: Print success messages
        // Input: array index
        // Output: none
    
    public void printChar (int index){
        
        System.out.println("Element " + charArray[index] + 
                " found at index " + index);
        
    } // end printInt
   
} // end class
