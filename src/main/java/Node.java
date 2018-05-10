public class Node  {
    public int value;
    public Node left;
    public Node right;
    public void store(int value){
        if(value<this.value){
            if(left ==null){
                left = new Node();
                left.value=value;
            }else{
                left.store(value);
            }
        }else if(value>this.value){
            if(right ==null){
                right = new Node();
                right.value = value;
            }else{
                right.store(value);
            }
        }
    }
    public boolean find(int value){
        System.out.println("happen"+this.value);
        if(value==this.value){
            return true;
        }else if (value>this.value){
            return right.find(value);
        }else{
            if (left==null){
                return false;
            }else{
                return left.find(value);
            }
        }
    }
    public void preList(){
        System.out.println(this.value+",");
        if (left!=null)left.preList();
        if (right!=null)right.preList();
    }
    public void afterList(){
        if (left!=null)left.afterList();
        if (right!=null)right.afterList();
        System.out.println(this.value+",");
    }
    public void middleList(){
        if (left!=null)left.middleList();
        System.out.println(this.value+",");
        if (right!=null)right.middleList();
    }
    public String replaceSpace(StringBuffer str) {
        int spacenum = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
                spacenum++;
            }
        }
        int indexold = str.length()-1;
        int newlength = str.length()+spacenum*2;
        int indexnew = newlength-1;
        str.setLength(newlength);
        for(;indexold>=0&&indexold<newlength;--indexold){
            if (str.charAt(indexold)=='1'){
                str.setCharAt(indexnew--,'0');
                str.setCharAt(indexnew--,'2');
                str.setCharAt(indexnew--,'%');
            }else{
                str.setCharAt(indexnew--,str.charAt(indexold));
            }
        }
        return str.toString();
    }
    public static void main(String arg[]){
//        int[] data = new int[20];
//        for (int i = 0; i <data.length ; i++) {
//            data[i] = (int)(Math.random()*100)+1;
//            System.out.print(data[i] +",");
//        }
//        System.out.println();
//        Node root = new Node();
//        root.value = data[0];
//        for(int i=1;i<data.length;i++){
//            root.store(data[i]);
//        }
//        root.find(data[19]);
//        root.preList();
//        System.out.println();
//        root.middleList();
//        System.out.println();
//        root.afterList();
        System.gc();
        Node root= new Node();
        StringBuffer str1 = new StringBuffer();
        str1.append("We are happy");
        root.replaceSpace(str1);
    }

}
