package com.kh.part01_polymorphismTest.animal.model.vo;

public class Tiger extends AnimalMonster {

	
	public Tiger(int hp, int exp,String kinds) {
		super(hp , exp, kinds);
		
	}
	
	@Override
	public void cry() {
		System.out.println("���� ȣ���̰� �Ⱬ�� �Ҹ��� ���ϴ�.");
	}
	
	public void punch() {
		System.out.println("���� ȣ���̰� ħ�� �긮�� ���� ������ �մϴ�.");
		
	}
	
	public void hitTiger() {
		System.out.println("���� ȣ������ hp�� 70��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 15);
		
		if(super.getHp() <= 0)
			System.out.println("���� ȣ���̰� �������ϴ�. ����ġ�� " + super.getExp() + "��ŭ ����մϴ�.");
	}
	
}