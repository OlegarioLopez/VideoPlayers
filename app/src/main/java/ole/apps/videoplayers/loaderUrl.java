package ole.apps.videoplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loaderUrl extends AppCompatActivity {
    private String url;
    private Button boton_reproducir;
    private EditText edit_text_url_entrada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargar__u_r_l);
        boton_reproducir=(Button)findViewById(R.id.boton_reproducir);
        edit_text_url_entrada=(EditText)findViewById(R.id.edit_text_url_entrada);
    }
    public void reproducir(View view){
        url=edit_text_url_entrada.getText().toString();

        if(url.contains(".mp4")) {
            Intent intent2 = new Intent(this, reproductor.class);
            intent2.putExtra("url", url);
            startActivity(intent2);


        }
        else{
            Intent intent = new Intent(this, youtubePlayer.class);
            intent.putExtra("url", url);
            startActivity(intent);
        }

    }
}
