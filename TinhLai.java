import  java.util.Locale;
import  java.math.BigDecimal;
import  java.math.RoundingMode;


public class TinhLai {
    static BigDecimal tinhLai(BigDecimal goc, BigDecimal laiSuat, BigDecimal thang ,RoundingMode lamTron) {
        BigDecimal tienLai = goc.multiply(laiSuat).multiply(thang);
        return tienLai.divide(new BigDecimal("12"), 0 ,lamTron);
    }
    public static void main(String[] args) {
        Locale vn = Locale.forLanguageTag("VIE");
        BigDecimal goc = new BigDecimal("100_000_000");
        BigDecimal thang = new BigDecimal("6");
        BigDecimal laiSuat = new BigDecimal("0.047");
        BigDecimal up = tinhLai(goc,laiSuat,thang,RoundingMode.HALF_UP);
        BigDecimal even =tinhLai(goc,laiSuat,thang,RoundingMode.HALF_EVEN);
        System.out.println(String.format(vn,"HALF_UP   :   %,d đ" ,up.longValueExact()));
        System.out.println(String.format(vn,"HALF_EVEN  :   %,d đ", even.longValueExact()));



    }
}
