public class String4 {

    public static void main(String[] args) {
        String str = "abbas12";
        System.out.println("MY String : " + str);
        int rotateby = 2;
        System.out.println(lefrotate(str, rotateby));
        System.out.println(rightrotate(str, 3));

    }

    private static String rightrotate(String str, int i) {
        String ans1 = lefrotate(str, str.length() - i);
        return ans1;
    }

    private static String lefrotate(String str, int rotateby) {
        String ans = str.substring(rotateby) + str.substring(0, rotateby);

        return ans;

    }

}
