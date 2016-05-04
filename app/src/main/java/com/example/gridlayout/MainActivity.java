package com.example.gridlayout;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare all of your button objects that will be used in this class
    Button sound1;
    Button sound2;
    Button sound3;
    Button sound4;
    Button sound5;
    Button sound6;
    Button sound7;
    Button sound8;
    Button sound9;

    MediaPlayer mediaPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // call the parent
        super.onCreate(savedInstanceState);
        // set your layout file to "res/layout/activity_main.xml"
        setContentView(R.layout.activity_main);

        // associate your declared button object with
        // the button in activity_main.xml
        sound1 = (Button)findViewById(R.id.chopin);
        sound2 = (Button)findViewById(R.id.beethoven);
        sound3 = (Button)findViewById(R.id.dvorak);
        sound4 = (Button)findViewById(R.id.brahms);
        sound5 = (Button)findViewById(R.id.schumann);
        sound6 = (Button)findViewById(R.id.chopin2);
        sound7 = (Button)findViewById(R.id.haydn);
        sound8 = (Button)findViewById(R.id.beethoven2);
        sound9 = (Button)findViewById(R.id.brahms2);



        // do something when you click on the buttons
        sound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // OPTIONAL: show a message when playing a sound


                // Play a sound
                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    showToast("Stopped sound");
                }else {
                    showToast("Waltz in C# minor, Op. 64, No. 2");
                    // ref:  https://en.wikipedia.org/wiki/Fr%C3%A9d%C3%A9ric_Chopin
                    // ref:  https://en.wikipedia.org/wiki/Waltz_in_C-sharp_minor,_Op._64,_No._2_(Chopin)
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chopinwaltzop64no2incsharpminor);
                    mediaPlayer.start();
                }

            }
        });

        sound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    showToast("Stopped sound");
                }else{
                    // OPTIONAL: show a message when playing a sound
                    showToast("Symphony No. 7, Op. 92: II. Allegretto");

                    // Play a sound
                    // ref:  https://en.wikipedia.org/wiki/Ludwig_van_Beethoven
                    // ref:  https://en.wikipedia.org/wiki/File:JOHN_MICHEL_CELLO-BEETHOVEN_SYMPHONY_7_Allegretto.ogg
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.johnmichelcellobeethovensymphony7allegretto);
                    mediaPlayer.start();
                }
            }
        });

        sound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    showToast("Stopped sound");
                }else{
                    // OPTIONAL: show a message when playing a sound
                    showToast("Symphony No. 9, Op. 95: IV. Allegro Con Fuoco");

                    // Play a sound
                    // ref:  https://en.wikipedia.org/wiki/Symphony_No._9_(Dvo%C5%99%C3%A1k)
                    // ref:  https://en.wikipedia.org/wiki/File:Antonin_Dvorak_-_symphony_no._9_in_e_minor_%27from_the_new_world%27,_op._95_-_iv._allegro_con_fuoco.ogg
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dvoraksymphonyno9op95iv);
                    mediaPlayer.start();
                }

            }
        });

        sound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    showToast("Stopped sound");
                }else{
                    // OPTIONAL: show a message when playing a sound
                    showToast("Symphony No. 3, Op. 90 - III Poco allegretto");

                    // Play a sound
                    // ref:  https://en.wikipedia.org/wiki/Johannes_Brahms
                    // ref:  https://en.wikipedia.org/wiki/File:Brahms,_Symphony_No._3_in_F_Major,_Op._90_-_III._Poco_allegretto.ogg
                    // ref:  https://en.wikipedia.org/wiki/File:Johannes_Brahms_-_Ungarischer_Tanz_5_g-moll.ogg
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.brahmssymphony);
                    mediaPlayer.start();
                }

            }
        });

        sound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    showToast("Stopped sound");
                }else{
                    // OPTIONAL: show a message when playing a sound
                    showToast("Kinderszenen, Op. 15: Traumerei");

                    // Play a sound
                    // ref:  https://en.wikipedia.org/wiki/Robert_Schumann
                    // ref:  https://en.wikipedia.org/wiki/Kinderszenen
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.schumannkinderszenenop15vii);
                    mediaPlayer.start();
                }
            }
        });

        sound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Play a sound
                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    showToast("Stopped sound");
                }else {
                    showToast("Etudes, Op 10, No. 3 - Tristesse");
                    // ref:  https://en.wikipedia.org/wiki/Fr%C3%A9d%C3%A9ric_Chopin
                    // ref:  https://en.wikipedia.org/wiki/File:Frederic_Chopin_-_Opus_10_-_Twelve_Grand_Etudes_-_E_Major.ogg
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chopinopus10tristesse);
                    mediaPlayer.start();
                }
            }
        });

        sound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    showToast("Stopped sound");
                }else{
                    // OPTIONAL: show a message when playing a sound
                    showToast("Sonata in F major, Hob.XVI:23");

                    // Play a sound
                    // ref:  https://en.wikipedia.org/wiki/Joseph_Haydn
                    // ref:  https://upload.wikimedia.org/wikipedia/commons/1/1c/Haydn_sonata_hob._XVI_23_mvt_2.oga
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.haydnsonata);
                    mediaPlayer.start();
                }
            }
        });

        sound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    showToast("Stopped sound");
                }else{
                    // OPTIONAL: show a message when playing a sound
                    showToast("Sonata No. 8, Op. 13 - I. Grave");

                    // Play a sound
                    // ref:  https://en.wikipedia.org/wiki/Ludwig_van_Beethoven
                    // ref:  https://en.wikipedia.org/wiki/File:Beethoven,_Sonata_No._8_in_C_Minor_Pathetique,_Op._13_-_I._Grave_-_Allegro_di_molto_e_con_brio.ogg                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.johnmichelcellobeethovensymphony7allegretto);
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.beethovensonatana);
                    mediaPlayer.start();
                }
            }
        });

        sound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    showToast("Stopped sound");
                }else{
                    // OPTIONAL: show a message when playing a sound
                    showToast("Rhapsody in G minor, Op. 79, No. 2");

                    // Play a sound
                    // ref:  https://en.wikipedia.org/wiki/Johannes_Brahms
                    // ref:  https://en.wikipedia.org/wiki/Rhapsodies,_Op._79_(Brahms)
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.brahms_op79);
                    mediaPlayer.seekTo(585000);
                    mediaPlayer.start();
                }

            }
        });

    }

    public void showToast(String textToShow){
        // This is what we want to display in the toast
        String toastText = textToShow;

        // This is how long we want to show the toast
        int duration = Toast.LENGTH_SHORT;

        // Get the context
        Context context = getApplicationContext();

        // Create the toast
        Toast toast = Toast.makeText(context, toastText, duration);

        // Show the toast
        toast.show();
    }
}
