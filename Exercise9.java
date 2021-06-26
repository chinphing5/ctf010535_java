
public class Exercise9 {

	public static void main(String[] args) {
		
	}

}

class MobilePhone {
	public void phoneCall() {
		System.out.println("Phone call");
	}
	
	public void sms() {
		System.out.println("SMS");
	}
	
	public void internetSufing() {
		System.out.println("Internet Surfing");
	}
}

class Iphone extends MobilePhone {
	public void appStore() {
		System.out.println("Appstore");
	}
}

class Android extends MobilePhone {
	public void googlePlay() {
		System.out.println("Google Play");
	}
}

class Iphone8 extends Iphone {
	public void touchId() {
		System.out.println("Touch ID");
	}	
}

class IphoneX extends Iphone {
	public void faceId() {
		System.out.println("Face ID");
	}
}

class SamsungGalaxy extends Android {
	public void transformToPC() {
		System.out.println("Transform to PC");
	}
	
	public void useGearVR() {
		System.out.println("Use Gear VR");
	}
}

class SamsungGalaxyS8 extends SamsungGalaxy {}

class SamsungGalaxyNote8 extends SamsungGalaxy {
	public void usePen() {
		System.out.println("Use Pen");
	}
}
