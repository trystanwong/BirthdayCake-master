package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView initCakeView)
    {
        cakeView = initCakeView;
        cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
       //int log = Log.d("test","Test");
       cakeModel.cakeLit = false;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b==false)
        {
            cakeModel.hasCandles = false;
        }
        else
        {
            cakeModel.hasCandles = true;
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel.numCandles = i;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
