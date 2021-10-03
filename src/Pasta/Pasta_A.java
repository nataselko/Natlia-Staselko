package Pasta;

public class Pasta_A extends Pasta{

    private NamePasta name;
    private Sauce sauce;
    private Filling filling;
    private Ingredient ingredient;


    @Override
    public PastaBuilder getPastsName() {
        this.name = NamePasta.PASTA_A;
        System.out.println("Название: " + name);
        return this;
    }

    @Override
    public PastaBuilder addSauce() {
        this.sauce = Sauce.SAUCE_1;
        System.out.println("соус:"+ sauce);
        return this;
    }

    @Override
    public PastaBuilder addFilling() {
        this.filling = Filling.FILLING_3;
        System.out.println("начинка: " + filling);
        return this;
    }

    @Override
    public PastaBuilder addIngredient() {
        this.ingredient = Ingredient.INGREDIENT_3;
        System.out.println("добавка: " + ingredient);
        return this;
    }

    @Override
    public Pasta make() {
        Pasta pasta = new Pasta(name, sauce, filling, ingredient);
        return pasta;
    }

}
