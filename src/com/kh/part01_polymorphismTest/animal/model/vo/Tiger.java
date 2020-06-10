package com.kh.part01_polymorphismTest.animal.model.vo;

public class Tiger extends AnimalMonster {

	
	public Tiger(int hp, int exp,String kinds) {
		super(hp , exp, kinds);
		
	}
	
	@Override
	public void cry() {
		System.out.println("좀비 호랑이가 기괴한 소리를 냅니다.");
	}
	
	public void punch() {
		System.out.println("좀비 호랑이가 침을 흘리며 손톱 공격을 합니다.");
		
	}
	
	public void hitTiger() {
		System.out.println("좀비 호랑이의 hp가 70만큼 감소합니다.");
		super.setHp(super.getHp() - 15);
		
		if(super.getHp() <= 0)
			System.out.println("좀비 호랑이가 쓰러집니다. 경험치가 " + super.getExp() + "만큼 상승합니다.");
	}
	
}