class LinearSearch
{
  /* 

  My Wrong Approach 

   public static void main(String args[])
  {
     int arr[]={0,11,5,9,6,2,3};
     int n=arr.length;
     int k=6;
  for(int i=0;i<n;i++)
    { 
         if(arr[i]==k)
         {
             System.out.println("k is found ");
         }
        else
          {
             System.out.println("k is not found ");

            }
    }
  }
    */


  /* 

  Corrected Approach With Time Complexity o(n)
    public static int linearSearch(int marks[],int key)
    {
      for(int i=0;i<marks.length;i++)
      {
        if(marks[i]==key)
        {
          return marks[i];
        }
      }
      return -1;
    }


    public static void main(String args[])
    {
      int mark[]={90,80,99,50,55,60,70,88};
      int k=60;

      int index=linearSearch(mark,k);
      if(index==-1)
      {
        System.out.println("Index Is Not Found");

      }
      else{
        System.out.println("Index Is Found : "+index);
      }
    }


    */


    public static void main(String args[])
    {
      int arr[]={49,39,24,50,69,59};
      int k=69;
      boolean f=false;

      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==k)
        {
          System.out.println("Element Found at : "+i);
          f =true;
        }
      }
      if(f==false)
      {
        System.out.println("Element Is not Found");
      }
    }
}