import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public  class demo {
    public static void  main(String arg[]) throws UnsupportedEncodingException {

//        String str ="我a爱中华 abc 我爱传智 def";
//        String str ="我 ABC 汉";
//        int num =trimGBK(str.getBytes("GBK"),7);
//        System.out.println(num);
//        System.out.println(str.substring(0,num));
        String content = "中国aadf的111萨bbb菲的zz萨菲";
        HashMap map = new HashMap();
        for(int i=0;i<content.length();i++) {
            char c = content.charAt(i);
            Integer num = (Integer) map.get(c);
            if (num == null)
                num = 1;
            else
                num = num + 1;
            map.put(c, num);
        }
        Set set = map.entrySet();
        for( Object set1: set){
            Map.Entry entry = (Map.Entry)set1;
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
    }

    public  static  int trimGBK(byte[] buf, int n){
        int num=0;
        boolean bChineseFirstHalf = false;
        for(int i=0;i<n;i++){
                if(buf[i]<0&& !bChineseFirstHalf){
                    bChineseFirstHalf= true;
                }else {
                    num++;
                    bChineseFirstHalf=false;
                }
            }
            return num;
    }
}
