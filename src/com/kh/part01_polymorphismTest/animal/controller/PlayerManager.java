package com.kh.part01_polymorphismTest.animal.controller;


import com.kh.part01_polymorphismTest.animal.model.vo.AnimalMonster;
import com.kh.part01_polymorphismTest.animal.model.vo.Player;
import com.kh.part01_polymorphismTest.animal.model.vo.Tiger;
import com.kh.part01_polymorphismTest.animal.model.vo.TigerKing;

public class PlayerManager {

	public void startPlay(String name) {
		
		Player p = new Player(name);
		
		System.out.println(p.getName() +"님께서 등장하셧습니다.");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("폐허가 된 마을에 입장하셨습니다 . ");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		Tiger t1 = new Tiger(1000,8000,"좀비 호랑이");
		
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
		
		System.out.println("좀비 호랑이의 발톱을(를) 얻었다.");
		System.out.println(p);
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("무언가 거대한게 다가온다 . . .");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		TigerKing c1 = new TigerKing(5000, 15000, "좀비 호랑이 왕");
		
		c1.cry();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(name + "(은)는 포효의 속박에 걸려 움직이지 못한다 !! ");
		
		try {
			Thread.sleep(4500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(name + "(은)는 속박이 풀렸다 !!");
		
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
		
		System.out.println("좀비 호랑의 왕의 왕관을(를) 얻었다.");
		System.out.println(p);
		
		}
}

