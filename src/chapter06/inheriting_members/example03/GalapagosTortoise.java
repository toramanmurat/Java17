package chapter06.inheriting_members.example03;

import java.io.FileNotFoundException;

public class GalapagosTortoise extends Reptile {
	@Override
	public void sleep() throws FileNotFoundException {
	}

//	public void hide() throws FileNotFoundException {
//	} // DOES NOT COMPILE
//
//	public void exitShell() throws IOException {
//	} // DOES NOT COMPILE

}
