package jp.ac.uryukyu.ie.e225745;
import java.util.*;

public class Enterword {
    static Scanner scanner,scanner2,scanner3;
    
    
    public void inword(){
        scanner = new Scanner(System.in);
        System.out.println("上の句を詠んでください。");
        String kaminoku =scanner.nextLine();
        int judge =kaminoku.length();
        if (judge==5){
            System.out.println("中の句を詠んでください。");
            scanner2= new Scanner(System.in);
            String sevennoku =scanner.nextLine();
            int judge2 =sevennoku.length();
            if (judge2==7){
                System.out.println("下の句を詠んでください。");
                scanner3= new Scanner(System.in);
                String simonoku =scanner.nextLine();
                int judge3 =simonoku.length();
                }
        }else{
            System.out.println("正しい文字数で入力してください。");
        }
    }
}
