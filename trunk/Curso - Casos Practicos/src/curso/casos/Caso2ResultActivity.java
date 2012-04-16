package curso.casos;


import android.app.Activity;
import android.os.Bundle;

import android.widget.TextView;

public class Caso2ResultActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.caso2result);
		Bundle bundle = getIntent().getExtras();
		double dY=bundle.getInt("dX");
		double dX=bundle.getInt("dY");
		
		
		double dist=Math.sqrt(dX*dX + dY*dY);
		final TextView txtDist = (TextView)findViewById(R.id.txtDist);
		txtDist.setText("Distancia = " + dist);

	}
}
