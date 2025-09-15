import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

class MapUsingHash {
    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);     // not good because it overrides
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MapUsingHash mp = new MapUsingHash();
        mp.put("Mango", "King of fruits");
        mp.put("Apple", "healthiest fruit");
        mp.put("Litchi", "Favourite");

        System.out.println(mp.get("Apple"));



        HashMap<String, Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("def", 2);
        map.put("ghi", 3);

        System.out.println(map.get("def"));
        System.out.println(map.getOrDefault("jkl", 4));
        System.out.println(map.containsKey("def"));

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(23);
        set.add(54);
        set.add(6);
        set.add(76);
        set.add(23);
        System.out.println(set);

        TreeMap<String, Integer> map2 = new TreeMap<>();   // treemaps stores in sorted order
        map2.put("abc", 1);
        map2.put("def", 2);
        map2.put("ghi", 3);
    }
}