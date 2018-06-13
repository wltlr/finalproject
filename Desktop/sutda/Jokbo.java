package sutda;


public class Jokbo {
	int jumsu;
	int A = Card1.month
	int B = Card2.month
	boolean a = Card1.Light;
	boolean b = Card2.Light;
	
	if(A==B)
		jumsu = A + 15;
	else if((A==3 && B==8 && a==true && b==true) || (A==8 && B==3 && a==true && b==true))
		jumsu = 27;
	else if((a==false && B==8 && a==true && b==true) || (A==8 && b==false && a==true && b==true) || (a==false && B==3 && a==true && b==true) || (A==3 && b==false && a==true && b==true))
		jumsu = 26;
	else if((a==false && B==2) || (A==2 && b==false))
		jumsu = 15;
	else if((a==false && B==4) || (A==4 && b==false))
		jumsu = 14;
	else if((a==false && B=9) || (A==9 && b==false))
		jumsu = 13;
	else if((a==false && b==false0) || (a==false0 && b==false))
		jumsu = 12;
	else if((A==4 && b==false0) || (A=10 && B=4))
		jumsu = 11;
	else if((A==4 && B==6) || (A==6 && B==4))
		jumsu = 10;
	else if((A==3 && B==7) || (A==7 && B==3))
		jumsu = 30;
	else if((A==4 && B==9) || (A==9 && B==4)) {
		if(a==true && b==true)
			jumsu = 32;
		else
			jumsu = 31;
	}
	else if((A==4 && B==7 && a==true && b==true) || (A==7 && B==4 && a==true && b==true))
		jumsu = 33;
	else 
		jumsu = (A+B)%10;
}
