package dharmarajupilli.flyingfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {
private Button startGameAgain,exitGameHere;
private TextView displayScore;
private String Score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        startGameAgain=findViewById(R.id.gameoverButton);
        displayScore=findViewById(R.id.gameOver_scoreDisplay);
        exitGameHere=findViewById(R.id.exit);
        Score=getIntent().getExtras().get("score").toString();
        startGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playAgainIntent=new Intent(GameOverActivity.this,MainActivity.class);
                startActivity(playAgainIntent);
            }
        });
        displayScore.setText("Your Score Is:"+Score);
        exitGameHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
