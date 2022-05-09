public class PlantarArvore {
    public static void main(String[] args) {
        Laranjeira laranjeira = new Laranjeira();
        laranjeira.setFolhas("Média");
        laranjeira.setRaizes("Profunda");
        laranjeira.setTronco(1);
        laranjeira.setFruto(true);

        System.out.println("Laranjeira ->");
        System.out.println("Folhas: " + laranjeira.getFolhas());
        System.out.println("Raízes: " + laranjeira.getRaizes());
        System.out.println("Nº de Tronco: " + laranjeira.getTronco());
        System.out.println("Tem fruto ?: " + laranjeira.isFruto());

    }
}
