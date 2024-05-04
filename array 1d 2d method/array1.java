
// ติว summer นะจ่ะ
//  data = "ส้ม","มะนาว","มะม่วง","มะพร้าว","แอปเปิ้ล","องุ่น","มะละกอ"
import java.util.*;

public class array1 {
    public static void main(String[] args) {
        String data[] = { "ส้ม", "มะนาว", "มะม่วง", "มะพร้าว", "แอปเปิ้ล", "องุ่น", "มะละกอ" };// ค่าคงที่
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String data_1[] = new String[N];// กำหนดขนาด
        for (int i = 0; i < data_1.length; i++) {
            data_1[i] = data[i];
            System.out.println(data_1[i]);
        }

    }
}
