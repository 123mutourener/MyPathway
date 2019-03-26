package q3;

public class AbsolutePath {
    public static String ensureAbsolute(String path) {
        if (path.startsWith("/")) {
            return path;
        } else {
            String prefix = System.getProperty("user.dir");
            return prefix + "/" + path;
        }
    }

    public static String[] absoluteSplitPath(String s) {
        return SplitPathName.splitPath(s);
    }

    public static void main(String[] args) {
        String relativeFile = "data.txt";
        relativeFile = ensureAbsolute(relativeFile);
        System.out.println(relativeFile);
        String[] components = absoluteSplitPath(relativeFile);
        System.out.printf("File: %s Type: %s [%s]\n", components[1], components[3], components[0]);
    }
}