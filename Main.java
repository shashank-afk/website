import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringTokenizer st;
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            st=new StringTokenizer(s);
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=Integer.parseInt(st.nextToken());
            }
            boolean condition=true;
            outer:for(int j=0;j<n-2;j++)
            {
                for(int k=j+1;k<n-1;k++)
                {
                    for(int l=k+1;l<n;l++)
                    {               
                        boolean condition2=true; 
                        int x=arr[j]+arr[k]+arr[l];
                        for(int m=0;m<n;m++)
                        {
                            if(arr[m]==x)
                            {
                                condition2=false;
                                break;
                            }
                        }
                        if(condition2)
                        {
                            condition=false;
                            break outer;
                        }
                    }
                }
            }
            if(condition)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}