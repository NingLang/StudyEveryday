package com.langer.algorithm.other;

import java.util.Stack;

public class GetLinuxPath {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";

        System.out.println(getPath(path));
    }

    public static String getPath(String path){
        String[] pathArr = path.split("/");
        String result = "";
        Stack <String> stack = new Stack<>();
        for (String s : pathArr) {
            if (s.equals("..")) {
                if (stack.empty()) {
                    continue;
                } else {
                    stack.pop();
                }
            }
            if (s.matches("[a-zA-Z0-9]+")) {
                stack.push(s);
            }
        }
        int size = stack.size();
        for(int i = 0; i < size; i++){
            if (result.equals("")){
                result = stack.pop();
            }else {
                result = stack.pop() + "/" + result;
            }
        }
        return "/" + result;
    }
}
