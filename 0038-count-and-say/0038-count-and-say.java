class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String result = "1";
        for (int i = 2; i <= n; i++) {
            result = buildNext(result);
        }
        return result;
    }
    private String buildNext(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                sb.append(count).append(prev);
                prev = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(prev);
        return sb.toString();
    }
}