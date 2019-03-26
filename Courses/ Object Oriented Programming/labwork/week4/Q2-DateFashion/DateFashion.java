public class DateFashion {
    public static int dateFashion(int you, int date) {
        int result = 0;
        if(you <= 2 || date <= 2) {
            result = 0;
        } else if(you >= 8 || date >= 8) {
            result = 2;
        }else{
            result = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int you = Integer.parseInt(args[0]);
        int date = Integer.parseInt(args[1]);
        System.out.println(dateFashion(you, date));
    }
}