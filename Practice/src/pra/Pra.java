package pra;

import java.util.ArrayList;

public class Pra {

	public static void main(String[] args) {
		

		
		    ArrayList<String> array = new ArrayList<String>();

		    array.add("東京");
		    array.add("大阪");
		    array.add("東京");
		    array.add("千葉");
		    array.add("大阪");

		    for (int i = 0 ; i < array.size() ; i++){
		      String country = array.get(i);
		      System.out.println(country);
		    }

		    System.out.println("2番目の項目を削除します");

		    array.remove(2);

		    for (int i = 0 ; i < array.size() ; i++){
		      String country = array.get(i);
		      System.out.println(country);
		    }

		    System.out.println("「大阪」の項目を削除します");

		    array.remove(array.indexOf("大阪"));

		    for (int i = 0 ; i < array.size() ; i++){
		      String country = array.get(i);
		      System.out.println(country);
		    }

		    System.out.println("全ての項目を削除します");

		    array.clear();

		    System.out.println("現在の項目数は " + array.size() + " です");


	}

}
