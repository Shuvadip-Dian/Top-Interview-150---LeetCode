import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {

    private Map<Integer, Integer> valueToIndexMap;
    private List<Integer> values;
    private Random rand;

    public RandomizedSet() {
        valueToIndexMap = new HashMap<>();
        values = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (valueToIndexMap.containsKey(val)) {
            return false;
        }
        valueToIndexMap.put(val, values.size());
        values.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!valueToIndexMap.containsKey(val)) {
            return false;
        }
        int index = valueToIndexMap.get(val);                 
        int lastElement = values.get(values.size() - 1);
        values.set(index, lastElement);
        valueToIndexMap.put(lastElement, index);           
        values.remove(values.size() - 1);
        valueToIndexMap.remove(val);
        return true;
    }
    
    public int getRandom() {
        int randomIndex = rand.nextInt(values.size());
        return values.get(randomIndex);
    }
}