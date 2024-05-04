// ติว summer นะจ่ะ
//  data = "ส้ม","มะนาว","มะม่วง","มะพร้าว","แอปเปิ้ล","องุ่น","มะละกอ"
public class array2 {
    public static void main(String[] args) {
        // เล็กหยิบใส่ถูง "มะนาว","มะม่วง","มะพร้าว"
        // ต้นหยิบใส่ถูง "แอปเปิ้ล","องุ่น","มะละกอ"
        // กล่องไนท์ ถูง1 "มะนาว","มะม่วง","มะพร้าว" ถูง2 "แอปเปิ้ล","องุ่น","มะละกอ"

        String data[][] = {
                { "มะนาว", "มะม่วง", "มะพร้าว", "ส้ม" },
                { "แอปเปิ้ล", "องุ่น", "มะละกอ" },
                { "ส้ม", "มะนาว" }
        };
        int N = 10;
        String data_1[][] = new String[N][N];

        // System.out.println(data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j] + i + "," + j);
            }
        }
    }
}
