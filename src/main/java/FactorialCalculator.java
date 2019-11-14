class FactorialCalculator {
    static int factorial(int number)
    {
        int result = number;
        for(int previous = number-1; previous>0; previous--)
        {
            result=result*previous;
        }
        return result;
    }
}
