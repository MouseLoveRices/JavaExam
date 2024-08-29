package vatPham;

import java.util.Scanner;

public class CayGayChienThan extends VatPham{

    public CayGayChienThan(){
        setTenVatPham("Cay gay chien than");
    }
 
    public void nhapVatPham(){
        System.out.println("--Cay gay chien thuat--");
        super.nhapVatPham();
    }

    public void xuatVatPham(){
        super.xuatVatPham();
    }
}
