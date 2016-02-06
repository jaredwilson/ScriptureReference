package com.coolguy.jared.scripturereference;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.coolguy.jared.scripturerefence.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        EditText tempBookHint = (EditText) findViewById(R.id.hint_book);
        EditText tempChapterHint = (EditText) findViewById(R.id.hint_chapter);
        EditText tempVerseHint = (EditText) findViewById(R.id.hint_verse);
        String hBook = tempBookHint.getText().toString();
        String hChapter = tempChapterHint.getText().toString();
        String hVerse = tempVerseHint.getText().toString();

        TextView tempBook = (TextView) findViewById(R.id.Book);
        TextView tempChapter = (TextView) findViewById(R.id.Chapter);
        TextView tempVerse = (TextView) findViewById(R.id.Verse);

        if(!hBook.matches("") && !hChapter.matches("") && !hVerse.matches("")) {
            Intent intent = new Intent(this, NextPart.class);
            String scripture = hBook + " " + hChapter + ":" + hVerse;
            intent.putExtra(EXTRA_MESSAGE, scripture);
            startActivity(intent);
        }
    }
}
