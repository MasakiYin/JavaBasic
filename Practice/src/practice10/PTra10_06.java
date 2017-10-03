package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {


		for(int i = 0 ; i < 3 ; i++) {
			Car car = new Car() ;

			car.serialNo = 10000 ;

			car.color = "Red" ;

			car.gasoline = 50;


			final int distance = 300;


			int sum = 0;
			int a = 0;
			while(true) {
					a++ ;
				int process = car.run();
				sum += process;

				if(process == -1) {
					System.out.println("目的地に到達できませんでした");
					break;
				}


				if(sum >= distance){
					System.out.println("目的地にまで"+a+"時間かかりました。残りのガソリンは、"+car.gasoline+"リットルです。");
					break;
				}

			}
		}


	}
}
