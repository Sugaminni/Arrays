public class StringUtils {

    public static int findChar(String s, char target){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
