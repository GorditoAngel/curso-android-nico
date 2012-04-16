package curso.casos;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class Caso2MainActivity extends Activity {
	//TextView pos = null;    
    int xi;
    int yi;

	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  pos=(TextView)findViewById(R.id.pos);
        setContentView(R.layout.caso2main);
    }
    
    
    
    @Override
    public boolean onTouchEvent(MotionEvent event){
    	TextView pos =(TextView)findViewById(R.id.pos);
    	int x=(int)event.getX();
    	int y=(int)event.getY();
		int dx=x-xi;
		int dy=y-yi;
    	switch (event.getAction()) {
    	case MotionEvent.ACTION_DOWN:
    		xi=x;
    		yi=y;
    		break;
    	case MotionEvent.ACTION_MOVE:
    		pos.setText("Posicion actual: (" + x + "," + y + "). Dx = " + dx + "  Dy = " + dy);
    		break;
    	case MotionEvent.ACTION_UP:

    		Intent intent = new Intent (Caso2MainActivity.this, Caso2ResultActivity.class);
    		Bundle bundle = new Bundle();
    		bundle.putInt("dX", dx);
    		bundle.putInt("dY", dy);
    		intent.putExtras(bundle);
    		startActivity(intent);
    		
    		break;
    	}
    	return true;
    }
}