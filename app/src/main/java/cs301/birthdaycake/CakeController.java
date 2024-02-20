package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
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


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            modelObj.numCandles = progress;
             viewObj.invalidate();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
