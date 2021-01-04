package org.techtown.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ActionBar aBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aBar = getSupportActionBar();

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aBar.setLogo(R.drawable.menu_refresh);
                aBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME|ActionBar.DISPLAY_USE_LOGO);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu); //xml로 정의된 메뉴 정보를 인플레이션하여 메모리의 로딩

        View v = menu.findItem(R.id.menu_search).getActionView();
        if(v != null) {
            EditText editText = v.findViewById(R.id.editText); // 메뉴 아이템 중에서 검색을 위해 정의한 아이템을 뷰 객체로 참조하고,

            if(editText != null) {
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // 검색을 위한 메뉴 아이템 안에 정의한 입력상자 객체 참조
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) { //입력상자 객체에 리스너 설정
                        Toast.makeText(getApplicationContext(), "입력됨" , Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
            }
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int curId = item.getItemId();
        switch (curId) {
            case R.id.menu_refresh :
                Toast.makeText(this, "새로고침 메뉴 선택", Toast.LENGTH_LONG).show();
                break; //break은 보통 반복문을 제어 할 때 쓰인다. 여기서도 이 실행 뒤 다른 것도 같이 실행되지 않기 위해 새로고침메뉴까지만 띄우게 하기 위해 제어하고 있다.
            case R.id.menu_search :
                Toast.makeText(this, "검색 메뉴 눌림", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_settings :
                Toast.makeText(this, "설정버튼 눌림", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}