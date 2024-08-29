package vatPham;

import java.util.Scanner;

public class HonDaKichNo extends VatPham{
    
    public HonDaKichNo(){
        setTenVatPham("Hon da kich no");
    }

    public void nhapVatPham(){
        System.out.println("--Hon da kich no--");
        super.nhapVatPham();
    }

    public void xuatVatPham(){
        tinhSucCongPha();
        super.xuatVatPham();
        
    }
}
