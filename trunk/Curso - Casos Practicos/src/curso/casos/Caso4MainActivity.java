package curso.casos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Caso4MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.caso4main);
		
		RadioGroup grupo = (RadioGroup)findViewById(R.id.grupo);
		final TextView txtGrupo = (TextView)findViewById(R.id.lblIdioma);
		RadioButton selected = (RadioButton)findViewById(R.id.radio1);
		
		grupo.check(R.id.radio1);
		// TODO Auto-generated method stub
		txtGrupo.setText(selected.getText());
		
		
		RadioGroup.OnCheckedChangeListener eventoGrupo = new RadioGroup.OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton selected = (RadioButton)findViewById(checkedId);
				// TODO Auto-generated method stub
				txtGrupo.setText(selected.getText());
			}
		};
		grupo.setOnCheckedChangeListener(eventoGrupo);
	}
}
