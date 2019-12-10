package com.destiny.deconapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailPortofolioActivity extends AppCompatActivity {
    TextView AppsName,AppsPlatform,AppsFeature,AppsStatus,AppsLink,AppsAbout1,AppsAbout2,AppsAbout3;
    LinearLayout linkAdded;
    ImageView img1,img2,img3;
    ImageView btnCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_portofolio);
        AppsName = findViewById(R.id.tvAppsName);
        AppsPlatform = findViewById(R.id.tvPlatform);
        AppsFeature = findViewById(R.id.tvFeature);
        AppsStatus = findViewById(R.id.tvStatus);
        AppsLink = findViewById(R.id.tvLink);
        linkAdded = findViewById(R.id.tvLinkAdded);
        img1 = findViewById(R.id.ivFoto1);
        img2 = findViewById(R.id.ivFoto2);
        img3 = findViewById(R.id.ivFoto3);
        AppsAbout1 = findViewById(R.id.tvAboutImage1);
        AppsAbout2 = findViewById(R.id.tvAboutImage2);
        AppsAbout3 = findViewById(R.id.tvAboutImage3);
        btnCheck = findViewById(R.id.btnCheck);

        //GetString
        Intent data = getIntent();
        String Nama = data.getStringExtra("NAMA");
        final String Platform = data.getStringExtra("PLATFORM");
        String Feature = data.getStringExtra("FEATURE");
        String Status = data.getStringExtra("STATUS");
        final String Link = data.getStringExtra("LINK");
        String IMG1 = data.getStringExtra("IMG1");
        String About1 = data.getStringExtra("ABOUT1");
        String IMG2 = data.getStringExtra("IMG2");
        String About2 = data.getStringExtra("ABOUT2");
        String IMG3 = data.getStringExtra("IMG3");
        String About3 = data.getStringExtra("ABOUT3");

        AppsName.setText(Nama);
        AppsPlatform.setText(Platform);
        AppsFeature.setText(Feature);
        AppsStatus.setText(Status);
        if (Link.equals("-")){
            AppsLink.setText("");
            linkAdded.setGravity(Gravity.TOP);
            btnCheck.setVisibility(View.GONE);
        }else{
            linkAdded.setGravity(Gravity.CENTER);
            AppsLink.setVisibility(View.GONE);
        }
        if (Platform.equals("Android")){
            btnCheck.setImageResource(R.drawable.google_play_badge);
        }else if(Platform.equals("Web")){
            Toast.makeText(DetailPortofolioActivity.this, "WEB", Toast.LENGTH_SHORT).show();
        }else if(Platform.equals("IOS")){
            Toast.makeText(DetailPortofolioActivity.this, "IOS", Toast.LENGTH_SHORT).show();
        }
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Platform.equals("Android")){
                    String urltest = "https://play.google.com/store/apps/details?id=com.destiny.mutiaratigaberlian";
                    final String appPackageName = Link; // getPackageName() from Context or Activity object
                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                    } catch (android.content.ActivityNotFoundException anfe) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                    }
                }else if(Platform.equals("Web")){
                    Toast.makeText(DetailPortofolioActivity.this, "WEB", Toast.LENGTH_SHORT).show();
                }else if(Platform.equals("IOS")){
                    Toast.makeText(DetailPortofolioActivity.this, "IOS", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Glide.with(this)
                .load(IMG1)
                .into(img1);
        AppsAbout1.setText(About1);

        Glide.with(this)
                .load(IMG2)
                .into(img2);
        AppsAbout2.setText(About2);

        Glide.with(this)
                .load(IMG3)
                .into(img3);
        AppsAbout3.setText(About3);
    }
}
