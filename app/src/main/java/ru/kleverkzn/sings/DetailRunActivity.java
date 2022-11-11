package ru.kleverkzn.sings;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailRunActivity extends AppCompatActivity {
    private ImageView imageViewRuns;
    private WebView vebVievRuns;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_div_run);
        imageViewRuns = findViewById(R.id.imageViewDivRunes);
        vebVievRuns = findViewById(R.id.vebVievRuns);

        Intent intent = getIntent();

        if (intent.hasExtra("id")){
            int id = intent.getIntExtra("id", -1);
            switch (id){
                case  0:
                    imageViewRuns.setImageResource(R.drawable.fehu);
                    vebVievRuns.loadUrl("file:///android_asset/fehu/fehu.html");
                    setTitle("Феху");
                    break;
                case  1:
                    imageViewRuns.setImageResource(R.drawable.urus);
                    vebVievRuns.loadUrl("file:///android_asset/uruz.html");
                    setTitle("Уруз");
                    break;
                case  2:
                    imageViewRuns.setImageResource(R.drawable.tur);
                    vebVievRuns.loadUrl("file:///android_asset/tur.html");
                    setTitle("Турисаз");
                    break;
                case  3:
                    imageViewRuns.setImageResource(R.drawable.ansus);
                    vebVievRuns.loadUrl("file:///android_asset/ansus/ansus.html");
                    setTitle("Ансуз");
                    break;
                case  4:
                    imageViewRuns.setImageResource(R.drawable.raido);
                    vebVievRuns.loadUrl("file:///android_asset/raido.html");
                    setTitle("Райдо");
                    break;
                case  5:
                    imageViewRuns.setImageResource(R.drawable.kano);
                    vebVievRuns.loadUrl("file:///android_asset/kano.html");
                    setTitle("Кано");
                    break;
                case  6:
                    imageViewRuns.setImageResource(R.drawable.gebo);
                    vebVievRuns.loadUrl("file:///android_asset/gebo.html");
                    setTitle("Гебо");
                    break;
                case  7:
                    imageViewRuns.setImageResource(R.drawable.vunio);
                    vebVievRuns.loadUrl("file:///android_asset/vunio.html");
                    setTitle("Вуньо");
                    break;
                case  8:
                    imageViewRuns.setImageResource(R.drawable.hagal);
                    vebVievRuns.loadUrl("file:///android_asset/hagal.html");
                    setTitle("Хагалаз");
                    break;
                case  9:
                    imageViewRuns.setImageResource(R.drawable.naut);
                    vebVievRuns.loadUrl("file:///android_asset/naut.html");
                    setTitle("Наутиз");
                    break;
                case  10:
                    imageViewRuns.setImageResource(R.drawable.isa);
                    vebVievRuns.loadUrl("file:///android_asset/isa.html");
                    setTitle("Иса");
                    break;
                case  11:
                    imageViewRuns.setImageResource(R.drawable.iera);
                    vebVievRuns.loadUrl("file:///android_asset/iera.html");
                    setTitle("Йера");
                    break;
                case  12:
                    imageViewRuns.setImageResource(R.drawable.eivas);
                    vebVievRuns.loadUrl("file:///android_asset/eivas/eivas.html");
                    setTitle("Эйваз");
                    break;
                case  13:
                    imageViewRuns.setImageResource(R.drawable.pert);
                    vebVievRuns.loadUrl("file:///android_asset/pert.html");
                    setTitle("Перт");
                    break;
                case  14:
                    imageViewRuns.setImageResource(R.drawable.algis);
                    vebVievRuns.loadUrl("file:///android_asset/algis/algis.html");
                    setTitle("Альгиз");
                    break;
                case  15:
                    imageViewRuns.setImageResource(R.drawable.soulu);
                    vebVievRuns.loadUrl("file:///android_asset/soulu.html");
                    setTitle("Соулу");
                    break;
                case  16:
                    imageViewRuns.setImageResource(R.drawable.teivas);
                    vebVievRuns.loadUrl("file:///android_asset/teivas.html");
                    setTitle("Тейваз");
                    break;
                case  17:
                    imageViewRuns.setImageResource(R.drawable.bercana);
                    vebVievRuns.loadUrl("file:///android_asset/bercana/bercana.html");
                    setTitle("Беркана");
                    break;
                case  18:
                    imageViewRuns.setImageResource(R.drawable.evas);
                    vebVievRuns.loadUrl("file:///android_asset/evas.html");
                    setTitle("Эваз");
                    break;
                case  19:
                    imageViewRuns.setImageResource(R.drawable.manas);
                    vebVievRuns.loadUrl("file:///android_asset/manas.html");
                    setTitle("Манназ");
                    break;
                case  20:
                    imageViewRuns.setImageResource(R.drawable.lagus);
                    vebVievRuns.loadUrl("file:///android_asset/lagus.html");
                    setTitle("Лагуз");
                    break;
                case  21:
                    imageViewRuns.setImageResource(R.drawable.ingus);
                    vebVievRuns.loadUrl("file:///android_asset/ingus.html");
                    setTitle("Ингуз");
                    break;
                case  22:
                    imageViewRuns.setImageResource(R.drawable.otila);
                    vebVievRuns.loadUrl("file:///android_asset/otila.html");
                    setTitle("Оттила");
                    break;
                case  23:
                    imageViewRuns.setImageResource(R.drawable.dagas);
                    vebVievRuns.loadUrl("file:///android_asset/dagas/dagas.html");
                    setTitle("Дагаз");
                    break;
            }
        }

    }
}