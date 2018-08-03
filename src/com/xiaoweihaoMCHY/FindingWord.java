package com.xiaoweihaoMCHY;

import java.util.*;

public  class FindingWord {

    public static char Find(int num, String s,int length)
    {
        char [] ch=s.toCharArray();  //将字符串分成字符数组
        int []data=new int[129];

        for(int i=0;i<data.length;i++)
        {
            data[i]=0;  //初始化数组
        }

        for(int i=0;i<length;i++)
        {
            int temp=ch[i];  //从char型转换成int型
            data[temp]++;  //对应字符的次数增加
            if(data[temp]>=num)
            {
                char c=(char)temp;
                System.out.println(c);  //输出满足次数的字符
                return 1;
            }
        }

        System.out.println("No");  //找不到适宜字符时输出No
        return 0;
    }

    public static void main(String []args) {

        System.out.println("请输入字符最多出现次数");
        int num = new Scanner(System.in).nextInt();

        System.out.println("请输入字符串");
        String str=new Scanner(System.in).nextLine();
        int length = str.length();

        Find(num,str,length);
    }
}
