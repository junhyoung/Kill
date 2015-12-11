package github.com.junhyoung.kill;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Popup_Producer(View view){
        Toast toast=Toast.makeText(getApplicationContext(),"조장 정찬형",Toast.LENGTH_LONG);
        ImageView imageView=new ImageView(getApplicationContext());
        imageView.setImageResource(R.drawable.jch);

        toast.setView(imageView);
        toast.setGravity(Gravity.CENTER,50,50);
        toast.setMargin(1000, 1000);
        toast.show();
    }
    public void Start(View v){
        Intent myintent = new Intent(getApplicationContext(),selectModeActivity.class);
        startActivity(myintent);
    }
    public void Recorder(View v){
        Intent myintent = new Intent(getApplicationContext(),RecordActivity.class);
        startActivity(myintent);
    }
    public void Help(View v) {
        Context mContext = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.activity_helper, (ViewGroup) findViewById(R.id.popup));
        AlertDialog.Builder aDialog = new AlertDialog.Builder(this);

        aDialog.setTitle("도움말");
        aDialog.setView(layout);


        aDialog.setNegativeButton("돌아가기", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        AlertDialog ad = aDialog.create();
        ad.show();
    }

}
