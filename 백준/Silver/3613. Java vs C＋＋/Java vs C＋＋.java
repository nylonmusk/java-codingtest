import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean isJavaNaming = false;
    static boolean isAllLowerCase = true;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());

        if(!(isValidCppNaming(sb) && isValidJavaNaming(sb) && checkNamingConvention(sb))){
            System.out.println("Error!");
            return;
        }

        if(isAllLowerCase){
            System.out.println(sb.toString());
            return;
        }

        if(isJavaNaming) sb = convertJavaToCppNaming(sb);
        else sb = convertCppToJavaNaming(sb);

        System.out.println(sb.toString());
    }

    public static boolean checkNamingConvention(StringBuilder sb){
        int upperCaseCount = 0;
        int underscoreCount = 0;

        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch >= 'A' && ch <= 'Z') upperCaseCount = 1;
            else if(ch == '_') underscoreCount = 1;
        }

        isAllLowerCase = (underscoreCount == 1 || upperCaseCount == 1) ? false : true;

        if((underscoreCount & upperCaseCount) == 0 || isAllLowerCase) {
            isJavaNaming = (underscoreCount == 1) ? false : true;
            return true;
        } else return false;
    }

    public static boolean isValidCppNaming(StringBuilder sb){
        if(sb.charAt(sb.length()-1) == '_' || sb.charAt(0) == '_' || sb.indexOf("__") >= 0) {
            return false;
        }
        return true;
    }

    public static boolean isValidJavaNaming(StringBuilder sb){
        return !(sb.charAt(0) >= 'A' && sb.charAt(0) <= 'Z');
    }

    public static StringBuilder convertJavaToCppNaming(StringBuilder sb){
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                sb.replace(i, i+1, String.valueOf(ch).toLowerCase());
                sb.insert(i, "_");
            }
        }
        return sb;
    }

    public static StringBuilder convertCppToJavaNaming(StringBuilder sb){
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '_'){
                sb.deleteCharAt(i);
                sb.replace(i, i+1, String.valueOf(sb.charAt(i)).toUpperCase());
            }
        }
        return sb;
    }
}
