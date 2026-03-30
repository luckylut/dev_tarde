import static java.lang.IO.*;
void main() {
    IO.print("Digite  a nota1: ");
    float n1 = Float.parseFloat(IO.readln());

    IO.print("Digite  a nota2: ");
    float n2 = Float.parseFloat(IO.readln());

    IO.print("Digite  a nota3: ");
    float n3 = Float.parseFloat(IO.readln());

    IO.print("Digite  a nota4: ");
    float n4 = Float.parseFloat(IO.readln());

    float mf = (n1 + n2 + n3 + n4) / 4;

    char conceito = ' ';
    if(mf <= 10.0 && mf >= 9) {
        conceito = 'A';
    } else if(mf >= 8.9) {
        conceito = 'B';
    } else if(mf >= 7.5) {
        conceito = 'C';
    } else if(mf >= 6.0) {
        conceito = 'D';
    }
    String situacao;

    if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
        situacao = "APROVADO";
    } else {
        situacao = "REPROVADO";
    }
    println("Notas: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
    println("Média: " + mf);
    println("Conceito: " + conceito);
    println("Situação: " + situacao);


}