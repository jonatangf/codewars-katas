package com.jgarfer.katas.sixkyu.wholikesit;

public class WhoLikesIt {

    public static String whoLikesIt(String... string) {
        StringBuilder builder = new StringBuilder();

        if (string.length == 0) {
            builder.append("no one");
        } else {
            builder.append(string[0]);
            builder.append(string.length == 2 ? " and " + string[1] : "");
            builder.append(string.length >= 3 ? ", " + string[1] + " and " : "");
            builder.append(string.length >= 4 ?
                    string.length - 2 + " others" :
                    string.length > 2 ?
                            string[2] : "");
        }
        builder.append(" like");
        builder.append(string.length <= 1 ? "s" : "");
        builder.append(" this");
        return builder.toString();
    }
}
