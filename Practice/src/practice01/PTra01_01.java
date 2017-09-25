package practice01;
/*
 * PTra01_01.java
 *   作成 LIKEIT  2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra01_01 {
    public static void main(String[] args) {

        // ★このJavaプログラムを変更して、「Welcome!Java」と出力（コマンドプロンプトに表示）してください
    	
    	        // 入力された数値を格納する変数
    	        int num = 0;
    	        // 入力された数値を合計した結果を格納する変数
    	        int sum = 0;

    	        System.out.println("入力された数値を合計します。1から9の数値を入力して下さい。0を入力したら計算結果を表示します。");

    	        while(true) {
    	            num = new java.util.Scanner(System.in).nextInt();

    	            // 0が入力された場合
    	            if (0 == num) {
    	                break;
    	            }
    	            // 1から9以外の数値が入力された場合
    	            if (0 > num || 9 < num) {
    	                System.out.println("0から9の数値を入力して下さい。");
    	                continue;
    	            }
    	            // それ以外の場合(1から9)は合計値に加算
    	            sum += num;
    	        }
    	        System.out.println("合計値は " + sum + " です。");
    	    


    }
}
