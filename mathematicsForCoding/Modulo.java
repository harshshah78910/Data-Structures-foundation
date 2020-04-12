
class Modulo {
    public static long sumUnderModulo(long a, long b)
    {
        int M=1000000007;
        return ((a%M) + (b%M))%M;
    }   
}
