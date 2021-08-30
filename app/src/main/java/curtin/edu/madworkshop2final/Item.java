package curtin.edu.madworkshop2final;

public abstract class Item {
    private String description;
    private int value;


    public Item(String desc, int value) {
        this.description = desc;
        this.value = value;
    }

    public String getDescription()
    {
        return this.description;
    }

    public int getValue()
    {
        return this.value;
    }
}