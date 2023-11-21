
package bubblesortint;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class BubbleSortint {

   
    public static void main(String[] args) {
   String [] strArray =  {"Lsd", "Hvfd", "Sfvb", "Gbn", "Dfb", "Vqe"};
        System.out.println("Original String Array:"+ Arrays.toString(strArray));

        
        bubblesort(strArray);
        System.out.println("Sorted String Array:"+ Arrays.toString(strArray));
 
    }
    static void bubblesort(String[]arr){
        int n = arr.length;
            for(int i=0; i <n-1;i++){
            for(int j = 0; j<n-i-1;j++){
                if (arr[j].compareTo(arr[j+1])>0){
                   
                    String temp=arr[j];
                    arr[j]=arr [j+1];
                    arr[j+1]=temp;
                }
                    
                }
            }
        }
       
    }
           

