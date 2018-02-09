package practice16;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 */
public class PTra16_01 {
    public static void main(String[] args) {
    	
    	
    		
    			// 日付を読みやすい文字列形式で表示する
    			Date date = new Date();
    			SimpleDateFormat f = new SimpleDateFormat("1998年10月24日");
    			String dateStr = f.format(date);
    			System.out.println(dateStr);
    		
    	

        /*
        * ★ java.util.Dateクラスを使って、自分の生年月日を「YYYY年MM月DD日」形式で出力してください
        *  ※　他の標準クラスも使って良いです
        */
    }
}