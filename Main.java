import java.util.HashMap;

class Main {
public static void main(String[] args) {
    
    HashMap<String, Integer> areaCodeMap = new HashMap<>();

    areaCodeMap.put("New York", 200);
    areaCodeMap.put("Los Angeles", 310);
    areaCodeMap.put("Seattle", 206);
    areaCodeMap.put("Miami", 305);
    areaCodeMap.put("New York", 212);
    areaCodeMap.put("Houston",713);

    System.out.println();
    System.out.println("The size of this map is: " + areaCodeMap.size());

    System.out.println();
    System.out.println(areaCodeMap.entrySet());

    System.out.println();
    areaCodeMap.remove("Houston");
    System.out.println(areaCodeMap);

    //Prints line if the city has an area code entry in the hash map
    System.out.println();
    if (areaCodeMap.containsKey("Miami")) {
        System.out.println("Miami's area code is: " + areaCodeMap.get("Miami"));
        System.out.println();
        System.out.println("Seattle is the best city? " + areaCodeMap.containsValue(206));
    }
    System.out.println();

    for (String key : areaCodeMap.keySet()) {
        System.out.println("The area code for " + key + " is: " + areaCodeMap.get(key));
    }
    }
}