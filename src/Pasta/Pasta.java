package Pasta;

public class Pasta implements PastaBuilder{
    private NamePasta name;
    private Sauce sauce;
    private Filling filling;
    private Ingredient ingredient;

    public Pasta() {
    }

    public Pasta(NamePasta name, Sauce sauce, Filling filling, Ingredient ingredient) {
        this.name = name;
        this.sauce = sauce;
        this.filling = filling;
        this.ingredient = ingredient;
    }

    @Override
    public PastaBuilder getPastsName() {
        return null;
    }

    @Override
    public PastaBuilder addSauce() {
        return null;
    }

    @Override
    public PastaBuilder addFilling() {
        return null;
    }

    @Override
    public PastaBuilder addIngredient() {
        return null;
    }

    @Override
    public Pasta make() {
        return null;
    }
}
