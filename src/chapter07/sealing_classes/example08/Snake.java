package chapter07.sealing_classes.example08;

public sealed class Snake permits Cobra{

}

final class Cobra extends Snake {

}