public class CompareTo {
    public static void main(String args[])
    {
        String s1="abc";
        String s2="abcd";
        System.out.println("s1.compareTo(s2)"+ " " + s1.compareTo(s2));//前缀相同则比较长度，长度差 -1
        System.out.println("s1.compareTo(s2)"+ " " +s1.compareTo("abcdefgh"));//长度差 -5
        String s3="abc";
        String s4="ae";
        System.out.println("s3.compareTo(s4)"+ " " +s3.compareTo(s4));//只比较第一个不同的字符处 b - e = -3
        String s5="abcdeg";
        String s6="acce";
        System.out.println("s5.compareTo(s6)"+ " " +s5.compareTo(s6));// b - c = -1
        String s7="abc";
        String s8="abb";
        System.out.println("s7.compareTo(s8)"+ " " +s7.compareTo(s8));// c - b = 1
        String s9="abc";
        String s0="abaaaaaaaaaaaaa";
        System.out.println("s9.compareTo(s0)"+ " " +s9.compareTo(s0));// c - a = 2
        // 只比较第一个不同的字符处，与长度无关

        String sa="我";
        System.out.println("s9.compareTo(s0)"+ " " +s9.compareTo("喔"));// -2811
        // 因为是 Unicode 编码可以比较汉字
    }
}
