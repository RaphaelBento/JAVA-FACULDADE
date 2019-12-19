
package br.com.fis.utl;

import java.util.Scanner;

public class  Teclado {
    private int LerInt,LerInt2,loop;
    private long LerLong;
    private String LerString,LerString2,LerDart;
	private int caso,caso2;
	Scanner sc =new Scanner(System.in);

	
	public  Teclado() {
		
	}
	public void setLoop(int loop) {
		loop=sc.nextInt();
		this.loop=loop;
	}
	public int getDevolveLoop() {
		return loop;
	}
	
	
	
	
	public void setCaso(int caso) {
		caso=sc.nextInt();
		sc.nextLine();
		this.caso=caso;
	}
	public int getDevolveCaso() {
		return caso;
	}
	
	public void setCaso2(int caso2) {
		caso2=sc.nextInt();
		sc.nextLine();
		this.caso2=caso2;
	}
	public int getRetornaCaso2() {
		return caso2;
	}
	
	
	
	public void setLerInt(int Lerint) {
		Lerint=sc.nextInt();
		sc.nextLine();
		this.LerInt=Lerint;
	}
	public int getDevolvaInt() {
		return LerInt;
	}
	public void setLerInt2(int Lerint2) {
		Lerint2=sc.nextInt();
		this.LerInt2=Lerint2;
	}
	public int getDevolvaInt2() {
		return LerInt2;
	}
	
	public void setLerString(String ler) {
	ler=sc.nextLine();
	this.LerString=ler;
	}
	public String getDevolveString() {
		return LerString;
	}
	public void setLerString2(String ler2) {
		ler2=sc.nextLine();
		this.LerString2=ler2;
		}
	
	public String getDevolveString2() {
		return LerString2;
	}
	public void setLerDepart(String lerdart) {
		lerdart =sc.nextLine();
		this.LerDart=lerdart;
		}
	public String getDevolveDpart() {
		return LerDart;
	}
	
	public void setLerLong(long LerLon) {
		LerLon=sc.nextLong();
		this.LerLong=LerLon;
	}
	public long getDevoveLong() {
		return LerLong;
	}
	

}