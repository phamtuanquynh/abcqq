public class Abc {
        public static void main(String[] args) {
            String input = " tx-2026-0042 ";
                
            String code = input.strip().toUpperCase();    

            boolean startsWithTx = code.startsWith("TX-");

            String[] parts = code.split("-");              
            String year = parts[1];                        

            boolean same = code.equals("TX-2026-0042");

            System.out.println("Mã chuẩn hoá: " + code);
            System.out.println("Bắt đầu bằng TX-: " + startsWithTx);
            System.out.println("Năm: " + year);
            System.out.println("Giống TX-2026-0042: " + same);
        }
    }

