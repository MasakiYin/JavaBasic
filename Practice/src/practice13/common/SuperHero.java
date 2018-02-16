/*
 * Character.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.common;

/**
 * 登場するキャラクターの情報とデフォルトの行動を設定したクラスです
 * @author rhizome
 *
 */
/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */

public class SuperHero extends Hero{
	
	private Item equipment ;
	
	public void setEquipment(Item e) {
		this.equipment = e;
	}
	
	public Item getEquipment() {
		return this.equipment;
	}
	
	public int attack() {
		return  super.attack() + equipment.getAdditonalDamage();
	}
		
		
}
