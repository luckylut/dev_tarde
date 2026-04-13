import static java.lang.IO.*;

void main() {
    IO.println("--- Tabuada ---");

    //IO.print("Digite o número da tabuada: ");
    //int num = Integer.parseInt(readln());

    int num = Integer.parseInt(readln("Digite o número da tabuada: "));

    //vamos usar o loop while - enquanto
    //valor inicial do loop
    int i =1;
    while (i <= 10){
        IO.println(i + " x " + num + "=" + (i * num));
        i++;
    }
    IO.print("Fim da tabuada");
}