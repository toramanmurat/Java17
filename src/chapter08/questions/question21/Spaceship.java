package chapter08.questions.question21;

@FunctionalInterface
abstract interface Spaceship extends Transport{
//	default int blastOff(); //Does Not Compile
	default int blastOff() {
		return 0;}
}
