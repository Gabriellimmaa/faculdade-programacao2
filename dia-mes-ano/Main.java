import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Separador: ");
        String separador = teclado.nextLine();
        
        Data data = new Data();
	    System.out.println(data.formatarData(separador));

        Data data2 = new Data(2022);
	    System.out.println(data2.formatarData(separador));

        Data data3 = new Data(01, 06, 2021);
	    System.out.println(data3.formatarData(separador));
    }
}