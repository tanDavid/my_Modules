package sg.edu.rp.c346.id19002765.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewAP, textViewIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewAP = findViewById(R.id.textViewAP);
        textViewIP = findViewById(R.id.textViewIP);

        textViewAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Output.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Android Programming");
                intent.putExtra("academicYear",2020);
                intent.putExtra("semester",1);
                intent.putExtra("moduleCredit",4);
                intent.putExtra("venue","W66M");

                startActivity(intent);
            }
        });


        textViewIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Output.class);
                intent.putExtra("ModuleCode","C349");
                intent.putExtra("moduleName","iPad Programming");
                intent.putExtra("academicYear",2020);
                intent.putExtra("semester",1);
                intent.putExtra("moduleCredit",4);
                intent.putExtra("venue","W66M");

                startActivity(intent);
            }
        });
    }
}
