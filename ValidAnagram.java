import java.util.Scanner;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int count[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("String s: ");
        String s = sc.nextLine();
        
        System.out.println("String t: ");
        String t = sc.nextLine();

        ValidAnagram obj = new ValidAnagram();
        boolean result = obj.isAnagram(s, t);
        System.out.println(result);

        sc.close();
    }
}
