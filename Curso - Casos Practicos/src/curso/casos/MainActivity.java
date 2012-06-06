package curso.casos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Spinner spinner = (Spinner)findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.casos_array, android.R.layout.simple_spinner_item);
        
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        spinner.setAdapter(adapter);
        
        Button btnGo = (Button)findViewById(R.id.button1);
        final MyOnItemSelectedListener eventoSpinner = new MyOnItemSelectedListener();
        
        eventoSpinner.setButton(btnGo);
        spinner.setOnItemSelectedListener(eventoSpinner);
        
        
 	   	View.OnClickListener eventoBoton = new View.OnClickListener() {
 	   		public void onClick(View v) {
 	   			// TODO Auto-generated method stub
 	   			int pos= eventoSpinner.getSelected();
 	   			Intent intent = null;
 	   			switch (pos) {
 	   			case 0:
 	   				intent = new Intent (
						MainActivity.this,
						Caso1MainActivity.class);
 	   				startActivity(intent);
 	   				break;
 	   			case 1:
 	   				intent = new Intent (
						MainActivity.this,
						Caso2MainActivity.class);
 	   				startActivity(intent);
 	   				break;
 	   			case 2:
 	   				intent = new Intent (
						MainActivity.this,
						Caso3MainActivity.class);
 	   				startActivity(intent);
 	   				break;
 	   			case 3:
 	   				intent = new Intent (
						MainActivity.this,
						Caso4MainActivity.class);
 	   				startActivity(intent);
 	   				break;
 	   			case 4:
 	   				intent = new Intent (
						MainActivity.this,
						Caso5MainActivity.class);
 	   				startActivity(intent);
 	   				break;  	   				
	   			case 5:
 	   				intent = new Intent (
						MainActivity.this,
						Caso6MainActivity.class);
 	   				startActivity(intent);
 	   				break;  	   				
 	   			} 	   			
 	   			Toast.makeText(MainActivity.this, "Caso " + (eventoSpinner.getSelected()+1), Toast.LENGTH_SHORT).show();

 	   		}
 	   	};
 	   	btnGo.setOnClickListener(eventoBoton);
        
    }
}