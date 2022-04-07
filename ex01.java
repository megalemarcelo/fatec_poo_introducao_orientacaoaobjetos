public class ex01 {
    
        private String marca;
        private String modelo;
       
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

        public String getModelo(){
        return modelo;
    }

    public void acelerarCarro() {
        System.out.printf("\nCarro acelerando");
    }

    public void frearCarro() {
        System.out.printf("\nCarro freando");
    }

    public void exibirMensagem() {
        System.out.printf("\nCARRO\nMarca: %s\nModelo: %s", this.getMarca(), this.getModelo());
    }

}