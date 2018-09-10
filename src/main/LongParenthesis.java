package main;

import java.util.Random;

public class LongParenthesis {
        public static void main(String arg[])
        {

                int i,m=0;
                int []array =new int[10];
                Random valu=new Random();
                for(i=0;i<10;i++)
                {
                        int number=valu.nextInt(7);
                        array[i]=number;
                        //System.out.print(+number);

                }
                System.out.println(" ");
                int j=0;
                int []check=new int[10];
                for(i=0;i<9;i++)
                {
                        if(array[i]==array[i+1])
                        {
                                m=1;
                                System.out.print('(');
                                System.out.print(array[i]);
                                System.out.print(array[i+1]);
                                //i++;
                        }
                        else if(array[i]!=array[i+1]&&m==1)
                        {
                                System.out.print(')');
                                m=0;
                        }
                        else
                        {
                                System.out.print(array[i]);
                        }

                }
                if(array[8]==array[9])
                {
                        System.out.print(')');
                }
                if(array[10-1]!=array[10-2])
                {
                        System.out.print(array[10-1]);
                }
        }
}
