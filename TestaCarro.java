public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Audi");
        carro.setModelo("A3");
        carro.setPlaca("AN4L066");
        carro.setRenavam(35932450);

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getRenavam());
    }    
}
