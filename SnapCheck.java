import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnapCheck {
    public static void main(String[] args) {
        //String input= "haveaniceday";
        //String input="feedthedog";
        String input="chillout";
        //String input="if man was meant to stay on the ground god would have given us roots";
        input=input.replaceAll("\\s","");
        System.out.println("Input String "+input);
        int len=(int)Math.sqrt(input.length())+1;
        List<String> al=new ArrayList<>();
        char[] inputChar=input.toCharArray();
        int ptr=0;
        for(int i=0;i<=inputChar.length;i++){
            ptr++;
            if(ptr==len+1){
                ptr=1;
                al.add(input.substring(i-len,i));
            }
        }
        if(ptr!=1){
            al.add(input.substring(input.length()-ptr+1));
        }
        System.out.println(al);
        List<String> result=new ArrayList<>();
        for(int i=0;i<al.size()+1;i++){
            result.add("");
        }
        for(int i=0;i<al.size();i++){
            char[] listChar=al.get(i).toCharArray();
            for(int j=0;j<listChar.length;j++){
                result.set(j,result.get(j)+listChar[j]);
            }
        }
        System.out.println(result);
    }
}
