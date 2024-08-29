package vatPham;

import java.util.Scanner;

public class CayRiuPhepThuat extends VatPham{
  
    public CayRiuPhepThuat(){
        setTenVatPham("Cay riu phep thuat");
    }

    public void nhapVatPham(){
            System.out.println("--Cay riu phep thuat--");
            super.nhapVatPham();
    }

    public void xuatVatPham(){
        super.xuatVatPham();
    }

}
