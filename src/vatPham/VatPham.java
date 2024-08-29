package vatPham;

import java.util.Scanner;

public class VatPham {
    protected String tenVatPham;
    protected double chiSoSucManh;
    protected double heSoSucManh;
    protected double soVang;
    protected double sucCongPha;

    public VatPham(){

    }

    public VatPham(String tenVatPham, double chiSoSucManh, double heSoSucManh, double soVang, double sucCongPha) {
        this.chiSoSucManh = chiSoSucManh;
        this.heSoSucManh = heSoSucManh;
        this.soVang = soVang;
        this.sucCongPha = sucCongPha;
    }

    public void nhapVatPham(){
        Scanner scanner = new Scanner(System.in);  
        System.out.print("-Nhap chi so suc manh: ");
        this.chiSoSucManh = scanner.nextDouble();
        System.out.print("-Nhap he so suc manh: ");
        this.heSoSucManh = scanner.nextDouble();
        System.out.print("-So vang quy doi tren 1 suc cong pha: ");
        this.soVang = scanner.nextDouble();  
    }

    public void xuatVatPham(){
        tinhSucCongPha();
        System.out.println(getTenVatPham()+"          "+getChiSoSucManh()+"          "+getHeSoSucManh()+"       "+getSoVang()+"                 "+getSucCongPha());
    }

    public double tinhSucCongPha(){
        this.sucCongPha =  (this.chiSoSucManh*this.heSoSucManh);
        setSucCongPha(this.sucCongPha);
        return this.sucCongPha;
    }


    public double getChiSoSucManh() {
        return chiSoSucManh;
    }

    public void setChiSoSucManh(double chiSoSucManh) {
        this.chiSoSucManh = chiSoSucManh;
    }

    public double getHeSoSucManh() {
        return heSoSucManh;
    }

    public void setHeSoSucManh(double heSoSucManh) {
        this.heSoSucManh = heSoSucManh;
    }

    public double getSoVang() {
        return soVang;
    }

    public void setSoVang(double soVang) {
        this.soVang = soVang;
    }

    public double getSucCongPha() {
        return sucCongPha;
    }

    public void setSucCongPha(double sucCongPha) {
        this.sucCongPha = sucCongPha;
    }

    public String getTenVatPham() {
        return tenVatPham;
    }

    public void setTenVatPham(String tenVatPham) {
        this.tenVatPham = tenVatPham;
    }

    

}
