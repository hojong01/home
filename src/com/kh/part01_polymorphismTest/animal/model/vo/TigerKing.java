package com.kh.part01_polymorphismTest.animal.model.vo;

public class TigerKing extends AnimalMonster {

	
	public TigerKing(int hp,int exp, String kinds) {
		super(hp,exp,kinds);
	}
	
	@Override
	public void cry() {
		System.out.println("좀비 호랑이 왕이 거대한 포효를 합니다.");
	}
	
	public void punch() {
		System.out.println("좀비 호랑이 왕이 앞발 공격을 합니다.");
		
	}
	
	public void hitTigerKing() {
		System.out.println("호랑이 왕의  hp가 50만큼 감소합니다.");
		super.setHp(super.getHp() - 3);
		
		if(super.getHp() <= 0) {
			System.out.println("좀비 호랑이왕이 쓰러집니다. 경험치가 " + super.getExp()+"만큼 상승합니다.");
		}
		
	}
}
	