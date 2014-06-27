package stok;

public class Stokelemanlar {
private  String urunadi;
private  String urunkodu;
private String ugrsmiktar;
private  String ucksmiktar;
private String urunmiktar;
private String alistar;
private String satistar;
private String uruncinsi;
private String urunfiyat;
private int ID;
public String getUrunadi() {
	return urunadi;
}
public void setUrunadi(String urunadi) {
	this.urunadi = urunadi;
}
public String getUrunkodu() {
	return urunkodu;
}
public void setUrunkodu(String urunkodu) {
	this.urunkodu = urunkodu;
}
public String getUgrsmiktar() {
	return ugrsmiktar;
}
public void setUgrsmiktar(String ugrsmiktar) {
	this.ugrsmiktar = ugrsmiktar;
}
public String getUcksmiktar() {
	return ucksmiktar;
}
public void setUcksmiktar(String ucksmiktar) {
	this.ucksmiktar = ucksmiktar;
}
public String getUrunmiktar() {
	return urunmiktar;
}
public void setUrunmiktar(String urunmiktar) {
	this.urunmiktar = urunmiktar;
}
public String getAlistar() {
	return alistar;
}
public void setAlistar(String alistar) {
	this.alistar = alistar;
}
public String getSatistar() {
	return satistar;
}
public void setSatistar(String satistar) {
	this.satistar = satistar;
}
public String getUruncinsi() {
	return uruncinsi;
}
public void setUruncinsi(String uruncinsi) {
	this.uruncinsi = uruncinsi;
}
public String getUrunfiyat() {
	return urunfiyat;
}
public void setUrunfiyat(String urunfiyat) {
	this.urunfiyat = urunfiyat;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}

public Stokelemanlar(String urunadi, String urunkodu, String ugrsmiktar,
		String ucksmiktar, String alistar, String satistar,
		String urunfiyat,String uruncinsi ) {
	super();
	this.urunadi = urunadi;
	this.urunkodu = urunkodu;
	this.ugrsmiktar = ugrsmiktar;
	this.ucksmiktar = ucksmiktar;
	this.alistar = alistar;
	this.satistar = satistar;
	this.urunfiyat = urunfiyat;
	this.uruncinsi = uruncinsi;
	
	
}
public Stokelemanlar() {
	// TODO Auto-generated constructor stub
	
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ürünadı=" + urunadi+ " \nÜrünkodu=" + urunkodu + " \nÜrünGirişmiktarı="+ ugrsmiktar +" \nÜrünÇıkışmik=" +ucksmiktar +"\nÜrünfiyat=" +urunfiyat+"Alıştar"+alistar +"\nSatıştar="
				+satistar+"\nDepolamaturu="+uruncinsi;
	}

}
