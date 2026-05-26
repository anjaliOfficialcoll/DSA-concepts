package recursion;



public class RemoveDupl {
    public static void main(String[] args) {
        String s="appnnacollege";
        removeDuplicate(s,0,new boolean [26],new StringBuilder(""));

        

    }

    private static void removeDuplicate(String s, int i, boolean[] map, StringBuilder result) {
        //base casse
        if(i==s.length()){
            System.out.println(result);

            return ;
        }

        if(map[s.charAt(i)-'a']==true){
            removeDuplicate(s,i+1,map,result);
        }else {
            map[s.charAt(i)-'a']=true;
            removeDuplicate(s,i+1,map,result.append(s.charAt(i)));

        }
        
    }
    
}
