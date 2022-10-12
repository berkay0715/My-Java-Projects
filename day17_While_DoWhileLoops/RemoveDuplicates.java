package day17_While_DoWhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBCC";
        String result = ""; // A

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (result.contains(ch)){ //  if the result already contains the character
                continue;// skips
        }
            result+=ch;
        }
        System.out.println(result);





    }
}
