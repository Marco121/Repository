package com.example.gonzaloenrique.rgmm;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Gonzalo Enrique on 06/04/2015.
 */
public class Contactanos extends Activity{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactanos);
    }


    public void onClickMakeCalls(View view)

    {
        Intent i = new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:+980755568"));
        startActivity(i);
    }
    public void onClickWebBrowser(View view)
    {
        Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/combiaqp?fref=ts"));
        startActivity(i);
    }
    public void onClickShowMap(View view)
    {
        Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("geo:37.827500,-122.481670"));
        startActivity(i);
    }
}