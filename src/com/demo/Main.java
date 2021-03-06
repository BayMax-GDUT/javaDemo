package com.demo;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    private static int index = 0;

    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = null;
//        while((input = br.readLine()) != null) {
//            System.out.println(titleToNumber(input));
//        }
//        int i = 50;
//        while(i > 0) {
//            System.out.println(new Random().nextInt(10) + 1);
//            i--;
//        }
        Date startDate = new Date("2020/9/25");
        Date endDate = new Date("2020/10/10");
        Date temp = startDate;
        Set<Date> dateSet = new HashSet<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        temp = simpleDateFormat.parse(simpleDateFormat.format(temp));
        calendar.setTime(temp);
        for(int i = 0; !temp.after(endDate); i++) {
            System.out.println(calendar.getTime());
            calendar.add(Calendar.DATE, 1);
            temp = calendar.getTime();
        }

    }

    /**
     * 联奕科技面试题 考验递归
     * @param num
     * @return
     */
    private static int x(int num) {
        index++;
        if (num <= 3) {
            return 1;
        } else {
            return x(num - 2) + x(num - 4) + 1;
        }
    }

    public static int titleToNumber(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            char charTemp = s.charAt(s.length() - i - 1);
            int intTemp = charTemp - 'A' + 1;
            result += intTemp * Math.pow(26, i);
        }
        return result;
    }

    public static int getDouble(int row) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        lists.add(list1);
        for (int i = 1; i < row; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> before = lists.get(lists.size() - 1);
            for (int j = 0; j < before.size() + 2; j++) {
                list.add((j - 2 < 0 ? 0 : before.get(j - 2)) + (j - 1 < 0 || j - 1 >= before.size() ? 0 : before.get(j - 1)) + (j >= before.size() ? 0 : before.get(j)));
            }
            lists.add(list);
        }
        List<Integer> result = lists.get(row - 1);
        int index = 0;
        for (Integer integer : result) {
            int temp = integer % 2;
            if (temp == 0) return index;
            index++;
        }
        return -1;
    }
}
