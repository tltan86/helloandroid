package sg.ggdotcom.helloandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class HelloAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        /*
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                case DialogInterface.BUTTON_POSITIVE:
                    //Yes button clicked
                    break;

                case DialogInterface.BUTTON_NEGATIVE:
                    //No button clicked
                    break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure?").setPositiveButton("Yes", dialogClickListener)
            .setNegativeButton("No", dialogClickListener).show();
        */
        
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        // alertDialog.setTitle("Android");
        alertDialog.setMessage("Hello there!");
        alertDialog.show();
    }
}