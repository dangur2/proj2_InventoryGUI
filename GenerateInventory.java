import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateInventory {
    
    List<Item> allItems = List.of(new Item("iron sword", "/Sprites/iron_sword.png"), new Item("wand", "/Sprites/wand.png"), new Item("iron pickaxe", "/Sprites/iron_pickaxe.png")
    , new Item("ultra ball", "/Sprites/ultraball.png"), new Item("spoon", "/Sprites/spoon.png"), new Item("spear", "/Sprites/spear.png")
    , new Item("socks", "/Sprites/socks.png"), new Item("pokemon ball", "/Sprites/pokeball.png"), new Item("master wand", "/Sprites/master_wand.png")
    , new Item("knife", "/Sprites/knife.png"), new Item("greater ball", "/Sprites/greaterball.png"), new Item("greater wand", "/Sprites/greater_wand.png")
    , new Item("fork", "/Sprites/fork.png"), new Item("dagger", "/Sprites/dagger.png"));

    public ArrayList<Item> generateItems(int x){
        ArrayList<Item> generatedItems = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < x; i++){
            int randomItem = r.nextInt(0,allItems.size());
            Item item = allItems.get(randomItem);
            generatedItems.add(item);
        }
        return generatedItems;
    }
}
