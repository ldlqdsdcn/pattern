package indi.solomon.sushu;

/**
 * @author liudalei
 * @version 1.0.0
 * @date 2017/12/28
 * @description
 */
public class FindSushu {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int j;
        boolean flag;
         for(int i=2;i<1000;i++){
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
