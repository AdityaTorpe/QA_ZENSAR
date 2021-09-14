package nwInfo;

public class wifi {
	public void wifiName() {
		System.out.println("ADtjb");
	}
	public static void main(String[] args) {
		wifi wf= new wifi();
		wf.wifiName();
		
		MobileData md = new  MobileData();
		md.dataName();
		
		Lan ln = new Lan();
		ln.LanName();
		
		Wireless wl = new Wireless();
		wl.modamName();
	}
}
