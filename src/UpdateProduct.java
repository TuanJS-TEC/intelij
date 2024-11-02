import java.awt.*;
import java.awt.event.*;

public class UpdateProduct extends Frame {
    private Warehouse warehouse; // Kho hàng
    private TextArea statusArea; // Khu vực hiển thị thông báo trạng thái

    public UpdateProduct() {
        // Tạo sản phẩm
        Product product = new Product("Product A", "Category 1", 50, 100, "Description A", "imageA.png");
        warehouse = new Warehouse(product, 0, 10); // Khởi tạo kho với 10 sản phẩm

        // Thiết lập giao diện
        setTitle("Thông tin Kho Hàng");
        setSize(400, 200);
        setLayout(new FlowLayout());

        // Khu vực hiển thị thông tin số lượng hiện có
        statusArea = new TextArea(5, 30);
        statusArea.setEditable(false); // Không cho phép chỉnh sửa
        displayStatus(); // Hiển thị thông tin kho hàng ngay khi mở ứng dụng

        // Thêm các thành phần vào cửa sổ
        add(statusArea);

        // Xử lý sự kiện đóng cửa sổ
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Phương thức hiển thị thông báo trạng thái
    private void displayStatus() {
        statusArea.setText("Sản phẩm: " + warehouse.getSp().getTenSP() +
                "\nSố lượng hiện có: " + warehouse.getHienCo() +
                "\nSố lượng đã bán: " + warehouse.getDaBan());
    }

    // Phương thức chạy ứng dụng
    public static void main(String[] args) {
        UpdateProduct app = new UpdateProduct();
        app.setVisible(true);
    }
}