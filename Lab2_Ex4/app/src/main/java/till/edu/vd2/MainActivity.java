package till.edu.vd2;
import  android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Khai báo các đối tượng gắn với điều khiển
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
    }
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ  = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);

    }

    // Xử lý Cộng
    public void XuLyCong(View v ){
        //B1. Lấy dữ liệu 2 số
        //B1.1. Tìm Edittext số 1 và số 2


        //B1.2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //B1.3 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        //B2. Tính toán
        float Tong = soA + soB;

        //B3. Hiện kết quả
        //B3.1

        //B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //B3.2 Gắn kết quả lên điều khiển
        editTextKQ.setText(chuoiKQ);
    }

    // Xử lý Trừ
    public void XuLyTru(View v ){
        //B1. Lấy dữ liệu 2 số
        //B1.1. Tìm Edittext số 1 và số 2


        //B1.2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //B1.3 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        //B2. Tính toán
        float Tong = soA - soB;

        //B3. Hiện kết quả
        //B3.1

        //B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //B3.2 Gắn kết quả lên điều khiển
        editTextKQ.setText(chuoiKQ);
    }

    // Xử lý Nhân
    public void XuLyNhan(View v ){
        //B1. Lấy dữ liệu 2 số
        //B1.1. Tìm Edittext số 1 và số 2


        //B1.2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //B1.3 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        //B2. Tính toán
        float Tong = soA * soB;

        //B3. Hiện kết quả
        //B3.1

        //B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //B3.2 Gắn kết quả lên điều khiển
        editTextKQ.setText(chuoiKQ);
    }

    // Xử lý chia
    public void XuLyChia(View v ){
        //B1. Lấy dữ liệu 2 số
        //B1.1. Tìm Edittext số 1 và số 2


        //B1.2 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //B1.3 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        //B2. Tính toán
        float Tong = soA / soB;

        //B3. Hiện kết quả
        //B3.1

        //B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //B3.2 Gắn kết quả lên điều khiển
        editTextKQ.setText(chuoiKQ);
    }



}