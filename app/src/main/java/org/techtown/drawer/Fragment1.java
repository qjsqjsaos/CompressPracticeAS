package org.techtown.drawer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Fragment1 extends Fragment {
    EditText editText_name;
    EditText editText_age;
    Button button_bir;

    Calendar myCalendar = Calendar.getInstance();
    //기본 값으로 오늘 날짜
    DatePickerDialog.OnDateSetListener setDate = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, month);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateDate();
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.activity_fragment1, container, false);

        editText_name = rootView.findViewById(R.id.editText_name);
        editText_age = rootView.findViewById(R.id.editText_age);
        button_bir = rootView.findViewById(R.id.button_bir);
        Date currentTime = Calendar.getInstance().getTime();
        button_bir.setText(new SimpleDateFormat("YYYY/MM/dd", Locale.getDefault()).format(currentTime));

        button_bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getContext(), setDate, myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        Button button = rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText_name.getText().toString();
                String age = editText_age.getText().toString();
                String date = button_bir.getText().toString();

                if(name.length() < 1 | age.length() < 1 | date.length() < 1) {
                    Toast.makeText(getContext(), "정보를 모두 입려하세요", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getContext(), "이름은 : " + name
                    + " 나이는 : " + age + " 생일은 : " + date, Toast.LENGTH_LONG ).show();
                }
            }
        });
        return rootView;
    }

    public void updateDate() { //날짜 형식 변환하기
        String format = "YYYY/MM/dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.KOREA);
        button_bir.setText(simpleDateFormat.format(myCalendar.getTime()));
    }
}