package curtin.edu.madworkshop2final;

import java.util.List;

public class GameMap {
    public GameMap()
    {
        Area area1 = new Area();
        Area area2 = new Area();
        Area area3 = new Area();
        Area area4 = new Area();
        Area area5 = new Area();
        Area area6 = new Area();
        Area area7 = new Area();
        Area area8 = new Area();
        Area area9 = new Area();
        Area[][] grid = new Area[3][3];
        grid[0][0] = area1;
        grid[0][1] = area2;
        grid[0][2] = area3;
        grid[1][0] = area4;
        grid[1][1] = area5;
        grid[1][2] = area6;
        grid[2][0] = area7;
        grid[2][1] = area8;
        grid[2][2] = area9;
    }

    public int moveNorth(int currRow)
    {
        if(currRow != 0)
        {
            currRow--;
        }
        return currRow;
    }
    public int moveSouth(int currRow)
    {
        if(currRow != 2)
        {
            currRow++;
        }
        return currRow;
    }
    public int moveEast(int currCol)
    {
        if(currCol != 2)
        {
            currCol++;
        }
        return currCol;
    }
    public int moveWest(int currCol)
    {
        if(currCol != 0)
        {
            currCol--;
        }
        return currCol;
    }
    public boolean isTown(int currCol, int currRow)
    {
        return (currCol == 0 && currRow == 2) || (currCol == 2 && currRow == 2);
    }
}
