void main() {
    int i = 1, soma = 0;
    while (i <= 50){
        if(i % 2 == 0){
            soma += i;
        }
        i++;
    }
    System.out.print("Soma = " + soma);
}