package pl.kondziux1.inf04v2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        TextView rkemail = findViewById(R.id.emailRK);
        TextView rkpass = findViewById(R.id.passRK);
        TextView rkconfpass = findViewById(R.id.passconfirmRK);
        TextView rkstatus = findViewById(R.id.statusRK);

        Button rkconfirm = findViewById(R.id.btnconfirmRK);

        String[] kabelki = {"kelp","sexik","maslak"};

        rkconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int e = 0;
                rkstatus.setText("");
                String mail = rkemail.getText().toString();
                if (!mail.contains("@")){
                    e++;
                    rkstatus.append("no mail\n");
                }
                if (!rkpass.getText().toString().equals(rkconfpass.getText().toString())){
                    e++;
                    rkstatus.append("pass missmatch\n");
                }

                if (e==0) {
                    rkstatus.setText("działa styf");
                }else {
                    rkstatus.append("\nERR" + e);
                    rkstatus.append("\n"+rkpass.toString()+"\n"+rkconfirm.toString());
                }


            }
        });

    }

}