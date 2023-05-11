package sg.edu.rp.c346.id22045554.week04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    TextView tvDisplay;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        btnReset = findViewById(R.id.reset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String hour = "" + tp.getHour();
                String min = "" + tp.getMinute();
                String setTime = "Time is " + hour +":"+ min;
                tvDisplay.setText(setTime);
            }
        });



        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String year = "" + dp.getYear();
                String month = "" + dp.getMonth();
                String day = "" + (dp.getDayOfMonth()+1);
                String setDate = "Date is " + day + "/" + month + "/"  + year;
                tvDisplay.setText(setDate);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setHour(0);
                tp.setMinute(00);
                dp.updateDate(2020,00,01);
                tvDisplay.setText("");
            }
        });





    }
}