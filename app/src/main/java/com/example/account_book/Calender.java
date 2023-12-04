package com.example.account_book;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.CalendarView;

public class Calender extends MainActivity {
    // exteds
    private static final String TAG = "CalendarActivity";
    private CalendarView CalendarView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.calender);

        CalendarView = (CalendarView) findViewById(R.id.calendarView);

        CalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i + "/" + (i1+1) + "/" + i2;
                Log.d(TAG, "onSelectDayChange: date : "+date);

                Intent intent = new Intent(Calender.this, MainActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
    }
}