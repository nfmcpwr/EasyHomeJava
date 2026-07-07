package net.nfmcpwr.EasyHomeJava;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        try
        {
            ConfigStore.CheckAndLoad(this, ConfigStore.Config);
        }
        catch (SecurityException e)
        {
            requestPermissions(new String[] {
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.MANAGE_EXTERNAL_STORAGE
            }, 114514);
        }

        setContentView(R.layout.activity_main);

        View.OnClickListener onclick = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
                {
                    Intent i = new Intent(Intent.ACTION_CALL);

                    if (v.getId() == R.id.callButton1)
                    {
                        i.setData(Uri.fromParts("tel", ConfigStore.Config.Button1TelNumber, null));
                    }
                    else
                    {
                        i.setData(Uri.fromParts("tel", ConfigStore.Config.Button2TelNumber, null));
                    }

                    startActivity(i);
                }
                else
                {
                    requestPermissions(new String[] { Manifest.permission.CALL_PHONE }, 114514);
                }
            }
        };

        Button callButton1 = findViewById(R.id.callButton1);
        callButton1.setBackgroundColor(Color.parseColor(ConfigStore.Config.Button1Color));
        callButton1.setText(ConfigStore.Config.Button1Text);
        callButton1.setOnClickListener(onclick);

        Button callButton2 = findViewById(R.id.callButton2);
        callButton2.setBackgroundColor(Color.parseColor(ConfigStore.Config.Button2Color));
        callButton2.setText(ConfigStore.Config.Button2Text);
        callButton2.setOnClickListener(onclick);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults, int deviceId)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults, deviceId);

        if (requestCode == 114514)
        {
            if (grantResults[0] == PackageManager.PERMISSION_DENIED)
            {
                Toast.makeText(this, permissions[0] + " is not granted", Toast.LENGTH_SHORT).show();
            }
        }
    }
}