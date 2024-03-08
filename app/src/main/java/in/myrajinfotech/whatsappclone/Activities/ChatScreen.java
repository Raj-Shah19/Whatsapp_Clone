package in.myrajinfotech.whatsappclone.Activities;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;
import in.myrajinfotech.whatsappclone.R;

public class ChatScreen extends AppCompatActivity {

    TextView username;
    CircleImageView img;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_screen);

        username = findViewById(R.id.usrname);
        img = findViewById(R.id.img);
        back = findViewById(R.id.backimg);

        username.setText(getIntent().getStringExtra("username"));
        Bitmap bitmap = (Bitmap) getIntent().getParcelableExtra("img");
        img.setImageBitmap(bitmap);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}