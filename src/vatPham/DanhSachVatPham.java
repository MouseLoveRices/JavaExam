package vatPham;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class DanhSachVatPham {
    List<VatPham> vatPham;

    public DanhSachVatPham(){
        this.vatPham = new ArrayList<>();
    }


    public void tuyChonVatPham(){
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n======================");
            System.out.println("1.Nhap thong tin vat pham");
            System.out.println("2.Xuat thong tin vat pham");
            System.out.println("3.Tim vat pham ton nhieu xu nhat");
            System.out.println("4.Nhap xu Spon kiem duoc");
            System.out.println("5.thoat");
            System.out.print("--Nhap lua chon: ");
            int key = scanner.nextInt();
            if(key == 1){
                ChiecBuaThan chiecBua = new ChiecBuaThan();
                BaoTaySamSet baoTay = new BaoTaySamSet();
                HonDaKichNo honDa = new HonDaKichNo();
                CayRiuPhepThuat cayRiu = new CayRiuPhepThuat();
                CayGayChienThan cayGay = new CayGayChienThan();

                chiecBua.nhapVatPham();
                vatPham.add(chiecBua);

                baoTay.nhapVatPham();
                vatPham.add(baoTay);

                honDa.nhapVatPham();
                vatPham.add(honDa);

                cayRiu.nhapVatPham();
                vatPham.add(cayRiu);

                cayGay.nhapVatPham();
                vatPham.add(cayGay);
            }else if(key == 2){              
                for(VatPham danhSach: this.vatPham){
                    danhSach.xuatVatPham();
                }

            }else if(key == 3){   
                System.out.println("=*= Vat pham ton nhieu xu nhat =*=");                     
                Optional<VatPham> maxVang = this.vatPham.stream()
                .max(Comparator.comparingDouble(VatPham::getSoVang));

                if (maxVang.isPresent()) {
                    VatPham vatPhamCoVanglonNhat = maxVang.get();
                    System.out.println("Vat pham co tien dien lon nhat la: " + vatPhamCoVanglonNhat.getTenVatPham());
                    System.out.println("So vang: " + vatPhamCoVanglonNhat.soVang);
                } else {
                    System.out.println("Danh sach trong.");
                }                            
            }else if(key == 4){
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("-Nhap xu vang Spon kiem duoc: ");
                int xuVang = scanner2.nextInt();
                
                Double tongXuvatPham = this.vatPham.stream()
                                    .mapToDouble(VatPham::tinhSucCongPha)
                                    .sum();
                double tongSucCongPha = tongXuvatPham*10;
                if(xuVang>tongSucCongPha){
                    System.out.println("***Spon da cuu duoc dong doi***");
                }else{
                    System.out.println("Spon thua");
                }          

            }else if(key == 5){
                break;
            }

            }
        }
    }

