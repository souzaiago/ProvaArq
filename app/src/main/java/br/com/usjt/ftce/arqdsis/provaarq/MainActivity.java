/* Aluno: Iago de Souza RA: 201504507 */

package br.com.usjt.ftce.arqdsis.provaarq;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity/* Aluno: Iago de Souza RA: 201504507 */ {

    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculaNum(View view)/* Aluno: Iago de Souza RA: 201504507 */{
        String armazena = num.getText().toString();

    }
}
