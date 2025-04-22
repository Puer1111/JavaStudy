package javaMiddle.class3.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {

        String str= "Apple,Banana,Orange";

        //split
        String [] splitArr = str.split(",");
        for(String s: splitArr){
            System.out.println(s);
        }
        //join 1
        String joinStr = "";
        for(int i = 0; i<splitArr.length; i++){
            String string = splitArr[i];
            joinStr += string;
            if(i != splitArr.length-1){
                joinStr += ",";
            }
        }
        System.out.println("JoinStr = " + joinStr);
        // join2  -- join1 을 단순하게 하기 위함.
        String joinedStr = String.join("-","A","B","C");
        System.out.println("joinedStr = " + joinedStr);

    }
}
