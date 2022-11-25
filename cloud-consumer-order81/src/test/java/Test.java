import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][4];
        int i,j;
        System.out.printf("请输入数组a:\n");
        for(i=0;i<4;i++)
            for(j=0;j<3;j++)
                a[i][j] = sc.nextInt();
        for(i=0;i<4;i++)
            a[i][3]=0;
        for(j=0;j<3;j++)
            a[4][j]=0;
        for(i=0;i<4;i++)
            for(j=0;j<3;j++)
            {
                a[4][3]+=a[i][j];
                a[i][3]+=a[i][j];
                a[4][j]+=a[i][j];
            }
        System.out.printf("结果是\n");
        for(i=0;i<5;i++)
        {
            for(j=0;j<4;j++)
                System.out.printf("%5d",a[i][j]);
            System.out.printf("\n");
        }
    }
}
