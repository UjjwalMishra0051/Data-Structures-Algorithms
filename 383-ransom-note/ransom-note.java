class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Count ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            char c = ransomNote.charAt(i);

            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            }
            else {
                map1.put(c, 1);
            }
        }

        // Count magazine
        for (int i = 0; i < magazine.length(); i++) {

            char c = magazine.charAt(i);

            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            }
            else {
                map2.put(c, 1);
            }
        }

        // Compare both maps
        for (char c = 'a'; c <= 'z'; c++) {

            int count1 = 0;
            int count2 = 0;

            if (map1.containsKey(c)) {
                count1 = map1.get(c);
            }

            if (map2.containsKey(c)) {
                count2 = map2.get(c);
            }

            if (count1 > count2) { //map1 < map2
                return false;
            }
        }

        return true;
    }
}