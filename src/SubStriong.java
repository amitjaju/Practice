public class SubStriong {
        public static void main(String[] args) {
            String str = "abcd";
            findAllSubstrings(str, 0, "");
        }

        public static void findAllSubstrings(String str, int index, String current) {
            if (index == str.length()) {
                if (!current.isEmpty()) {
                    System.out.println(current);
                }
                return;
            }
            findAllSubstrings(str, index + 1, current);
            findAllSubstrings(str, index + 1, current + str.charAt(index));
        }

}
