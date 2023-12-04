package com.example.account_book;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class random extends AppCompatActivity {
    public TextView messageTextView;
    public Button generateButton;

    // 왜 안돌아갈까.. exteds App 어쩌고로 해도 안됨 이거뭐임 왜이래
   public String[] messages = {
            "부자되세요",
            "좋은 일이 생길거에요",
            "행운을 빕니다!",
            "행복한 하루 되세요!",
            "오늘도 좋은 하루 되세요!",
            "행복한 순간을 만끽하세요.",
            "모든 일이 잘 될 거에요!",
            "응원합니다"
    };

    @Override
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender);

        messageTextView = findViewById(R.id.messageTextView);
        generateButton = findViewById(R.id.generateButton);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RandomMessage();
            }
        });
    }
    public void RandomMessage() {
        Random random = new Random();
        int randomIndex = random.nextInt(messages.length);
        String randomMessage = messages[randomIndex];
        messageTextView.setText(randomMessage);
    }

}
