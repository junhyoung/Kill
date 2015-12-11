package github.com.junhyoung.kill;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RecordActivity extends AppCompatActivity {
    //db관련 객체
    SQLiteDatabase db;
    String dbName = "quiz.db"; // name of Database;
    String tableName = "quiz_list"; // name of Table;
    int dbMode = Context.MODE_PRIVATE;

    ListView mList;
    ArrayAdapter<String> baseAdapter;
    ArrayList<String> nameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
    }
    public void Exit(View v){
        finish();
    }
}
