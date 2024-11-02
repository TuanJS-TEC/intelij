import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Shipping extends Frame {
    private List<Shipper> shippers;
    private List<String> khuVucOptions;
    private Choice khuVucChoice;
    private Label giaVanChuyenLabel;

    public Shipping() {
        // Khởi tạo danh sách shipper mẫu
        shippers = new ArrayList<>();
        shippers.add(new Shipper("Công ty A", "Địa chỉ A", "0123456789", "emailA@example.com", "Hà Nội", 10000));
        shippers.add(new Shipper("Công ty B", "Địa chỉ B", "0123456788", "emailB@example.com", "TP. Hồ Chí Minh", 15000));
        shippers.add(new Shipper("Công ty C", "Địa chỉ C", "0123456787", "emailC@example.com", "Đà Nẵng", 12000));

        khuVucOptions = new ArrayList<>();
        for (Shipper shipper : shippers) {
            khuVucOptions.add(shipper.getKhuVucVanChuyen());
        }

        // Thiết lập giao diện
        setTitle("Chọn Khu Vực Giao Hàng");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Dropdown cho lựa chọn khu vực
        khuVucChoice = new Choice();
        for (String khuVuc : khuVucOptions) {
            khuVucChoice.add(khuVuc);
        }

        // Nút chọn khu vực
        Button selectButton = new Button("Chọn Khu Vực");
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = khuVucChoice.getSelectedIndex();
                Shipper selectedShipper = shippers.get(index);
                giaVanChuyenLabel.setText("Giá vận chuyển: " + selectedShipper.getGiaVanChuyen() + " VND");
            }
        });

        // Label hiển thị giá vận chuyển
        giaVanChuyenLabel = new Label("Giá vận chuyển: 0 VND");

        // Thêm các thành phần vào cửa sổ
        add(new Label("Chọn khu vực giao hàng:"));
        add(khuVucChoice);
        add(selectButton);
        add(giaVanChuyenLabel);

        // Xử lý sự kiện đóng cửa sổ
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        pack(); // Tự động điều chỉnh kích thước cửa sổ
    }

    // Phương thức chạy ứng dụng
    public static void main(String[] args) {
        Shipping app = new Shipping();
        app.setVisible(true);
    }
}
