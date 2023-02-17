public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            arr[ransomNote.charAt(i)%97]++;
        }
        for(int i=0;i<magazine.length();i++){
            int t = magazine.charAt(i)%97;
            if(arr[t] > 0)
                arr[t]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i] > 0)
                return false;
        }
        return true;
    }
}
