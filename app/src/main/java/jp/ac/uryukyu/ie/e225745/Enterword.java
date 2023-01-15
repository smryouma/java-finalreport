package jp.ac.uryukyu.ie.e225745;
import java.util.*;



public class Enterword {
    
    public void inword(){
        String top,center,under;
        int top5,center7,under5;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("・上の句を入力");
            top =scanner.nextLine();
            top5= top.length();
            while (top5 != 5){
                System.out.println("※５文字で入力してください");
                top =null;
                System.out.println("上野区を入力");
                top =scanner.nextLine();
                top5= top.length();
            }
            System.out.println("・中の句を入力");
            center =scanner.nextLine();
            center7 =center.length();
            while (center7 != 7){
                System.out.println("※５文字で入力してください");
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
                System.out.println("・下の句を入力");
                under =scanner.nextLine();
                under5 =under.length();
            }
        }

        System.out.println("今回完成したのは"+"\n"+"-------------------"+"\n"+top+"\n"+center+"\n"+under+"\n"+"-------------------"+"\n"+"良い句ですなー");
    }
    }

