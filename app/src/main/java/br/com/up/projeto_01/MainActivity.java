package br.com.up.projeto_01;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonSelector;
    private TextView textViewTitle;
    private ArrayList<String> listPhases = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listPhases.add("Comprar um café");
        listPhases.add("Chamar par aum churrasco");
        listPhases.add("Chamar para comer pizza");

        buttonSelector = findViewById(R.id.button_selector);
        textViewTitle = findViewById(R.id.text_title);


        View.OnClickListener clickListener =
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Position = new Random().nextInt(listPhases.size());
                String text=listPhases.get(Position);
                textViewTitle.setText(text);


            }
        };

              buttonSelector.setOnClickListener(clickListener);


    }
}