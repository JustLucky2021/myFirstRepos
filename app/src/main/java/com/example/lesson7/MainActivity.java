package com.example.lesson7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int Max = 599;
        final int Min = 1;

        int randomNumber = (int)(Math.random()*Max)+Min;
        randomNumber = 91;
        int res = randomNumber/100;
        Log.d("lesson_7", "result = " + res);
        StringBuilder result = new StringBuilder();
        List<String> units = new ArrayList<>(Arrays.asList("один", "два", "три",
                "четыре", "пять", "шесть", "семь", "восемь", "девять"));
        List<String> dozens = new ArrayList<>();
        dozens.add("десять");
        dozens.add("двадцать");
        dozens.add("тридцать");
        dozens.add("сорок");
        dozens.add("пятьдесят");
        dozens.add("шестьдесят");
        dozens.add("семьдесят");
        dozens.add("восемьдесят");
        dozens.add("девяносто");

        List<String> hundreads = new ArrayList<>();
        hundreads.add("сто");
        hundreads.add("двести");
        hundreads.add("триста");
        hundreads.add("четыреста");
        hundreads.add("пятьсот");

        if (randomNumber/100 != 0 ){
            result.append(hundreads.get(randomNumber/100 -1));
        }

        if ((randomNumber % 100)/10 != 0 ){
            result.append(" ");
            result.append(dozens.get(((randomNumber%100)/10)-1));
        }

        if ((randomNumber % 100)%10 != 0 ){
            result.append(" ");
            result.append(units.get(((randomNumber%100)%10)-1));
        }

        if ((randomNumber % 100)%10 == 1){
            result.append(" ");
            result.append("рубль");
        }
        else if ((randomNumber % 100)%10 >1 && (randomNumber % 100)%10 < 5){
            result.append(" ");
            result.append("рубля");
        }
        else{
            result.append(" ");
            result.append("рублей");
        }
        Log.d("lesson_7", "result = " + result);
        }



        void printArray(List<String> numbers) {
            Log.d("lesson_7", "PrintArray");
            for (String number : numbers)
                Log.d("lesson_7", "" + number);
    }
}
