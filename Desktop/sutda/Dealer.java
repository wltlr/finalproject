package sutda;

import java.util.*;

public class Dealer {
	
	int GameType; //2장섯다, 3장 섯다 구분
	boolean state; // 게임을 계속 진행할 것인지 결정
	int totalbet;  //총 베팅액(플레이어 총합)
	int previousbet; //바로 전 베팅
	int normalbet;  //기본베팅 
	
	
	public void GameStart() {
		this.state = true;
	}
	
	public void regame(int count) {
		if(count != 0) {
			this.state = false;
			System.out.println("Thank you for playing Game.");
		}
	}

	public ArrayList<Card> MakeDeck() {
		
		ArrayList<Card> Deck = new ArrayList<Card>();
		
		for(int i=0;i<20;i++) {
			Card c = new Card();
			if(i<10) {
				c.month = i+1;
				Deck.add(c);
			}
			else {
				c.month = i-9;
				Deck.add(c);
			}
		}
		
		Deck.get(11).Light = true;
		Deck.get(13).Light = true;
		Deck.get(18).Light = true;
	
		return Deck;
	}
	
	public void shuffle(ArrayList<Card> Deck) {
		Collections.shuffle(Deck);
	}
	
	public Card[] distrib(ArrayList<Card> Deck) {
		Card temp[] = new Card[3];
		for(int i=0; i<2; i++) {
			temp[i] = Deck.get(0);
			Deck.remove(0);
		}
		return temp;
	}
	
	public Card additionaldist(ArrayList<Card> Deck) {
		Card temp = new Card();
		temp = Deck.get(0);
		Deck.remove(0);
		
		return temp;
	}
	
	public void FirstBetting() {
		//선베팅 정해주는 함수
		//랜덤함수로 숫자 더 큰사람이 선 OR 자본금이 많은사람이 선베팅
		
	}
	
}
