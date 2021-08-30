package curtin.edu.madworkshop2final;

public class Player {
    private int rowLocation, colLocation, cash, equipmentMass;
    private double health;
    public Player()
    {
        health = 100;
        cash = 0;
        rowLocation = 1;
        colLocation = 1;
        equipmentMass = 0;
    }

    public void playerReset()
    {
        health = 100;
        cash = 0;
        rowLocation = 1;
        colLocation = 1;
        equipmentMass = 0;
    }

    public void addMass(int mass)
    {
        equipmentMass = equipmentMass + mass;
    }

    public int getEquipmentMass()
    {
        return equipmentMass;
    }

    public double getHealth()
    {
        return health;
    }

    public void addCash(int inCash)
    {
        cash = cash + inCash;
    }

    public int getCash()
    {
        return cash;
    }

    public void setHealth(double newHp)
    {
        health = newHp;
    }

    public int currRow()
    {
        return rowLocation;
    }

    public void setRow(int row)
    {
        rowLocation = row;
    }

    public void setCol(int col)
    {
        colLocation = col;
    }

    public int currCol()
    {
        return colLocation;
    }
}
