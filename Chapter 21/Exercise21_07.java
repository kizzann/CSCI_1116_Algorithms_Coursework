import java.util.*;

public class Exercise21_07 {
    public static void main(String[] args) {
        String text = "Good morning. Have a good class. " + "Have a good visit. Have fun!";

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split("[\\s+\\p{P}]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (!key.isEmpty()) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                }
                else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        ArrayList<WordOccurence> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet())
            list.add(new WordOccurence(entry.getKey(), entry.getValue()));

        Collections.sort(list);

        System.out.println(list);
    }
}
