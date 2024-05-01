package chapter07.sealing_classes.example01;

public sealed class Bear permits Kodiak,Panda {

}

// sealed -> sealed class'lar sadece ismini verdigimiz classlar veya interfaceler tarafindan extend/implements edilebilir.
// permits -> sealed class'larla kullanilir. izin verilen class veya interface'ler için
// non-sealed ->