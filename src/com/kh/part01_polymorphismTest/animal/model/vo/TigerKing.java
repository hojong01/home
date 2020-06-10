package com.kh.part01_polymorphismTest.animal.model.vo;

public class TigerKing extends AnimalMonster {

	
	public TigerKing(int hp,int exp, String kinds) {
		super(hp,exp,kinds);
	}
	
	@Override
	public void cry() {
		System.out.println("���� ȣ���� ���� �Ŵ��� ��ȿ�� �մϴ�.");
	}
	
	public void punch() {
		System.out.println("���� ȣ���� ���� �չ� ������ �մϴ�.");
		
	}
	
	public void hitTigerKing() {
		System.out.println("ȣ���� ����  hp�� 50��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 3);
		
		if(super.getHp() <= 0) {
			System.out.println("���� ȣ���̿��� �������ϴ�. ����ġ�� " + super.getExp()+"��ŭ ����մϴ�.");
		}
		
	}
}
	