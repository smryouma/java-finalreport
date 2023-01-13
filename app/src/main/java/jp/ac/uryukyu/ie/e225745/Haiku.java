package jp.ac.uryukyu.ie.e225745;
import java.util.*;


public class Haiku {
    ArrayList<String> keyword=new ArrayList<>();
    public void theme(){
        keyword.add("春");
        keyword.add("夏");
        keyword.add("秋");
        keyword.add("冬");
        Random randomWord =new Random();
        String keyTheme =keyword.get(randomWord.nextInt(4));
        String theme = "今回のお題は「"+keyTheme+"」です。";
        System.out.println(theme);
    }
    
}
