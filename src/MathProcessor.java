public class MathProcessor extends Processor {
    public void process(int i, int e ){
        System.out.println("Sum od integer je " + (i + e));
    }
    public void process(int[] ints){
        int sum = 1;
        for (int i: ints){
            sum+=i;

        }

        System.out.println("Sum je" + sum);

    }

}
