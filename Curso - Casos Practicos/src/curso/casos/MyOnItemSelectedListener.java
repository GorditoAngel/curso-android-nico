package curso.casos;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;


public class MyOnItemSelectedListener implements OnItemSelectedListener {
	int pos;
	Button btn=null;
	public int getSelected(){
		return pos;
	}
	
	public void setButton(Button boton) {
		btn=boton;
	}
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
    	pos=position;
    	if (btn!=null){
    		btn.setText("Ir al tema " + parent.getItemAtPosition(pos).toString());
    	}
    }

    public void onNothingSelected(AdapterView<?> parent) {
      // Do nothing.
    }
	
}
