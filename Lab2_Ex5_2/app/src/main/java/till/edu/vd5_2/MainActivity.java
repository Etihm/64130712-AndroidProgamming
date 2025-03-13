package till.edu.vd5_2;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtSoA;
    EditText edtSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView edtKetQua;
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
        TimView();
        // Gắn các bộ lắng nghe
        btnCong.setOnClickListener(boLangNgheXuLyCong);
        btnTru.setOnClickListener(boLangNgheXuLyTru);
        btnNhan.setOnClickListener(boLangNgheXuLyNhan);
        btnChia.setOnClickListener(boLangNgheXuLyChia);
    }

    View.OnClickListener boLangNgheXuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = edtSoB.getText().toString();
            String strSoB = edtSoB.getText().toString();
            // Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);
            // Tính toán
            double tong = soA + soB;
            // Xuất
            String strKQ = String.valueOf(tong);
            edtKetQua.setText(strKQ);
        }
    }

    View.OnClickListener boLangNgheXuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = edtSoB.getText().toString();
            String strSoB = edtSoB.getText().toString();
            // Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);
            // Tính toán
            double tong = soA - soB;
            // Xuất
            String strKQ = String.valueOf(tong);
            edtKetQua.setText(strKQ);
        }
    }

    View.OnClickListener boLangNgheXuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = edtSoB.getText().toString();
            String strSoB = edtSoB.getText().toString();
            // Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);
            // Tính toán
            double tong = soA * soB;
            // Xuất
            String strKQ = String.valueOf(tong);
            edtKetQua.setText(strKQ);
        }
    }

    View.OnClickListener boLangNgheXuLyChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = edtSoB.getText().toString();
            String strSoB = edtSoB.getText().toString();
            // Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);
            // Tính toán
            double tong = soA / soB;
            // Xuất
            String strKQ = String.valueOf(tong);
            edtKetQua.setText(strKQ);
        }
    }

    void TimView(){
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        edtKetQua = (TextView) findViewById(R.id.edtKetQua);
    }
}