package thigk2.ngoquangduyhoai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cn2Activity extends AppCompatActivity {
    EditText edtThang, edtNam, edtKetQua;
    Button btnKiemTra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtThang = findViewById(R.id.edtsoA);
        edtNam = findViewById(R.id.edtsoB);
        edtKetQua = findViewById(R.id.edtKetQua);
        btnKiemTra = findViewById(R.id.btnTong);
        btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String thang = edtThang.getText().toString().trim();
                String nam = edtNam.getText().toString().trim();


                if (thang.equals("4") && nam.equals("1975")) {
                    edtKetQua.setText("Đúng! Tháng 4 năm 1975");
                } else {
                    edtKetQua.setText("Sai gòi");
                }
            }
        });
    }
}