package fauzi.hilmy.quizgridviewimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView grid;
    String[] fruit = {
            "Apple",
            "Banana",
            "Blackberry",
            "Coconut",
            "Guava",
            "Kiwi",
            "Lemon",
            "Mango",
            "Melon",
            "Orange",
            "Papaya",
            "Pear",
            "Pineapple",
            "Strawberry",
            "Watermelon"
    } ;

    int[] imageId = {
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.blackberry,
            R.drawable.coconut,
            R.drawable.guava,
            R.drawable.kiwi,
            R.drawable.lemon,
            R.drawable.mango,
            R.drawable.melon,
            R.drawable.orange,
            R.drawable.papaya,
            R.drawable.pear,
            R.drawable.pineapple,
            R.drawable.strawberry,
            R.drawable.watermelon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this, fruit, imageId);
        grid=(GridView)findViewById(R.id.grid_view_image_text);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " + fruit [+ position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}