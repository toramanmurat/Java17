package chapter05.declaring_local_and_instance_veriables;

public class EffectivelyFinalVeriables {

	public String zooFriends() {
		String name="Harry the Hippo"; // efectivelyFinal
		var size=10;
		boolean wet; // efectivelyFinal; bir kez deger atanmis

		if(size>100) {
			size++;
		}
		name.substring(0);
		wet=true;
		return name;
	}

}

//nasil test edebiliriz? degiskenlerin basina final anahtar kelimesi ekledigimizde hata vermiyorsa  efectivelyFinal dir.