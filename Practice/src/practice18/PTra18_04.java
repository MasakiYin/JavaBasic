/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

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

		Player player = null;

        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

            while (scanner.hasNext()) {

            	player = new Player();


                String line = scanner.nextLine();
                String[] lineArray = line.split(",",4);

                player.setCountry(lineArray[2]);
                player.setName(lineArray[1]);
                player.setPosition(lineArray[0]);
                player.setTeam(lineArray[3]);


                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(array);

        ArrayList<Player> gk = new ArrayList<Player>();
        ArrayList<Player> df = new ArrayList<Player>();
        ArrayList<Player> mf = new ArrayList<Player>();
        ArrayList<Player> fw = new ArrayList<Player>();
        
        
        
        
        for(Player i : array) {

	        if(i.getPosition().equals("GK") && gk.size() < 1) {

	        	gk.add(i);

	    	}else if(i.getPosition().equals("DF") && df.size() < 4) {

	    		df.add(i);

	        }else if(i.getPosition().equals("MF") && mf.size() < 4) {

	        	mf.add(i);

	        }else if(i.getPosition().equals("FW") && fw.size() < 2) {

	        	fw.add(i);

	        }
        }
        
        for(Player g : gk) {
        	System.out.println(g);
        }
        for(Player d : df) {
        	System.out.println(d);
        	}
        for(Player m : mf) {
        	System.out.println(m);
        	}
        for(Player f : fw) {
        	System.out.println(f);
        	}
        

	}
}
