package curtin.edu.madworkshop2final;

import android.graphics.BitmapShader;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private List<Item> items;

    public Area()
    {
        items = new ArrayList<>();
        Food banana = new Food("Banana", 5, 5);
        Food apple = new Food("Apple", 3, 3);
        Food cake = new Food("Cake", 10, 20);
        Food flesh = new Food("Flesh", 1, 1);
        Food healthPotion = new Food("Health Potion", 30, 100);
        Equipment sword = new Equipment("Sword", 20, 10);
        Equipment axe = new Equipment("Axe", 30, 5);
        Equipment shield = new Equipment("Shield", 10, 10);
        Equipment chainsaw = new Equipment("Chainsaw", 30, 30);
        Equipment armor = new Equipment("Armor", 20, 40);
        //Adding to list
        items.add(banana);
        items.add(apple);
        items.add(cake);
        items.add(flesh);
        items.add(healthPotion);
        items.add(sword);
        items.add(axe);
        items.add(shield);
        items.add(chainsaw);
        items.add(armor);
    }

    public List<Item> getItems()
    {
        return items;
    }
}
