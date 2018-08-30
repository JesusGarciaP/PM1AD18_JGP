package garcia.jesus.appciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)(findViewById(R.id.txtbox));
        txt.setMovementMethod(new ScrollingMovementMethod());
        Toast.makeText(this,"on create",Toast.LENGTH_SHORT).show();
        Log.d("STATE","\n on create");
        txt.setText(txt.getText()+"\n on create");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"on Destroy",Toast.LENGTH_SHORT).show();
        Log.d("STATE","on destroy");
        txt.setText(txt.getText()+"\n on destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"on Pause",Toast.LENGTH_SHORT).show();
        Log.d("STATE","on pause");
        txt.setText(txt.getText()+"\n on pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"on Start",Toast.LENGTH_SHORT).show();
        Log.d("STATE","on start");
        txt.setText(txt.getText()+"\n on start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"on Restart",Toast.LENGTH_SHORT).show();
        Log.d("STATE","on restart");
        txt.setText(txt.getText()+"\n on restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"on Stop",Toast.LENGTH_SHORT).show();
        Log.d("STATE","on stop");
        txt.setText(txt.getText()+"\n on stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"on Resume",Toast.LENGTH_SHORT).show();
        Log.d("STATE","on resume");
        txt.setText(txt.getText()+"\n on resume");
    }
}
