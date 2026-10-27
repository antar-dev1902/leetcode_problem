
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder sb = new StringBuilder();

        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(' ');
            }
        }

        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String i : banned) {
            list.add(i);
        }

        for (String a : sb.toString().split("\\s+")) {
            if (!a.isEmpty()) {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
        }

        String result = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!list.contains(entry.getKey())) {
                if (entry.getValue() > max) {
                    result = entry.getKey();
                    max = entry.getValue();
                }
            }
        }

        return result;
    }
}
