class Power
{
    static int RecursivePower(int n,int p)
    {
        if(p==0)
         return 1;
         
        return  n * RecursivePower(n,p-1);
    }
 
}
