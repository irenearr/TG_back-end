package Extra;

public class BerekeningEpoch {
    public static void main(String[] args) {
//        long epoch = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse("01/01/1970 01:00:00").getTime() /1000;
//        System.out.println(epoch);
        long epoch = 1606568458;
        String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date (epoch*1000));
        System.out.println(date);
    }
}
