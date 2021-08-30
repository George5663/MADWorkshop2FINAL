package curtin.edu.madworkshop2final;

public class Food extends Item {
    private double health;
    public Food(String desc, int value, double health)
    {
        super(desc, value);
        this.health = health;
    }
}
