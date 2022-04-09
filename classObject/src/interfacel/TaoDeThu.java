package interfacel;

public class TaoDeThu implements NhanVien ,AnimalSevice{

    @Override
    public void luong() {
        System.out.println("Hi");
    }

    @Override
    public void them() {

    }

    @Override
    public void sua() {

    }

    @Override
    public void xoa() {

    }

    public static void main(String[] args) {
        NhanVien nv = new TaoDeThu();
        AnimalSevice ae = new TaoDeThu();

        nv.luong();
    }
}
