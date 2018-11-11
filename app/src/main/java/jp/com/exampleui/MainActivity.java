package jp.com.exampleui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;


    public void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        List<String> list = new ArrayList<>();
//        list.add("item 1");
//        list.add("Item 2");
//        list.add("Item 3 ");
//        list.add("Item 4");
//
//        spinner = findViewById(R.id.spinner1);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.myitem,list);
//
//        spinner.setAdapter(adapter);
        List<Category> categories = getCategories();

        CategoryAdapter categoryAdapter = new CategoryAdapter(this,R.layout.layout_select,categories);
        spinner = findViewById(R.id.spinner1);
        spinner.setAdapter(categoryAdapter);


    }

    public List<Category> getCategories(){
        List<Category> list = new ArrayList<>();
        list.add(new Category("Category 1 "));
        list.add(new Category("Category 2 "));
        list.add(new Category("Category 3 "));
        return list;
    }
}
