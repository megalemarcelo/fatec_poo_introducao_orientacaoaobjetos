import java.util.Scanner;

public class ex02{
    public static void main(String[] args) {
    
        ex01 carro1 = new ex01();

        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nDigite a marca do carro 1:\n");
        String marca1 = scanner.nextLine();

        System.out.printf("\nDigite o modelo do carro 1:\n");
        String modelo1 = scanner.nextLine();

        carro1.setMarca(marca1);
        carro1.setModelo(modelo1);


        ex01 carro2 = new ex01();

        System.out.printf("\nDigite a marca do carro 2:\n");
        String marca2 = scanner.nextLine();

        System.out.printf("\nDigite o modelo do carro 2:\n");
        String modelo2 = scanner.nextLine();

        carro2.setMarca(marca2);
        carro2.setModelo(modelo2);

        carro1.exibirMensagem();
        carro1.acelerarCarro();
        
        carro2.exibirMensagem();
        carro2.frearCarro();

        carro1.getMarca();
        carro1.getModelo();

        carro2.getMarca();
        carro2.getModelo();

        scanner.close();

    }

}