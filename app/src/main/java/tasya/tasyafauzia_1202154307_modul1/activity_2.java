package tasya.tasyafauzia_1202154307_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;


public class activity_2 extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String tempat = intent.getStringExtra("tempatMakan");

        Intent intent2 = getIntent();
        String menu = intent2.getStringExtra("menu");

        Intent intent3 = getIntent();
        String porsi = intent3.getStringExtra("porsi");

        int totalPorsi = Integer.parseInt(porsi);
        Intent intent4 = getIntent();
        String Osasmoney = intent4.getStringExtra("Osasmoney");
        int uang = Integer.parseInt(Osasmoney);
        if (tempat.contains("Eatbus")) {

            int harga = 50000;
            int totalHarga = harga * totalPorsi;



            if (uang >= totalHarga) {
                TextView tvMakan = findViewById(R.id.textTempat);
                tvMakan.setText(tempat);

                TextView tvMenu = findViewById(R.id.textMenu);
                tvMenu.setText(menu);

                TextView tvPorsi = findViewById(R.id.textPorsi);
                tvPorsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView tvHarga = findViewById(R.id.textHarga);

                tvHarga.setText(hasil);
                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();

            } else {
                TextView tvMakan = findViewById(R.id.textTempat);
                tvMakan.setText(tempat);
                TextView tvMenu = findViewById(R.id.textMenu);
                tvMenu.setText(menu);
                TextView tvPorsi = findViewById(R.id.textPorsi);
                tvPorsi.setText(porsi);
                String hasil = String.valueOf(totalHarga);
                TextView tvHarga = findViewById(R.id.textHarga);
                tvHarga.setText(hasil);
                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();

            }
        } else {
            int harga = 30000;
            int totalHarga = harga * totalPorsi;
            if (uang >= totalHarga) {

                TextView tvMakan = findViewById(R.id.textTempat);
                tvMakan.setText(tempat);

                TextView tvMenu = findViewById(R.id.textMenu);
                tvMenu.setText(menu);

                TextView tvPorsi = findViewById(R.id.textPorsi);
                tvPorsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView tvHarga = findViewById(R.id.textHarga);

                tvHarga.setText(hasil);
                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();

            } else {
                TextView tvMakan = findViewById(R.id.textTempat);
                tvMakan.setText(tempat);

                TextView tvMenu = findViewById(R.id.textMenu);
                tvMenu.setText(menu);

                TextView tvPorsi = findViewById(R.id.textPorsi);
                tvPorsi.setText(porsi);

                String hasil = String.valueOf(totalHarga);
                TextView tvHarga = findViewById(R.id.textHarga);

                tvHarga.setText(hasil);
                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            }
        }
    }
}
