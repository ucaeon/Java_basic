package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bingData.count = " + bigData.count);
        System.out.println("bingData.data = " + bigData.data);

        //NullPointerException 발생
        System.out.println("bingData.value = " + bigData.data.value);
    }
}