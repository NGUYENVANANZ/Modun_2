package BTVN.Tren_lop;

import java.util.Scanner;

public class ManageCenter {
    CanBo[] canbo = {};
    Scanner sc = new Scanner(System.in);

    public CanBo thongtinCabo(){
        System.out.print("Nhập tên cán bộ: ");
        String name = sc.nextLine();

        System.out.print("Nhập Nggày sinh: ");
        String birth = sc.nextLine();

        System.out.print("Nhập giới tính: ");
        String sex = sc.nextLine();

        System.out.print("Nhập địa chỉ:");
        String address = sc.nextLine();

        System.out.println("Chọn loại nhân viên:        1. Công nhân         2. Kỹ sư          3. Nhân viên");
        int loai = Integer.parseInt(sc.nextLine());

        CanBo nvm;

        if (loai == 1){
            System.out.print("Nhập bậc của công nhân: ");
            double bac = Integer.parseInt(sc.nextLine());
            nvm = new CongNhan(name,birth,sex,address,bac);
        } else if (loai == 2) {
            System.out.print("Nhập ngành đào tạo của kỹ sư: ");
            String ngAnhDaoTao = sc.nextLine();
            nvm = new KySu(name, birth, sex, address, ngAnhDaoTao);
        }
        else {
            System.out.print("Nhập thông tin công việc của nhân viên: ");
            String jobInfomation = sc.nextLine();
            nvm = new NhanVien(name, birth, sex, address, jobInfomation);
        }
        return nvm;
    }

    public void Them(){
        CanBo nvm = thongtinCabo();
        CanBo[] cbm = new CanBo[canbo.length + 1];
        for (int i = 0; i < canbo.length; i++) {
            cbm[i] = canbo[i];
        }
        cbm[cbm.length - 1] = nvm;
        canbo = cbm;

    }

    public void TimKiem(){
        System.out.print("Nhập tên cần tìm kiếm: ");
        String name = sc.nextLine();

        for (int i = 0; i < canbo.length; i++) {
            if (canbo[i].getName().equals(name)){
                System.out.println(canbo[i].toString());
                break;
            }
        }
    }

    public void Show(){
        for (int i = 0; i < canbo.length; i++) {
            System.out.println(canbo[i].toString());
        }
    }
}
