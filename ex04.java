public class ex04{ 
    public static void main(String[] args) {
        ex03 carro1 = new ex03("Fiat", "Palio");
        ex03 carro2 = new ex03("Chevrolet", "Prisma");

        carro1.getMarca();
        carro1.getModelo();

        carro2.getMarca();
        carro2.getModelo();

        carro1.exibirMensagem();
        carro1.acelerarCarro();

        carro2.exibirMensagem();
        carro2.frearCarro();

    }
}