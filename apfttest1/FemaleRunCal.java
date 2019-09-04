package dj.apps.apfttest1;

import android.support.v7.app.AppCompatActivity;

public class FemaleRunCal extends AppCompatActivity {
    int fRunScore;

    public int femaleRunCal(int ageInt, int minInt, int secInt){
// Age 17-21
        if(ageInt >= 17 && ageInt <= 21){
            if(minInt <= 14){ fRunScore = 100; }
            if(minInt == 15){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 100; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 100; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 99; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 98; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 96; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 95; }
            }
            if(minInt == 16){
                if(secInt == 0){ fRunScore = 95; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 94; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 93; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 92; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 90; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 89; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 88; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 87; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 85; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 84; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 83; }
            }
            if(minInt == 17){
                if(secInt == 0){ fRunScore = 83; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 82; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 81; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 79; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 78; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 77; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 76; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 75; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 73; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 72; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 71; }
            }
            if(minInt == 18){
                if(secInt == 0){ fRunScore = 71; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 70; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 68; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 67; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 66; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 65; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 64; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 62; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 61; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 60; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 59; }
            }
            if(minInt == 19){
                if(secInt == 0){ fRunScore = 59; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 58; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 56; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 55; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 54; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 53; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 52; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 50; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 49; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 48; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 47; }
            }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 47; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 45; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 44; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 43; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 42; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 41; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 39; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 38; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 37; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 36; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 35; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 35; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 33; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 32; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 31; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 30; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 28; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 27; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 26; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 25; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 24; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 22; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 22; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 21; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 20; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 19; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 18; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 16; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 15; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 14; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 13; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 12; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 10; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 10; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 9; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 8; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 7; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 5; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 4; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 3; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 2; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 1; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 0; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 24 ){ fRunScore = 0; }
        }
// Age 22-26
        if(ageInt >= 22 && ageInt <= 26){
            if(minInt <= 14){ fRunScore = 100; }
            if(minInt == 15){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 100; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 100; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 99; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 98; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 97; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 96; }
            }
            if(minInt == 16){
                if(secInt == 0){ fRunScore = 96; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 95; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 94; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 93; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 92; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 91; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 90; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 89; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 88; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 87; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 86; }
            }
            if(minInt == 17){
                if(secInt == 0){ fRunScore = 86; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 85; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 84; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 83; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 82; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 81; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 80; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 79; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 78; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 77; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 76; }
            }
            if(minInt == 18){
                if(secInt == 0){ fRunScore = 76; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 75; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 74; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 73; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 72; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 71; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 70; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 69; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 68; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 67; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 66; }
            }
            if(minInt == 19){
                if(secInt == 0){ fRunScore = 66; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 65; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 64; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 63; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 62; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 61; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 60; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 59; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 58; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 57; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 56; }
            }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 56; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 55; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 54; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 53; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 52; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 51; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 50; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 49; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 48; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 47; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 46; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 46; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 45; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 44; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 43; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 42; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 41; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 40; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 39; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 38; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 37; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 36; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 36; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 35; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 34; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 33; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 32; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 31; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 30; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 29; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 28; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 27; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 26; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 26; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 25; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 24; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 23; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 22; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 21; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 20; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 19; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 18; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 17; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 16; }
            }
            if(minInt == 24){
                if(secInt == 0){ fRunScore = 16; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 15; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 14; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 13; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 12; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 11; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 10; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 9; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 8; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 7; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 6; }
            }
            if(minInt == 25){
                if(secInt == 0){ fRunScore = 6; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 5; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 4; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 3; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 2; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 1; }
                if(secInt >= 31 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 26 ){ fRunScore = 0; }
        }
// Age 27-31
        if(ageInt >= 27 && ageInt <= 31){
            if(minInt <= 14){ fRunScore = 100; }
            if(minInt == 15){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 100; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 100; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 100; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 100; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 99; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 98; }
            }
            if(minInt == 16){
                if(secInt == 0){ fRunScore = 98; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 97; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 97; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 96; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 95; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 94; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 93; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 92; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 91; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 91; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 90; }
            }
            if(minInt == 17){
                if(secInt == 0){ fRunScore = 90; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 89; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 88; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 87; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 86; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 86; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 85; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 84; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 83; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 82; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 81; }
            }
            if(minInt == 18){
                if(secInt == 0){ fRunScore = 81; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 80; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 80; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 79; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 78; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 77; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 76; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 75; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 74; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 74; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 73; }
            }
            if(minInt == 19){
                if(secInt == 0){ fRunScore = 73; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 72; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 71; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 70; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 69; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 69; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 68; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 67; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 66; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 65; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 64; }
            }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 64; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 63; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 63; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 62; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 61; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 60; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 59; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 58; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 57; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 57; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 56; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 56; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 55; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 54; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 53; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 52; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 51; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 51; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 50; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 49; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 48; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 47; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 47; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 46; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 46; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 45; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 44; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 43; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 42; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 41; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 40; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 40; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 39; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 39; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 38; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 37; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 36; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 35; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 34; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 34; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 33; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 32; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 31; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 30; }
            }
            if(minInt == 24){
                if(secInt == 0){ fRunScore = 30; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 29; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 29; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 28; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 27; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 26; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 25; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 24; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 23; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 23; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 22; }
            }
            if(minInt == 25){
                if(secInt == 0){ fRunScore = 22; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 21; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 20; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 19; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 18; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 17; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 17; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 16; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 15; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 14; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 13; }
            }
            if(minInt == 26){
                if(secInt == 0){ fRunScore = 13; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 12; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 11; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 11; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 10; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 9; }
                if(secInt >= 31 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 27 ){ fRunScore = 0; }
        }
// Age 32-36
        if(ageInt >= 32 && ageInt <= 36){
            if(minInt <= 14){ fRunScore = 100; }
            if(minInt == 15){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 100; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 100; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 100; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 100; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 100; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 99; }
            }
            if(minInt == 16){
                if(secInt == 0){ fRunScore = 99; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 99; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 98; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 97; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 97; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 96; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 95; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 94; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 94; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 93; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 92; }
            }
            if(minInt == 17){
                if(secInt == 0){ fRunScore = 92; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 92; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 91; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 90; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 90; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 89; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 88; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 88; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 87; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 86; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 86; }
            }
            if(minInt == 18){
                if(secInt == 0){ fRunScore = 86; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 85; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 84; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 83; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 83; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 82; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 81; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 81; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 80; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 79; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 79; }
            }
            if(minInt == 19){
                if(secInt == 0){ fRunScore = 79; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 78; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 78; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 77; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 77; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 76; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 75; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 74; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 74; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 73; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 72; }
            }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 72; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 71; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 70; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 70; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 69; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 68; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 68; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 67; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 66; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 66; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 65; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 65; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 64; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 63; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 63; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 62; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 61; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 61; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 60; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 59; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 59; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 58; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 58; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 57; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 57; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 56; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 55; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 54; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 54; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 53; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 52; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 52; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 51; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 51; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 50; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 49; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 49; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 48; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 48; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 47; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 46; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 46; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 45; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 44; }
            }
            if(minInt == 24){
                if(secInt == 0){ fRunScore = 44; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 43; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 43; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 42; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 41; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 41; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 40; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 39; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 39; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 38; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 37; }
            }
            if(minInt == 25){
                if(secInt == 0){ fRunScore = 37; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 37; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 36; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 35; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 34; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 34; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 33; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 32; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 32; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 31; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 30; }
            }
            if(minInt == 26){
                if(secInt == 0){ fRunScore = 30; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 30; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 29; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 28; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 28; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 27; }
                if(secInt >= 31 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 27 ){ fRunScore = 0; }
        }
// Age 37-41
        if(ageInt >= 37 && ageInt <= 41){
            if(minInt <= 16){ fRunScore = 100; }
            if(minInt == 17){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 99; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 99; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 98; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 97; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 96; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 96; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 95; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 94; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 94; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 93; }
            }
            if(minInt == 18){
                if(secInt == 0){ fRunScore = 93; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 92; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 92; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 91; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 90; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 89; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 89; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 88; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 87; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 87; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 86; }
            }
            if(minInt == 19){
                if(secInt == 0){ fRunScore = 86; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 85; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 85; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 84; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 83; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 82; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 82; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 81; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 80; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 80; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 79; }
            }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 79; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 78; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 78; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 77; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 76; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 75; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 75; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 74; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 73; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 73; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 72; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 72; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 71; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 71; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 70; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 69; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 68; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 68; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 67; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 66; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 66; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 65; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 65; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 64; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 64; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 63; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 62; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 61; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 61; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 60; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 59; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 59; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 58; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 58; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 57; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 56; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 56; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 55; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 54; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 54; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 53; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 52; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 52; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 51; }
            }
            if(minInt == 24){
                if(secInt == 0){ fRunScore = 51; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 50; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 49; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 49; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 48; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 47; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 47; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 46; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 45; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 45; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 44; }
            }
            if(minInt == 25){
                if(secInt == 0){ fRunScore = 44; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 43; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 42; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 42; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 41; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 40; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 40; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 39; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 38; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 38; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 37; }
            }
            if(minInt == 26){
                if(secInt == 0){ fRunScore = 37; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 36; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 35; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 35; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 34; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 33; }
                if(secInt >= 31 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 27 ){ fRunScore = 0; }
        }
// Age 42-46
        if(ageInt >= 42 && ageInt <= 46){
            if(minInt <= 16){ fRunScore = 100; }
            if(minInt == 17){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 99; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 99; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 98; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 97; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 97; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 96; }
            }
            if(minInt == 18){
                if(secInt == 0){ fRunScore = 96; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 96; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 95; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 94; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 94; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 93; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 92; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 92; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 91; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 90; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 90; }
            }
            if(minInt == 19){
                if(secInt == 0){ fRunScore = 90; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 89; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 89; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 88; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 87; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 87; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 86; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 85; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 85; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 84; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 83; }
            }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 83; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 83; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 82; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 82; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 81; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 80; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 80; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 79; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 78; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 78; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 77; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 77; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 77; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 76; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 75; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 75; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 74; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 73; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 73; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 72; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 71; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 71; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 71; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 70; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 70; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 69; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 68; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 68; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 67; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 66; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 66; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 65; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 64; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 64; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 64; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 63; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 63; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 62; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 61; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 61; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 60; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 59; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 59; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 58; }
            }
            if(minInt == 24){
                if(secInt == 0){ fRunScore = 58; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 57; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 57; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 56; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 56; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 55; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 54; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 54; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 53; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 52; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 52; }
            }
            if(minInt == 25){
                if(secInt == 0){ fRunScore = 52; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 51; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 50; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 50; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 49; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 49; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 48; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 47; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 47; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 46; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 45; }
            }
            if(minInt == 26){
                if(secInt == 0){ fRunScore = 45; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 45; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 44; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 43; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 43; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 42; }
                if(secInt >= 31 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 27 ){ fRunScore = 0; }
        }
// Age 47-51
        if(ageInt >= 47 && ageInt <= 51){
            if(minInt <= 16){ fRunScore = 100; }
            if(minInt == 17){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 100; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 100; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 99; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 99; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 98; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 97; }
            }
            if(minInt == 18){
                if(secInt == 0){ fRunScore = 97; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 97; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 96; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 96; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 95; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 94; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 94; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 93; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 92; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 92; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 91; }
            }
            if(minInt == 19){
                if(secInt == 0){ fRunScore = 91; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 91; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 90; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 89; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 89; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 88; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 87; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 87; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 86; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 86; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 85; }
            }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 85; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 84; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 84; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 83; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 82; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 82; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 81; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 81; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 80; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 79; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 79; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 79; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 78; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 77; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 77; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 76; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 76; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 75; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 74; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 74; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 73; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 72; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 72; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 72; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 71; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 71; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 70; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 69; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 69; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 68; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 67; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 67; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 66; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 66; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 66; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 65; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 64; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 64; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 63; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 62; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 62; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 61; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 61; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 60; }
            }
            if(minInt == 24){
                if(secInt == 0){ fRunScore = 60; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 59; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 59; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 58; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 57; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 57; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 56; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 56; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 55; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 54; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 54; }
            }
            if(minInt == 25){
                if(secInt == 0){ fRunScore = 54; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 53; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 52; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 52; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 51; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 51; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 50; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 49; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 49; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 48; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 47; }
            }
            if(minInt == 26){
                if(secInt == 0){ fRunScore = 47; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 47; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 46; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 46; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 45; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 44; }
                if(secInt >= 31 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 27 ){ fRunScore = 0; }
        }
// Age 52-56
        if(ageInt >= 52 && ageInt <= 56){
            if(minInt <= 18){ fRunScore = 100; }
            if(minInt == 19){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 99; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 99; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 98; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 97; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 96; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 96; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 95; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 94; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 93; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 93; }
            }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 93; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 92; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 91; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 90; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 90; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 89; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 88; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 87; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 87; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 86; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 85; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 85; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 84; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 84; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 83; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 82; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 81; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 81; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 80; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 79; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 79; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 78; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 78; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 77; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 76; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 76; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 75; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 74; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 73; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 73; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 72; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 71; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 70; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 70; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 70; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 69; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 68; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 67; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 67; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 66; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 65; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 64; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 64; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 63; }
            }
            if(minInt == 24){
                if(secInt == 0){ fRunScore = 63; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 62; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 61; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 61; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 60; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 59; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 59; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 58; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 57; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 56; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 56; }
            }
            if(minInt == 25){
                if(secInt == 0){ fRunScore = 56; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 55; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 54; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 53; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 53; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 52; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 51; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 50; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 50; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 49; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 48; }
            }
            if(minInt == 26){
                if(secInt == 0){ fRunScore = 48; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 47; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 47; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 46; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 45; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 44; }
                if(secInt >= 31 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 27 ){ fRunScore = 0; }
        }
// Age 57-61
        if(ageInt >= 57 && ageInt <= 61){
            if(minInt <= 18){ fRunScore = 100; }
            if(minInt == 19){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 100; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 100; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 100; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 99; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 98; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 98; }
            }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 98; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 97; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 96; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 95; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 95; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 94; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 93; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 92; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 91; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 91; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 90; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 90; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 89; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 88; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 87; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 87; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 86; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 85; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 84; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 84; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 83; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 82; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 82; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 81; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 80; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 80; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 79; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 78; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 77; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 76; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 76; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 75; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 74; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 74; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 73; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 73; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 72; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 71; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 70; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 69; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 69; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 68; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 67; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 66; }
            }
            if(minInt == 24){
                if(secInt == 0){ fRunScore = 66; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 65; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 65; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 64; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 63; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 62; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 62; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 61; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 60; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 59; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 58; }
            }
            if(minInt == 25){
                if(secInt == 0){ fRunScore = 58; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 58; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 57; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 56; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 55; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 55; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 54; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 53; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 52; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 51; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 51; }
            }
            if(minInt == 26){
                if(secInt == 0){ fRunScore = 51; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 50; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 49; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 48; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 47; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 47; }
                if(secInt >= 31 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 27 ){ fRunScore = 0; }
        }
// Age 62+
        if(ageInt >= 62){
            if(minInt <= 19){ fRunScore = 100; }
            if(minInt == 20){
                if(secInt == 0){ fRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 99; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 98; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 98; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 97; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 96; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 95; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 94; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 94; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 93; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 92; }
            }
            if(minInt == 21){
                if(secInt == 0){ fRunScore = 92; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 91; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 90; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 90; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 89; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 88; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 87; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 86; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 86; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 85; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 84; }
            }
            if(minInt == 22){
                if(secInt == 0){ fRunScore = 84; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 83; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 82; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 82; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 81; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 80; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 79; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 78; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 78; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 77; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 76; }
            }
            if(minInt == 23){
                if(secInt == 0){ fRunScore = 76; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 75; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 74; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 74; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 73; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 72; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 71; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 70; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 70; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 69; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 68; }
            }
            if(minInt == 24){
                if(secInt == 0){ fRunScore = 68; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 67; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 66; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 66; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 65; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 64; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 63; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 62; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 62; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 61; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 60; }
            }
            if(minInt == 25){
                if(secInt == 0){ fRunScore = 60; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 59; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 58; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 58; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 57; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 56; }
                if(secInt >= 31 && secInt <= 36){ fRunScore = 55; }
                if(secInt >= 37 && secInt <= 42){ fRunScore = 54; }
                if(secInt >= 43 && secInt <= 48){ fRunScore = 54; }
                if(secInt >= 49 && secInt <= 54){ fRunScore = 53; }
                if(secInt >= 55 && secInt <= 59){ fRunScore = 52; }
            }
            if(minInt == 26){
                if(secInt == 0){ fRunScore = 52; }
                if(secInt >= 1 && secInt <= 6){ fRunScore = 51; }
                if(secInt >= 7 && secInt <= 12){ fRunScore = 50; }
                if(secInt >= 13 && secInt <= 18){ fRunScore = 50; }
                if(secInt >= 19 && secInt <= 24){ fRunScore = 49; }
                if(secInt >= 25 && secInt <= 30){ fRunScore = 48; }
                if(secInt >= 31 && secInt <= 59){ fRunScore = 0; }
            }
            if(minInt >= 27 ){ fRunScore = 0; }
        }
        return fRunScore;
    }
}
