import static java.lang.IO.*;

void main() {
    IO.println("-- tabuada --");
    int num = Integer.parseInt(readln("Digite o número da tabuada: "));

    int i = 1;
    do{
        IO.println(i + " x " + num + " = " + (i * num));
        i++;
    } while (i <= 10);

    IO.print("Fim da tabuada");
}