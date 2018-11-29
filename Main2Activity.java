package hkit.kr.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String[] items = {"기호설명","십자가 맞추기",
                "1층 한면맞추기", "2층열 맞추기",
                "3층 십자가 맞추기", "3층십자가 정렬",
                "3층한면 맞추기", "큐브완성시키기"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,items);
        ListView listView = (ListView) findViewById(R.id.l1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String item = String.valueOf(parent.getItemAtPosition(i));
                if(i == 0) {
                    Intent intent = new Intent(getBaseContext(), symbol.class);
                    startActivity(intent);
                }
            }
        });

    }
}

