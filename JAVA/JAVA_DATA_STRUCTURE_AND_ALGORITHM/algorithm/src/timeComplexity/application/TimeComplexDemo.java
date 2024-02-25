package timeComplexity.application;

/*
* Determine the sum of the sequence of predecessors of a given given natural number.
*
* Determine a soma da sequencia de antecessores de uma determinado número natural informado.
* */
public class TimeComplexDemo {
    public static void main(String[] args){
        double now = System.currentTimeMillis();

        TimeComplexDemo demo = new TimeComplexDemo();
        System.out.println(demo.findSum(99999));

        System.out.println("Time taken = "+(System.currentTimeMillis() - now)+" milliseconds");

    }

    //public int findSum(int n){
    //    return n*(n+1)/2;
    //}

    public int findSum(int n){
        int sum = 0;
        for(int i = 1; i <=n;i++){
            sum = sum + i;
        }
        return sum;
    }
}
