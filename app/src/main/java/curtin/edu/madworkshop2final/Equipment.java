package curtin.edu.madworkshop2final;

public class Equipment extends Item {
    private double mass;
    public Equipment(String desc, int value, double mass)
    {
        super(desc, value);
        this.mass = mass;
    }
}
