package Test;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;

public class VowelsRepeatedOcurrenceInOneList
{

  public static void main (String args[])
  {

    ArrayList < String > as = new ArrayList < String > ();
    ArrayList < String > bs = new ArrayList < String > ();
    String a[] = { "one", "two", "three", "five", "four" };

    String t = "";

    for (int k = 0; k < a.length; k++)
      {
	t = t + a[k] + ",";
      }

    System.out.println (t);
    int count = 0;
    int j = 0;

    char c[] = t.toCharArray ();
    for (int i = 0; i < c.length; i++)

      {

	if (c[i] == ',')
	  {

	    if (count > 1 && !bs.contains (a[j]))
	      {
		bs.add (a[j]);
	      }
	    else if (!bs.contains (a[j]))
	      {
		as.add (a[j]);
	      }
	    j++;

	  }

	if ((c[i] == 'a') || (c[i] == 'e') || (c[i] == 'i') || (c[i] == 'o')
	    || (c[i] == 'u'))
	  {
	    count++;
	    if (count > 1)
	      {
		bs.add (a[j]);
	      }

	  }
	else
	  {
	    count = 0;

	  }

      }
    System.out.println (bs);
    System.out.println (as);



    /* if(array[i].contains("a") ) 
       {
       count++;
       }

       else if(array[i].contains("e"))
       {
       count++;
       }
       else if(array[i].contains("i") )
       {
       count++;
       }
       else if(array[i].contains("o"))
       {
       count++;
       }
       else if(array[i].contains("u"))
       {
       count++;
       }

       if(count >1)
       {
       bs.add(array[i]);
       }

       else{
       as.add(array[i]);
       }


       }

       System.out.println(as);
       System.out.println(bs);
     */


  }
}
