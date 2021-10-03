package Pasta;

public class Menu {
    public static void main(String[] args) {
        PastaBuilder builder = new Pasta_B();
        Maker maker = new Maker(builder);
        Pasta pasta1 = maker.makePasta();

        System.out.println();

        Pasta p = new Pasta_A();
        p.getPastsName()
                .addSauce()
                .addFilling()
                .addIngredient()
                .make();
    }
}
