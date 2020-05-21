package sg.edu.rp.c346.id19002765.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    TextView tvModuleCode, tvModuleName, tvAcademic, tvSemester, tvModuleCredit, tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        tvModuleCode = findViewById(R.id.textView);
        tvModuleName = findViewById(R.id.textView2);
        tvAcademic = findViewById(R.id.textView3);
        tvSemester = findViewById(R.id.textView4);
        tvModuleCredit = findViewById(R.id.textView5);
        tvVenue = findViewById(R.id.textView6);

        Intent intentReceived = getIntent();
        String ModuleCode = intentReceived.getStringExtra("ModuleCode");
        String ModuleName = intentReceived.getStringExtra("ModuleName");
        int academicYear = intentReceived.getIntExtra("academicYear", 0);
        int semester = intentReceived.getIntExtra("semester", 0);
        int moduleCredit = intentReceived.getIntExtra("moduleCredit", 0);
        String venue = intentReceived.getStringExtra("venue");

        tvModuleCode.setText("Module Code: " + ModuleCode);
        tvModuleName.setText("Module Name: " + ModuleName);
        tvAcademic.setText("Academic Year: " + academicYear);
        tvSemester.setText("Semester: " + semester);
        tvModuleCredit.setText("Module Credit: " + moduleCredit);
        tvVenue.setText("Venue: " + venue);

        

    }
}
