package jp;
import java.util.*;

public class f {
    
    
    public static void main(String[] args){
        
        String kaminoku,nakanoku,simonoku;
        int zisuu,judge,simo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("a上野区を入力");
            kaminoku =scanner.nextLine();
            zisuu= kaminoku.length();
            while (zisuu!=5){
                System.out.println("ちゃんとやれ");
                kaminoku =null;
                System.out.println("上野区を入力");
                kaminoku =scanner.nextLine();
                zisuu= kaminoku.length();
            }
            System.out.println("なか野区を入力");
            nakanoku =scanner.nextLine();
            judge =nakanoku.length();
            while (judge !=7){
                System.out.println("ちゃんとやれ");
                nakanoku =null;
                System.out.println("なか野区を入力");
                nakanoku =scanner.nextLine();
                judge =nakanoku.length();
            }
            System.out.println("しも野区を入力");
            simonoku =scanner.nextLine();
            simo =simonoku.length();
            while (simo !=5){
                System.out.println("ちゃんとやれ");
                System.out.println("しも野区を入力");
                simonoku =scanner.nextLine();
                simo =simonoku.length();
            }
        }

        System.out.println("今回完成したのは"+"\n"+"-------------------"+"\n"+kaminoku+"\n"+nakanoku+"\n"+simonoku+"\n"+"-------------------"+"\n"+"良い句ですなー");
    }
}    

