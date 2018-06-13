package sutda;

public class Whowin {
	int Po = P1.Jokboscore;
	int Pt = P2.Jokboscore;
	int whowin;
	
	if(P<30 && C<30)
		if(P>C)
			whowin=0;
		else if(P==C)
			whowin=2;
		else
			whowin=1;
	else if(P==30 && C==30)
		whowin =2;
	else if(P==30) {
		if(16<=C && C<=25)
			whowin =0;
		else if(C==0)
			whowin =2;
		else
			whowin =1;
	}
	else if(C==30) {
		if(16<=P && P<=25)
			whowin =1;
		else if(P==0)
			whowin =2;
		else
			whowin =0;
	}
	else if(P==31) {
		if(C<=15)
			whowin = 2;
		else
			whowin = 1;
	}
	else if(C==31) {
		if(P<=15)
			whowin = 1;
		else
			whowin = 2;
	}
	else if(P==32) {
		if(C<=25)
			whowin = 2;
		else
			whowin = 1;
	}
	else if(C==32) {
		if(P<=25)
			whowin = 1;
		else
			whowin = 2;
	}
	else if(P==33) {
		if(C==26 || C==0)
			whowin = 0;
		if(C==1)
			whowin = 2;
		else
			whowin = 1;		
	}
	else if(C==33) {
		if(P==26 || P==0)
			whowin = 1;
		if(P==1)
			whowin = 2;
		else
			whowin = 0;		
	}
	
	// whowin = 0 -> player win , whowin =1 -> computer win, whowin = 0 -> Àç°æ±â
	
}
