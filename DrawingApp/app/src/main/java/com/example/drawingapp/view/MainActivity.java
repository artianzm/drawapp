package com.example.drawingapp.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.drawingapp.R;

public class MainActivity extends AppCompatActivity {


    ImageButton new_proj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new_proj = findViewById(R.id.new_project);
        new_proj.setOnClickListener(v -> createNewProjectDialog());

    }

    private void createNewProjectDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Create a new sketch");
        alertDialog.setMessage("Choose a sketch name:");

        // Set an EditText view to get user input
        EditText input = new EditText(this);
        alertDialog.setView(input);
        alertDialog.setPositiveButton("Ok", (dialog, whichButton) -> {
            String inputValue = input.getText().toString();
            //se in the UI custom listview , the sketchName
            startActivity(new Intent(MainActivity.this, DrawingActivity.class));
        });
        alertDialog.setNegativeButton("Cancel", null);

        AlertDialog dialog = alertDialog.create();
        dialog.show();
    }

}