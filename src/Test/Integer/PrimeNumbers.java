package Test.Integer;

import java.util.*;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;

public class PrimeNumbers
{
  public static void main (String[]args)
  {

    ArrayList < Integer > a = new ArrayList <> ();
    for (int n = 1; n <= 100; n++)
      {
	int c = 0;
	for (int i = 1; i <= n; i++)
	  if (n % i == 0)
	    c++;
	if (c == 2)
	  a.add (n);
      }
    System.out.println (a);
  }
}
