package springdi_anno.domain;

public class SamsungSpeaker implements Speaker {

	@Override
	public void printName() {
		System.out.println("LG 스피커");

	}

}