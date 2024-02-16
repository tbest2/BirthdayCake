package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener{
        CakeView viewObj;
        CakeModel modelObj;

        CakeController(CakeView obj){
        viewObj=obj;
        modelObj=obj.getModel();
        }

public void onClick(View view){
        Log.d("cakec","cclick!");
        modelObj.blowing();
        viewObj.invalidate();
        }

public void CompoundButton(){
            Log.d("cakec","cclick!");

            viewObj.invalidate();

}

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        modelObj.fixCandles(isChecked);

        viewObj.invalidate();
    }
}
