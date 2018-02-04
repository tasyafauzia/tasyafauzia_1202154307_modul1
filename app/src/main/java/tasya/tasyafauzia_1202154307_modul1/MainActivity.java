package tasya.tasyafauzia_1202154307_modul1;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText editMenu, editPorsi;
    TextView textvTempat, textvMenu, textvPorsi, textvHarga;
    Button buttonEatbus, buttonAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editMenu = (EditText) findViewById(R.id.editmenu);
        editPorsi = (EditText) findViewById(R.id.editporsi);
        textvTempat = (TextView) findViewById(R.id.textTempat);
        textvMenu = (TextView) findViewById(R.id.textMenu);
        textvPorsi = (TextView) findViewById(R.id.textPorsi);
        textvHarga = (TextView) findViewById(R.id.textHarga);
        buttonEatbus = (Button) findViewById(R.id.buttoneatbus);
        buttonAbnormal = (Button) findViewById(R.id.buttonabnormal);
    }

    public void klikEatbus(View view) {
        Intent intent = new Intent(this, activity_2.class);
        int money = 65500;
        String Osasmoney = String.valueOf(money);
        intent.putExtra("Osasmoney", Osasmoney);
        String tempatMakan = "Eatbus";
        intent.putExtra("tempatMakan", tempatMakan);
        String menu = editMenu.getText().toString();
        intent.putExtra("menu", menu);
        String porsi = editPorsi.getText().toString();
        intent.putExtra("porsi", porsi);
        startActivity(intent);
    }

    public void klikAbnormal(View view) {
        Intent intent = new Intent(this, activity_2.class);
        int money = 65500;
        String Osasmoney = String.valueOf(money);
        intent.putExtra("Osasmoney", Osasmoney);
        String tempatMakan = "Abnormal";
        intent.putExtra("tempatMakan", tempatMakan);;
        String menu = editMenu.getText().toString();
        intent.putExtra("menu", menu);
        String porsi = editPorsi.getText().toString();
        intent.putExtra("porsi", porsi);
        startActivity(intent);
    }
}
