class Modulo
{
    static long multiplicationUnderModulo(long a, long b)
    {
        int M=1000000007;
        return ((a%M) * (b%M)) %M;
    }
}
