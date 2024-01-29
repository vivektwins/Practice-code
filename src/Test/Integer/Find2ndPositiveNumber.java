package Test.Integer;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;

public class Find2ndPositiveNumber{
    
    public static void main(String args[])

{
    int a[] = {1,-5, 3, 5, 6};
    
    Arrays.sort(a);
    
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==i && a[i]>0)
        {
            
        }
        
        else if(a[i]>0){
            
            System.out.println(i);
            break;
            
        }
    }
    
}
}