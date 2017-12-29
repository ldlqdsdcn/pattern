package indi.solomon.rsa;

import org.omg.IOP.Encoding;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author liudalei
 * @version 1.0.0
 * @date 2017/12/28
 * @description
 */
public class RSASimple {
    public static void main(String[] args)
    {
       int p=13;
       int q=23;
       int baseNum=p*q; //299
       int fenN=(p-1)*(q-1);//264
       System.out.println("baseNum="+baseNum);
       System.out.println("fenN="+fenN);
       //随机数
       int e=113;
        findSushu(fenN);
        System.out.println("");
        getMofan(e,fenN);
        System.out.println();
        int d=521;
        System.out.println("d="+d);

       System.out.println("求余数："+(e*d-1)%fenN);
        BigInteger msg=new BigInteger("65");

        long message=65;
        System.out.println("message="+65);
       BigInteger encode= msg.pow(e).mod(new BigInteger(baseNum+""));
        //long encode=Math.round(Math.pow(message, e)) % baseNum;
        System.out.println("encode-="+encode);

       // long decode=Math.round(Math.pow(encode,d))%baseNum;
        BigInteger decode=encode.pow(d).mod(new BigInteger(baseNum+""));
        System.out.println("decode-="+decode);

        for(int i=2;i<196451153340722663l  ;i++)
        {
            if(196451153340722663l%i==0)
            {
                System.out.println(i);
            }
        }
    }

    /**
     * 如果两个正整数a和n互质，那么一定可以找到整数b，使得 ab-1 被n整除，或者说ab被n除的余数是1。这时，b就叫做a的“模反元素”。
     * @param a
     * @param n
     * @return
     */
    public static int getMofan(int a,int n)
    {
        List<Integer> list=new ArrayList();
        for(int i=2;i<Integer.MAX_VALUE;i++)
        {
            if((i*a-1)%n==0)
            {
                System.out.println("a="+a+" n="+n+" d="+i);
                System.out.println((i*a-1.0f)/n);
                list.add(i);
                if(list.size()==5)
                {
                    break;
                }
            }
        }
        for(int i=-2;i>Integer.MIN_VALUE;i--)
        {
            if((i*a-1)%n==0)
            {
                list.add(i);
                if(list.size()==10)
                {
                    break;
                }
            }
        }
        Random r = new Random();
        int index=r.nextInt(list.size()-1);
        System.out.println(index);
        System.out.print("模反："+list.toString());
        return list.get(index);

    }

    public static void findSushu(int max)
    {
        int j;
        boolean flag;
        for(int i=2;i<max;i++){
            flag=false;
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.print(i+"    ");
            }
        }
    }
}
