package indi.solomon.rsa;

import java.util.Scanner;

/**
 * @author liudalei
 * @version 1.0.0
 * @date 2017/12/14
 * @description
 * 欧拉函数实现
 */
public class OuLaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            System.out.println(eular(n));

        }
    }

    static int eular(int n) {
        int ans = 1, i;
        for (i = 2; i * i <= n; i++)
            if (n % i == 0) {
                n /= i;
                ans *= (i - 1);
                while (n % i == 0) {
                    n /= i;
                    ans *= i;
                }
            }
        if (n > 1)
            ans *= (n - 1);
        return ans;
    }
}
