package ArrayList;

import java.util.Arrays;

class RemoveDuplicatesExample2   
{   
    //Creating removeDuplicates() method to remove duplicates from array  
    static void removeDuplicate(char str[], int length)   
    {   
        //Creating index variable to use it as index in the modified string   
        int index = 0;   
    
        // Traversing character array  
        for (int i = 0; i < length; i++)   
        {   
              
            // Check whether str[i] is present before or not   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            // If the character is not present before, add it to resulting string   
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    //Create sortString() method to sort string  
    static String sortString(String str)   
    {   
       // Convert string to character array to sort it   
       char temp[] = str.toCharArray();   
         
       //sort array using array's sort () method  
       Arrays.sort(temp);   
         
       //Generate a new string from character array   
       str = new String(temp);   
           
       // Return the sorted string  
       return str;   
    }  
    
    // main() method starts  
    public static void main(String[] args)   
    {   
        String info = "naagaarju";  
        //Converting string to character array  
        char str[] = info.toCharArray(); 
        Arrays.sort(str); 
        //Calculating length of the character array  
        int len = str.length;   
        //Calling removeDuplicates() method to remove duplicate characters  
        removeDuplicate(str, len);   
    }   
}  