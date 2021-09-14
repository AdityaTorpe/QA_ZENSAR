package veichleInfo;

import org.twoWheeler.TwoWheeler;

import fourWheel.Fourwheel;

import org.threeWheeler.*;
public class Veichle {
	public void allVeichles() {
	   System.out.println("all Veichles");
	}
	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler();
		tw.bike();
		tw.cycle();
		
		ThreeWheel ww = new ThreeWheel();
		ww.auto();
		
		Fourwheel fw = new Fourwheel();
		fw.bus();
		fw.car();
		fw.lorry();
	}   
	    
}
