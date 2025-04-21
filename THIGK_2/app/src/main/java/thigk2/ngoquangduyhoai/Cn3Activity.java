package thigk2.ngoquangduyhoai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.List;
public class Cn3Activity extends AppCompatActivity {
    ListView lvBaiHat;
    ArrayList dsBaiHat;

    void TimDieuKhien(){
        lvBaiHat = findViewById(R.id.lvBaiHat);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();

        dsBaiHat = new ArrayList<String>();
        dsBaiHat.add("Tien Ve Sai Gon");
        dsBaiHat.add("Giai Phong Mien Nam");
        dsBaiHat.add("Dat nuoc tron niem vui");
        dsBaiHat.add("Bai ca thong nhat");
        dsBaiHat.add("Mua xuan tren thanh pho HCM");
        ArrayAdapter<String> adapterBaiHat;
        adapterBaiHat = new ArrayAdapter<String>(Cn3Activity.this, android.R.layout.simple_list_item_1, dsBaiHat);

        lvBaiHat.setAdapter(adapterBaiHat);

        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) { // Kiểm tra nếu chọn "TVSG"
                    Intent iMRMSC = new Intent(Cn3Activity.this, LVBH_TVSG.class);
                    startActivity(iMRMSC);
                }
                if (position == 1) { // Kiểm tra nếu chọn "GPMN"
                    Intent iHTCA = new Intent(Cn3Activity.this, LVBH_GPMN.class);
                    startActivity(iHTCA);
                }
                if (position == 1) { // Kiểm tra nếu chọn "DNTNV"
                    Intent iHTCA = new Intent(Cn3Activity.this, LVBH_DNTNV.class);
                    startActivity(iHTCA);
                }
                if (position == 1) { // Kiểm tra nếu chọn "BCTN"
                    Intent iHTCA = new Intent(Cn3Activity.this, LVBH_BCTN.class);
                    startActivity(iHTCA);
                }
                if (position == 1) { // Kiểm tra nếu chọn "MXTTPHCM"
                    Intent iHTCA = new Intent(Cn3Activity.this, LVBH_MXTTPHCM.class);
                    startActivity(iHTCA);
                }
            }
        });
    }
}