package indi.solomon.rsa;

/**
 * @author liudalei
 * @version 1.0.0
 * @date 2017/12/28
 * @description
 */
public class RSA {
    /**
     *  加密、解密算法
     * @param key 公钥或密钥
     * @param message 数据
     * @return
     */
    public static long rsa(int baseNum, int key, long message){
        if(baseNum < 1 || key < 1){
            return 0L;
        }
        //加密或者解密之后的数据
        long rsaMessage = 0L;

        //加密核心算法
        //rsaMessage = Math.round(Math.pow(message, key)) % baseNum;
        rsaMessage = Math.round(Math.pow(message, key)) % baseNum;

        return rsaMessage;
    }


    public static void main(String[] args){
        //基数
        int baseNum = 3 * 11;
        //公钥
        int keyE = 3;
        //密钥
        int keyD = 7;
        //未加密的数据
        long msg = 2L;
        //加密后的数据
        long encodeMsg = rsa(baseNum, keyE, msg);
        //解密后的数据
        long decodeMsg = rsa(baseNum, keyD, encodeMsg);

        System.out.println("加密前：" + msg);
        System.out.println("加密后：" + encodeMsg);
        System.out.println("解密后：" + decodeMsg);

    }

    public static char byteToChar(byte[] b) {
        char c = (char) (((b[0] & 0xFF) << 8) | (b[1] & 0xFF));
        return c;
    }

    /**
     * 如果两个正整数a和n互质，那么一定可以找到整数b，使得 ab-1 被n整除，或者说ab被n除的余数是1。这时，b就叫做a的“模反元素”。
     * @param a
     * @param n
     * @return
     */
    public static long getMofan(int a,int n)
    {
        for(int i=2;i<a*n;i++)
        {
            if((i*a-1)%n==0)
            {
                return i;
            }
        }
        for(int i=-2;i>0-a*n;i--)
        {
            if((i*a-1)%n==0)
            {
                return i;
            }
        }
        throw new IllegalStateException("找不到模反元素");
    }

}
