package sutda;

import java.util.*;

public class Dealer {
	
	int GameType; //2�弸��, 3�� ���� ����
	boolean state; // ������ ��� ������ ������ ����
	int totalbet;  //�� ���þ�(�÷��̾� ����)
	int previousbet; //�ٷ� �� ����
	int normalbet;  //�⺻���� 
	
	
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
		//������ �����ִ� �Լ�
		//�����Լ��� ���� �� ū����� �� OR �ں����� ��������� ������
		
	}
	
}
