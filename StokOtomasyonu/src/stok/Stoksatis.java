package stok;

public class Stoksatis {
	private  String urunadi;
	private  String urunkodu;
	private String urunsatismik;
	private String satistar;
	private String uruncinsi;
	private String urunfiyat;
	private String firmadi;
	private String mustadsoyad;
	private String mustno;
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
	public String getUrunsatismik() {
		return urunsatismik;
	}
	public void setUrunsatismik(String urunsatismik) {
		this.urunsatismik = urunsatismik;
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
	public String getFirmadi() {
		return firmadi;
	}
	public void setFirmadi(String firmadi) {
		this.firmadi = firmadi;
	}
	public String getMustadsoyad() {
		return mustadsoyad;
	}
	public void setMustadsoyad(String mustadsoyad) {
		this.mustadsoyad = mustadsoyad;
	}
	public String getMustno() {
		return mustno;
	}
	public void setMustno(String mustno) {
		this.mustno = mustno;
	}
	public Stoksatis(String urunadi, String urunkodu, String urunsatismik,
			String satistar, String uruncinsi, String urunfiyat,
			String firmadi, String mustadsoyad, String mustno) {
		super();
		this.urunadi = urunadi;
		this.urunkodu = urunkodu;
		this.urunsatismik = urunsatismik;
		this.satistar = satistar;
		this.uruncinsi = uruncinsi;
		this.urunfiyat = urunfiyat;
		this.firmadi = firmadi;
		this.mustadsoyad = mustadsoyad;
		this.mustno = mustno;
	}
	public Stoksatis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stoksatis(String text, String text2) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
