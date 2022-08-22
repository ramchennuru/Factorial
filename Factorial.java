public class Factorial {
    int num;

    public int val(int num) {
        if(num>=1)
        {
            return val(num-1)*num;
        }
        return 1;
    }
}
