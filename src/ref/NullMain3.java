package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bingData.count = " + bigData.count);
        System.out.println("bingData.data = " + bigData.data);

        //NullPointerException 발생
        System.out.println("bingData.value = " + bigData.data.value);
    }
}
