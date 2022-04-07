public class ex03 {
    
    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ex03(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerarCarro() {
        System.out.printf("\nCarro acelerando\n");
    }

    public void frearCarro() {
        System.out.printf("\nCarro freando\n");
    }

    public void exibirMensagem() {
        System.out.printf("\n\n- CARRO\nMarca: %s\nModelo: %s", this.marca, this.modelo);
    }

}