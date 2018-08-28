package garcia.jesus.calculadorab;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    String btnvalor="",operador;
    int valorAnterior,res;
    TextView txtView;
    boolean suma,resta,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button btn0=(Button)(findViewById(R.id.btn0));
        final Button btn1=(Button)(findViewById(R.id.btn1));
        final Button btn2=(Button)(findViewById(R.id.btn2));
        final Button btn3=(Button)(findViewById(R.id.btn3));
        final Button btn4=(Button)(findViewById(R.id.btn4));
        final Button btn5=(Button)(findViewById(R.id.btn5));
        final Button btn6=(Button)(findViewById(R.id.btn6));
        final Button btn7=(Button)(findViewById(R.id.btn7));
        final Button btn8=(Button)(findViewById(R.id.btn8));
        final Button btn9=(Button)(findViewById(R.id.btn9));
        final Button btnDiv=(Button)(findViewById(R.id.btnDiv));
        final Button btnSuma=(Button)(findViewById(R.id.btnSuma));
        final Button btnResta=(Button)(findViewById(R.id.btnResta));
        final Button btnMultiplicacion=(Button)(findViewById(R.id.btnMultiplicacion));
        final Button btnC=(Button)(findViewById(R.id.btnC));
        final Button btnIgual=(Button)(findViewById(R.id.btnIgual));
        txtView=(TextView)(findViewById(R.id.Caja));

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn0.getText();
                txtView.setText(btnvalor);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn1.getText();
                txtView.setText(btnvalor);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn2.getText();
                txtView.setText(btnvalor);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn3.getText();
                txtView.setText(btnvalor);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn4.getText();
                txtView.setText(btnvalor);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn5.getText();
                txtView.setText(btnvalor);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn6.getText();
                txtView.setText(btnvalor);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn7.getText();
                txtView.setText(btnvalor);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn8.getText();
                txtView.setText(btnvalor);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnvalor=txtView.getText().toString();
                btnvalor+=btn9.getText();
                txtView.setText(btnvalor);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtView.setText("");
                btnvalor="";
                valorAnterior=0;
                res=0;
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //btnvalor+=btnSuma.getText();
                //txtView.setText(btnvalor);
                valorAnterior=Integer.parseInt(txtView.getText().toString());
                operador=btnSuma.getText().toString();
                txtView.setText("");

            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorAnterior=Integer.parseInt(txtView.getText().toString());
                operador=btnResta.getText().toString();
                txtView.setText("");
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorAnterior=Integer.parseInt(txtView.getText().toString());
                operador=btnMultiplicacion.getText().toString();
                txtView.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorAnterior=Integer.parseInt(txtView.getText().toString());
                operador=btnDiv.getText().toString();
                txtView.setText("");
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operador.equals("+")){
                    res = valorAnterior + Integer.parseInt(txtView.getText().toString());
                    txtView.setText(String.valueOf(res));
                }else if(operador.equals("-")){
                    res = valorAnterior - Integer.parseInt(txtView.getText().toString());
                    txtView.setText(String.valueOf(res));
                }else if(operador.equals("*")){
                    res = valorAnterior * Integer.parseInt(txtView.getText().toString());
                    txtView.setText(String.valueOf(res));
                }else if(operador.equals("/")){
                    res = valorAnterior / Integer.parseInt(txtView.getText().toString());
                    txtView.setText(String.valueOf(res));
                }
            }
        });


    }
}
