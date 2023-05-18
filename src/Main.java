import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("doğum gününüz: ");
        int day = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        System.out.print("doğum yılınız: ");
        int month = s2.nextInt();
        if (month > 0 && month < 13) {

            if (month == 1) {
                if (day <= 20) {
                    System.out.println("burcunuz oğlak");
                } else {
                    System.out.println("burcunuz kova");
                }
            }
            if (month==2){
                if (day<=19) {
                    System.out.println("burcunuz kova");
                }else {
                    System.out.println("burcunuz balık");
                }
            }
            if (month==3){
            if (day<=20) {
                System.out.println("burcunuz balık");
            }else {
                System.out.println("burcunuz koç");
            }
            }
            if (month==4){
                if (day<=20) {
                    System.out.println("burcunuz koç");
                }else {
                    System.out.println("burcunuz boğa");

                }
            }
            if (month==5){
                if (day<=20) {
                    System.out.println("burcuz boğa");
                }else{
                    System.out.println("burcunuz ikizler");
                }
            }
            if (month==6){
                if (day<=21){
                    System.out.println("burcunuz ikizler");
                }
            }
            if (month==7){
                if (day<=22) {
                    System.out.println("burcunuz yengeç");
                }else{
                    System.out.println("burcunuz aslan");
                }
            }
            if (month==8){
                if (day<=23) {
                    System.out.println("burcunuz aslan");
                }else {
                    System.out.println("burcunuz başak");
                }
            }
            if (month==9){
                if (day<=23) {
                    System.out.println("burcunuz başak");
                }else {
                    System.out.println("burcunuz terazi");
                }
            }
            if (month==10){
                if (day<=23) {
                    System.out.println("burcunuz terazi");
                }else {
                    System.out.println("burcunuz akrep");
                }
            }
            if (month==11){
                if (day<=22) {
                    System.out.println("burcunuz akrep");
                }else{
                    System.out.println("burcunuz yay");
                }
            }
            if (month==12){
                if (day<=21) {
                    System.out.println("burcunuz yay");
                }else{
                    System.out.println("burcunuz oğlak");
                }
            }

        }

    }
}