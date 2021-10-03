package Pasta;

public class Maker {
    private PastaBuilder builder;

    public Maker(PastaBuilder builder) {
        this.builder = builder;
    }

   public Pasta makePasta() {
        return builder.getPastsName().addSauce().addFilling().addIngredient().make();
    }
}
