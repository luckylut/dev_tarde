import static java.lang.IO.*;

void main() {
    IO.println("-- Tabuada--");

    int num = Integer.parseInt(readln("Digite o número da tabuada: "));

    for(int i = 0; i <= 10; i++){
        IO.println(i + " x " + num + " = " + (i * num));
    }
    IO.print("Fim da tabuada");
}