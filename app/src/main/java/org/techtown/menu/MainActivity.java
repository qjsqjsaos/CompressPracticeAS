package org.techtown.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
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