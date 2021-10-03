package Pasta;

public interface PastaBuilder {
    public PastaBuilder getPastsName();
    public PastaBuilder addSauce();
    public PastaBuilder addFilling();
    public PastaBuilder addIngredient();
    public Pasta make();

}
