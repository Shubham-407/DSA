package Array_list;

import java.util.List;

public class ItemMatcher {
    public static int countMatchingItems(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }
        
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = List.of(
            List.of("phone", "blue", "pixel"),
            List.of("computer", "silver", "lenovo"),
            List.of("phone", "gold", "iphone")
        );

        String ruleKey = "color";
        String ruleValue = "silver";

        int matchingCount = countMatchingItems(items, ruleKey, ruleValue);

        System.out.println("Number of matching items: " + matchingCount);
    }
}

