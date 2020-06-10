package com.kh.part01_polymorphismTest.animal.controller;


import com.kh.part01_polymorphismTest.animal.model.vo.AnimalMonster;
import com.kh.part01_polymorphismTest.animal.model.vo.Player;
import com.kh.part01_polymorphismTest.animal.model.vo.Tiger;
import com.kh.part01_polymorphismTest.animal.model.vo.TigerKing;

public class PlayerManager {

	public void startPlay(String name) {
		
		Player p = new Player(name);
		
		System.out.println(p.getName() +"�Բ��� �����ϼ˽��ϴ�.");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("���㰡 �� ������ �����ϼ̽��ϴ� . ");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		Tiger t1 = new Tiger(1000,8000,"���� ȣ����");
		
		t1.cry();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for(int i = t1.getHp(); i > 0; i-=70) {
			if(t1 instanceof Tiger) {
				((Tiger)t1).hitTiger();
				
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}
		p.setExp(p.getExp() + t1.getExp());
		
		System.out.println("���� ȣ������ ������(��) �����.");
		System.out.println(p);
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("���� �Ŵ��Ѱ� �ٰ��´� . . .");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		TigerKing c1 = new TigerKing(5000, 15000, "���� ȣ���� ��");
		
		c1.cry();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(name + "(��)�� ��ȿ�� �ӹڿ� �ɷ� �������� ���Ѵ� !! ");
		
		try {
			Thread.sleep(4500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(name + "(��)�� �ӹ��� Ǯ�ȴ� !!");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		if(c1 instanceof TigerKing) {
		((TigerKing)c1).hitTigerKing();
		
	}
		
		for(int i = c1.getHp(); i > 0; i -=50) {
			if(c1 instanceof TigerKing) {
				((TigerKing) c1).hitTigerKing();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		p.setExp(p.getExp() + c1.getExp());
		
		System.out.println("���� ȣ���� ���� �հ���(��) �����.");
		System.out.println(p);
		
		}
}

