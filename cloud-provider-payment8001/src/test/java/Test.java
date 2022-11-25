public class Test {

    public static void main(String[] args) {
        int a=-1,b=4,k;
        k=(++a<=0)&& (b--<=0);
        System.out.printf("%d,%d,%d\n",k,a,b);

    }


}
