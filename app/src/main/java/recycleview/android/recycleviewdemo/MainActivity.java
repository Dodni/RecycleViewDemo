package recycleview.android.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager lmg = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(lmg);

        ArrayList<MyModel> models = new ArrayList<>(); {
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 1", "Item 1 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 2", "Item 2 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 3", "Item 3 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 4", "Item 4 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 5", "Item 5 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 6", "Item 6 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 7", "Item 7 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 8", "Item 8 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 9", "Item 9 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 10", "Item 10 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 11", "Item 11 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 12", "Item 12 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 13", "Item 13 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 14", "Item 14 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 15", "Item 15 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 16", "Item 16 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 17", "Item 17 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 18", "Item 18 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 19", "Item 19 Details"));
            models.add(new MyModel(R.drawable.outline_face_24,"Item Name 20", "Item 20 Details"));
        }

        MyAdapter myAdapter = new MyAdapter(models);
        recyclerView.setAdapter(myAdapter);
    }
}