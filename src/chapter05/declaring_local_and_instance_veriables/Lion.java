package chapter05.declaring_local_and_instance_veriables;

public class Lion {

	int hunger=4;

	public int feedZooAmimals() {
		int snack=10; //local verialbe

		if(snack>4) {
			long dinnetTime=snack++;
			hunger--;
		}

		return snack;
	}

}
