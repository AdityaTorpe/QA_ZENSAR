package computer;

public class Desktop implements hrdware, Software{
	private void DesktopModel() {
		System.out.println("DTK1234");

	}

	@Override
	public void SwResourses() {
		System.out.println("ssoftwares");
		
	}

	@Override
	public void hrdwareResourses() {
		System.out.println("Hrdware");
		
	}
	public static void main(String[] args) {
		Desktop ds = new Desktop();
		ds.DesktopModel();
		ds.hrdwareResourses();
		ds.SwResourses();
	}
}
