package test;

import java.util.LinkedList;

/**
 * Created by ${陈广波} on 2020/8/26.
 */
public class Test2 {

    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();
//        list

        System.out.println(m("nhrwlbcc8m7c5hih9mhalw98k0322wf2jjm47kk3ntm9snfrflzzundn7d608usy049asxalzjk7izj6amcqhr8uubc04g52mcjboj2fmge2l6iarizfu4yve5o4i3srf5zgqbg82ckcotdeqp760mc9gzei5dzk5gj9x9yj05o3hle0ii64krkkp5i7blh7nbu3gu5vgi2scyn4yqx3z4vcjbyzhnqkh887izotjkg2l0mit0k14vyn39\n" + "t", 't'));

    }

    public static int m(String str, char a) {
        if (str == null) {
            return 0;
        }
        int j = 0;
        a = Character.toUpperCase(a);
        String s = str.toUpperCase();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == a) {
                j++;
            }
        }
        return j;
    }


}
