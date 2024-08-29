package vatPham;

import java.util.Scanner;

public class ChiecBuaThan extends VatPham{

    public ChiecBuaThan(){
        setTenVatPham("Chiec bua than");
    }

    public void nhapVatPham(){
        System.out.println("-----------------------"); 
        System.out.println("=*= Nhap Thong tin vat pham =*=");  
        System.out.println("--Chiec bua than--");
        super.nhapVatPham();
    }

    public void xuatVatPham(){        
        System.out.println("-----------------------");
    System.out.println("=*= Xuat thong tin vat pham =*=");
    System.out.println("Ten vat pham             | Chi so | He so| So vang quy doi | Suc cong pha");
        super.xuatVatPham();
    }
}
