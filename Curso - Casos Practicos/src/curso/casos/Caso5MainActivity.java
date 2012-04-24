package curso.casos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

public class Caso5MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.caso5main);
		
		ArrayAdapter<CharSequence> adapter1= ArrayAdapter.createFromResource(
                this, R.array.caso5opc1, android.R.layout.simple_list_item_1);
		ListView listView =(ListView)findViewById(R.id.listView);
		listView.setAdapter(adapter1);
		
		ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(
                this, R.array.caso5opc2, android.R.layout.simple_list_item_1);
		GridView gridView =(GridView)findViewById(R.id.gridView);
		gridView.setAdapter(adapter2);
		
		AdapterView.OnItemClickListener eventoGrid = new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, 
			android.view.View v, int position, long id) {
				TextView txtSelGrid = (TextView)findViewById(R.id.txtSelectGrid);
				txtSelGrid.setText("Último seleccionado: " + parent.getItemAtPosition(position).toString());
			}
		};
		gridView.setOnItemClickListener(eventoGrid);

		
		AdapterView.OnItemClickListener eventoList = new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, 
			android.view.View v, int position, long id) {
				TextView txtSelGrid = (TextView)findViewById(R.id.txtSelectList);
				txtSelGrid.setText("Último seleccionado: " + parent.getItemAtPosition(position).toString());
			}
		};
		listView.setOnItemClickListener(eventoList);
		
	}

}
