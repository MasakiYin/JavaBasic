package pra;

import java.util.ArrayList;
public class Pra {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("山田太郎");
        list.add("小林次郎");
        list.add("佐藤三郎");
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(1));
        }
    }
}
