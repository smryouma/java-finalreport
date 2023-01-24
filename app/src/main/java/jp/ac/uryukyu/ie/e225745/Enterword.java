package jp.ac.uryukyu.ie.e225745;
import java.util.*;

/**
 * 俳句の文字を上の句、中の句、下の句で入力させ最後に俳句のように５７５に並べるクラス
 */

public class Enterword {
    
    //コンストラクタにならない？？
    /**
     * 文字列を受け取り最後に表示します<br>
     * 
     * 上の句＝５文字
     * 
     * 中の句＝7文字
     * 
     * 下の句＝５文字で受け取ります。<br>
     * 
     * それ以外の文字列を受け取るとエラーメッセージが表示されます<br>
     * 
     * 指定された文字数になるまで繰り返します。
     * @param 
     */
    
    public void inword(){


        /**
         * 入力された文字列を受け取る変数
         */
        String top,center,under;
        /**
         * 文字列の字数を保持する変数
         */
        int top5,center7,under5;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("・上の句を入力");
            top =scanner.nextLine();
            top5= top.length();
            while (top5 != 5){
                System.out.println("※５文字で入力してください");
                top =null;
                System.out.println("上の句を入力");
                top =scanner.nextLine();
                top5= top.length();
            }
            System.out.println("・中の句を入力");
            center =scanner.nextLine();
            center7 =center.length();
            while (center7 != 7){
                System.out.println("※7文字で入力してください");
                center =null;
                System.out.println("・中の句を入力");
                center =scanner.nextLine();
                center7 =center.length();
            }
            System.out.println("・下の句を入力");
            under =scanner.nextLine();
            under5 =under.length();
            while (under5 != 5){
                System.out.println("※５文字で入力してください。");
                under =null;
                System.out.println("・下の句を入力");
                under =scanner.nextLine();
                under5 =under.length();
            }
        }
        System.out.println("\n"+"今回完成したのは"+"\n"+"-------------------"+"\n"+top+"\n"+center+"\n"+under+"\n"+"-------------------"+"\n"+"良い句ですなー");

    }
}
