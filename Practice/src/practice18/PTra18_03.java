/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
		 
		 Player player;
		 
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
        	
            while (scanner.hasNext()) {
            	
            	player = new Player();
            	
            	
                String line = scanner.nextLine();
                String[] lineArray = line.split(",",4);
                
                player.setCountry(lineArray[0]);
                player.setName(lineArray[1]);
                player.setPosition(lineArray[2]);
                player.setTeam(lineArray[3]);         
                
                
                
                
                if (player.getTeam().indexOf("レアル・マドリード") != -1) {
        		    
                	continue;
                	
        		}else if(player.getTeam().indexOf("バルセロナ") != -1) {
        			
        			continue;
        		}else {
        			array.add(player);
        		}
                
                

            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }



		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        
        

		// ★ 削除後のArrayListの中身を全件出力してください
        	
        	for(Player info : array) {
        		System.out.println(info.toString());
        	}

	}
}
