class Majority
{
    //Complete this function, Geeks
    public int majorityWins(int arr[],int n,int x,int y)
    {
            int count_x=0;//counter to count frequency of x
            int count_y=0;//counter to count frequency of y
        /******************************************
            Your code goes here, Geeks
          *******************************************/
        
        for(int element : arr)
        {
            if(element == x)
            {
                count_x++;
            }
            else if(element == y)
            {
                count_y++;
            }
        }
        
         if (count_x > count_y){
             return x;
         }
         else if (count_y > count_x){
             return y;
         }
        
             return x>y?y:x;
         
           
    }
}
