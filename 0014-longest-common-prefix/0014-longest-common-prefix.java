class Solution {
    public String longestCommonPrefix(String[] strs) {

        String a = "";

        for (int i = 0; i < strs[0].length(); i++) {

            a += strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (!strs[j].startsWith(a)) {
                    return a.substring(0, a.length() - 1);
                }
            }
        }

        return a;
    }
}