package vatPham;


public class BaoTaySamSet extends VatPham{

    public BaoTaySamSet(){
        setTenVatPham("Bao tay sam set");
    }
    
    public void nhapVatPham(){
        System.out.println("--Bao tay sam set--");
        super.nhapVatPham();
    }

    public void xuatVatPham(){
        super.xuatVatPham();
    }

}
