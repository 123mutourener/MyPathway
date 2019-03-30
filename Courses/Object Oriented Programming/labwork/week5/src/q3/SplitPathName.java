package q3;

public class SplitPathName {
    public static String[] splitPath(String s) {
        String[] components = new String[4];
        int lastSlash = s.lastIndexOf("/");
        components[0] = s.substring(0, lastSlash + 1);
        components[1] = s.substring(lastSlash + 1);
        int lastDot = components[1].indexOf(".");
        if(lastDot == -1) {
            lastDot = components[1].length();
        }
        components[2] = components[1].substring(0, lastDot);
        components[3] = components[1].substring(lastDot);
        return components;
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String[]components = splitPath(args[i]);
            System.out.printf("File: %s Type: %s [%s]\n", components[1], components[3], components[0]);
        }
    }
}