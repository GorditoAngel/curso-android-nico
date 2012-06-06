package curso.casos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.Toast;

public class ControlSMSText extends EditText {
	private boolean mostro=false;
	public ControlSMSText(Context context){
		super(context);
	}
	public ControlSMSText(Context context,AttributeSet attrs){
		super(context, attrs);
	}
	public ControlSMSText(Context context,AttributeSet attrs,int defStyle){
		super(context,attrs,defStyle);
	}
	@Override
	public void onDraw(Canvas canvas){
		super.onDraw(canvas);
		int height = this.getHeight();
		int width = this.getWidth()-this.getPaddingRight();
		//int len= 10 - this.getText().toString().length();
		
		Paint pNegro = new Paint(Paint.ANTI_ALIAS_FLAG);
		pNegro.setColor(Color.BLACK);
		pNegro.setStyle(Style.FILL);
		

	
		int len =10- this.getText().toString().length();
		//canvas.drawRect(10, 5, 50, 23,pNegro);
		Rect bounds = new Rect();
		String leng=""+len;
		pNegro.getTextBounds(leng, 0, leng.length(), bounds);
		canvas.drawText(leng, width-(bounds.right-bounds.left), 20 , pNegro);
		//canvas.drawText(leng, width-(bounds.right-bounds.left), height-(bounds.top-bounds.bottom) , pNegro);
		
		

		//canvas.drawText(leng, 0, 0, pNegro);
		if (len<=0 && mostro==false){
			mostro=true;
			Toast.makeText(getContext(), "Se acabo", Toast.LENGTH_SHORT).show();
			
		} else if (len>0){
			mostro=false;
		}

	}

}
