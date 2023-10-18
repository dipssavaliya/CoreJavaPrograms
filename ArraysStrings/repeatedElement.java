package ArraysStrings;

import java.util.HashSet;
import java.util.Set;

public class repeatedElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5};
       System.out.println("This array contains duplicates: "+repeatedElementMethod(arr));
    }

    private static boolean repeatedElementMethod(int[] arr) {
       Set<Integer> set = new HashSet<>();
        for(int i:arr)
        {
            
            if(set.contains(arr[i]))
            {
                return true;
            }
            else{
              set.add(arr[i]);
            }
        }
        return false;
    }
    
}
