package dj.apps.apfttest1;

import android.support.v7.app.AppCompatActivity;

public class MaleRunCal extends AppCompatActivity {
    int mRunScore;

    public int maleRunCal(int ageInt, int minInt, int secInt){
// Age 17-21
        if(ageInt >= 17 && ageInt <= 21){
            if(minInt <= 12){ mRunScore = 100; }
            if(minInt == 13){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 0 && secInt <= 6){ mRunScore = 99; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 97; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 96; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 94; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 93; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 92; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 90; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 89; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 88; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 86; }
            }
            if(minInt == 14){
                if(secInt == 0){ mRunScore = 86; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 85; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 83; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 82; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 81; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 79; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 78; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 77; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 75; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 74; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 72; }
            }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 72; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 71; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 70; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 68; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 67; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 66; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 64; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 63; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 61; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 60; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 59; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 59; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 57; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 56; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 54; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 53; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 52; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 50; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 49; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 48; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 46; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 45; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 45; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 43; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 42; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 41; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 39; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 38; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 37; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 35; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 34; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 32; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 31; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 31; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 30; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 28; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 27; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 26; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 24; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 23; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 21; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 20; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 19; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 17; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 17; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 16; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 14; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 13; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 12; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 10; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 9; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 8; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 6; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 5; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 3; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 3; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 2; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 1; }
                if(secInt >= 13){ mRunScore = 0; }
            }
            if(minInt >= 21 ){ mRunScore = 0; }
        }
// Age 22-26
        if(ageInt >= 22 && ageInt <= 26){
            if(minInt <= 12){ mRunScore = 100; }
            if(minInt == 13){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 0 && secInt <= 6){ mRunScore = 99; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 98; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 97; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 96; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 94; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 93; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 92; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 91; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 90; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 89; }
            }
            if(minInt == 14){
                if(secInt == 0){ mRunScore = 89; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 88; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 87; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 86; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 84; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 83; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 82; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 81; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 80; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 79; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 78; }
            }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 78; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 77; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 76; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 74; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 73; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 72; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 71; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 70; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 69; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 68; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 67; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 67; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 66; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 64; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 63; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 62; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 61; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 60; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 59; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 58; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 57; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 56; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 56; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 54; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 53; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 52; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 51; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 50; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 49; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 48; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 47; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 46; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 44; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 44; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 43; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 42; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 41; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 40; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 39; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 38; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 37; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 36; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 34; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 33; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 33; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 32; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 31; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 30; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 29; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 28; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 27; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 26; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 24; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 23; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 22; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 22; }
                if(secInt >= 1 && secInt <= 6){ mRunScore =21; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 20; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 19; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 18; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 17; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 16; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 14; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 13; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 12; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 11; }
            }
            if(minInt == 21 ){
                if(secInt == 0){ mRunScore = 11; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 10; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 9; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 8; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 7; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 6; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 4; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 3; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 2; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 1; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 0; }
            }
            if(minInt >= 22){ mRunScore = 0; }
        }
// Age 27-31
        if(ageInt >= 27 && ageInt <= 31){
            if(minInt <= 12){ mRunScore = 100; }
            if(minInt == 13){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 0 && secInt <= 6){ mRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 99; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 98; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 97; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 96; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 95; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 94; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 92; }
            }
            if(minInt == 14){
                if(secInt == 0){ mRunScore = 92; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 91; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 90; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 89; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 88; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 87; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 86; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 85; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 84; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 83; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 82; }
            }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 82; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 81; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 79; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 78; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 77; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 76; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 75; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 74; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 73; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 72; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 71; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 71; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 70; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 69; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 68; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 66; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 65; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 64; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 63; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 62; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 61; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 60; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 60; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 59; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 58; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 57; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 56; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 55; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 54; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 52; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 51; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 50; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 49; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 49; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 48; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 47; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 46; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 45; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 44; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 43; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 42; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 41; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 39; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 38; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 38; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 37; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 36; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 35; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 34; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 33; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 32; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 31; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 30; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 29; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 28; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 28; }
                if(secInt >= 1 && secInt <= 6){ mRunScore =26; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 25; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 24; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 23; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 22; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 21; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 20; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 19; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 18; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 17; }
            }
            if(minInt == 21 ){
                if(secInt == 0){ mRunScore = 17; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 16; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 15; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 14; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 12; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 11; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 10; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 9; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 8; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 7; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 6; }
            }
            if(minInt == 22 ){
                if(secInt == 0){ mRunScore = 6; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 5; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 4; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 3; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 2; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 1; }
                if(secInt >= 31 && secInt <= 59){ mRunScore = 0; }
            }
            if(minInt >= 23){ mRunScore = 0; }
        }
// Age 32-36
        if(ageInt >= 32 && ageInt <= 36){
            if(minInt <= 12){ mRunScore = 100; }
            if(minInt == 13){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 0 && secInt <= 6){ mRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 99; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 98; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 97; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 96; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 95; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 95; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 94; }
            }
            if(minInt == 14){
                if(secInt == 0){ mRunScore = 94; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 93; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 92; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 91; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 90; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 89; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 88; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 87; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 86; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 85; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 85; }
            }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 85; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 84; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 83; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 82; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 81; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 80; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 79; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 78; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 77; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 76; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 75; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 75; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 75; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 74; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 73; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 72; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 71; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 70; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 69; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 68; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 67; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 66; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 66; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 65; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 65; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 64; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 63; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 62; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 61; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 60; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 59; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 58; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 57; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 57; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 56; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 55; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 55; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 54; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 53; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 52; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 51; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 50; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 49; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 48; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 48; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 47; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 46; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 45; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 45; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 44; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 43; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 42; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 41; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 40; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 39; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 39; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 38; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 37; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 36; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 35; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 35; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 34; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 33; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 32; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 31; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 30; }
            }
            if(minInt == 21 ){
                if(secInt == 0){ mRunScore = 30; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 29; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 28; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 27; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 26; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 25; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 25; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 24; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 23; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 22; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 21; }
            }
            if(minInt == 22 ){
                if(secInt == 0){ mRunScore = 21; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 20; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 19; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 18; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 17; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 16; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 15; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 15; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 14; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 13; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 12; }
            }
            if(minInt == 23 ){
                if(secInt == 0){ mRunScore = 12; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 11; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 10; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 9; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 8; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 7; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 6; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 5; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 5; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 4; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 3; }
            }
            if(minInt == 23 ){
                if(secInt == 0){ mRunScore = 3; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 2; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 1; }
                if(secInt >= 13 && secInt <= 59){ mRunScore = 0; }
            }
            if(minInt >= 24){ mRunScore = 0; }
        }
// Age 37-41
        if(ageInt >= 37 && ageInt <= 41){
            if(minInt <= 12){ mRunScore = 100; }
            if(minInt == 13){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 0 && secInt <= 6){ mRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 100; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 100; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 99; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 98; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 97; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 97; }
            }
            if(minInt == 14){
                if(secInt == 0){ mRunScore = 97; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 96; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 95; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 94; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 93; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 92; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 91; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 91; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 90; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 89; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 88; }
            }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 88; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 87; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 86; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 86; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 85; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 84; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 83; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 82; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 81; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 80; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 80; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 80; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 79; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 78; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 77; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 76; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 75; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 74; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 74; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 73; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 72; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 71; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 71; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 70; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 69; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 69; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 68; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 67; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 66; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 65; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 64; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 63; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 63; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 63; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 62; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 61; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 60; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 59; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 58; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 57; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 57; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 56; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 55; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 54; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 54; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 53; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 52; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 51; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 51; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 50; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 49; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 48; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 47; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 46; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 46; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 46; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 45; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 44; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 43; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 42; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 41; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 40; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 40; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 39; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 38; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 37; }
            }
            if(minInt == 21 ){
                if(secInt == 0){ mRunScore = 37; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 36; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 35; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 34; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 34; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 33; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 32; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 31; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 30; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 29; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 29; }
            }
            if(minInt == 22 ){
                if(secInt == 0){ mRunScore = 29; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 28; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 27; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 26; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 25; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 24; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 23; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 23; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 22; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 21; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 20; }
            }
            if(minInt == 23 ){
                if(secInt == 0){ mRunScore = 20; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 19; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 18; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 17; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 17; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 16; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 15; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 14; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 13; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 12; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 11; }
            }
            if(minInt == 24 ){
                if(secInt == 0){ mRunScore = 11; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 11; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 10; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 9; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 8; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 7; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 6; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 6; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 5; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 4; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 3; }
            }
            if(minInt == 25 ){
                if(secInt == 0){ mRunScore = 3; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 2; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 1; }
                if(secInt >= 13 && secInt <= 59){ mRunScore = 0; }
            }
            if(minInt >= 26){ mRunScore = 0; }
        }
// Age 42-46
        if(ageInt >= 37 && ageInt <= 41){
            if(minInt <= 13){ mRunScore = 100; }
            if(minInt == 14){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 99; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 98; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 97; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 97; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 96; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 95; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 94; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 93; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 92; }
            }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 92; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 91; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 90; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 90; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 89; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 88; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 87; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 86; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 85; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 84; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 83; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 83; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 83; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 82; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 81; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 80; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 79; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 78; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 77; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 77; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 76; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 75; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 75; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 74; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 73; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 72; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 71; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 70; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 70; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 69; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 68; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 67; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 66; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 66; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 65; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 64; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 63; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 63; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 62; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 61; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 60; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 59; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 58; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 57; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 57; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 57; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 56; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 55; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 54; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 53; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 52; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 51; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 50; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 50; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 49; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 49; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 48; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 47; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 46; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 45; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 44; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 43; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 43; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 42; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 41; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 40; }
            }
            if(minInt == 21 ){
                if(secInt == 0){ mRunScore = 40; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 39; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 38; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 37; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 37; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 36; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 35; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 34; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 33; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 32; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 31; }
            }
            if(minInt == 22 ){
                if(secInt == 0){ mRunScore = 31; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 30; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 30; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 29; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 28; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 27; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 26; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 25; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 24; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 23; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 23; }
            }
            if(minInt == 23 ){
                if(secInt == 0){ mRunScore = 23; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 22; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 21; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 20; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 19; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 18; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 17; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 17; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 16; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 15; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 14; }
            }
            if(minInt == 24 ){
                if(secInt == 0){ mRunScore = 14; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 13; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 12; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 11; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 10; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 10; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 9; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 8; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 7; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 6; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 5; }
            }
            if(minInt == 25 ){
                if(secInt == 0){ mRunScore = 5; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 4; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 3; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 3; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 2; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 1; }
                if(secInt >= 31 && secInt <= 59){ mRunScore = 0; }
            }
            if(minInt >= 26){ mRunScore = 0; }
        }
// Age 47-51
        if(ageInt >= 47 && ageInt <= 51){
            if(minInt <= 13){ mRunScore = 100; }
            if(minInt == 14){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 99; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 98; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 98; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 97; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 96; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 95; }
            }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 95; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 95; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 94; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 93; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 92; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 91; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 91; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 90; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 89; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 88; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 87; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 87; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 87; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 86; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 85; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 84; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 84; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 83; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 82; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 81; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 80; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 80; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 80; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 79; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 78; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 77; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 76; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 76; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 75; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 74; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 73; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 73; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 72; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 72; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 71; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 70; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 69; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 69; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 68; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 67; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 66; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 65; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 65; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 64; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 64; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 63; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 62; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 62; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 61; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 60; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 59; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 58; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 58; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 57; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 56; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 56; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 55; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 55; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 54; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 53; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 52; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 51; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 51; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 50; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 49; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 48; }
            }
            if(minInt == 21 ){
                if(secInt == 0){ mRunScore = 48; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 47; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 47; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 46; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 45; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 44; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 44; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 43; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 42; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 41; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 40; }
            }
            if(minInt == 22 ){
                if(secInt == 0){ mRunScore = 40; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 40; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 39; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 38; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 37; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 36; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 36; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 35; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 34; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 33; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 33; }
            }
            if(minInt == 23 ){
                if(secInt == 0){ mRunScore = 33; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 32; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 31; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 30; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 29; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 29; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 28; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 27; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 26; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 25; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 25; }
            }
            if(minInt == 24 ){
                if(secInt == 0){ mRunScore = 25; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 24; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 23; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 22; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 22; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 21; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 20; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 19; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 18; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 18; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 17; }
            }
            if(minInt == 25 ){
                if(secInt == 0){ mRunScore = 17; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 16; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 15; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 15; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 14; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 13; }
                if(secInt >= 31 && secInt <= 37){ mRunScore = 12; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 11; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 11; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 10; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 9; }
            }
            if(minInt == 26 ){
                if(secInt == 0){ mRunScore = 9; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 8; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 7; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 7; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 6; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 5; }
                if(secInt >= 31 && secInt <= 59){ mRunScore = 0; }
            }
            if(minInt >= 27){ mRunScore = 0; }
        }
// Age 52-56
        if(ageInt >= 52 && ageInt <= 56){
            if(minInt <= 13){ mRunScore = 100; }
            if(minInt == 14){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 100; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 100; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 100; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 99; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 98; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 98; }
            }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 98; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 97; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 96; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 95; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 95; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 94; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 93; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 92; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 91; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 91; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 90; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 90; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 89; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 88; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 87; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 87; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 86; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 85; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 84; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 84; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 83; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 82; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 82; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 81; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 80; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 80; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 79; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 78; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 77; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 76; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 76; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 75; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 74; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 74; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 73; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 73; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 72; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 71; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 70; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 69; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 69; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 68; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 67; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 66; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 66; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 65; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 65; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 64; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 63; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 62; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 62; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 61; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 60; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 59; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 58; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 58; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 58; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 57; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 56; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 55; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 55; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 54; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 53; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 52; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 51; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 51; }
            }
            if(minInt == 21 ){
                if(secInt == 0){ mRunScore = 51; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 50; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 49; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 48; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 47; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 47; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 46; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 45; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 44; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 44; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 43; }
            }
            if(minInt == 22 ){
                if(secInt == 0){ mRunScore = 43; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 42; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 41; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 40; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 40; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 39; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 38; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 37; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 36; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 36; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 35; }
            }
            if(minInt == 23 ){
                if(secInt == 0){ mRunScore = 35; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 34; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 33; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 33; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 32; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 31; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 30; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 29; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 29; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 28; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 27; }
            }
            if(minInt == 24 ){
                if(secInt == 0){ mRunScore = 27; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 26; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 25; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 25; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 24; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 23; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 22; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 22; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 21; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 20; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 19; }
            }
            if(minInt == 25 ){
                if(secInt == 0){ mRunScore = 19; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 18; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 18; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 17; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 16; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 15; }
                if(secInt >= 31 && secInt <= 37){ mRunScore = 15; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 14; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 14; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 13; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 12; }
            }
            if(minInt == 26 ){
                if(secInt == 0){ mRunScore = 11; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 11; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 10; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 9; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 8; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 7; }
                if(secInt >= 31 && secInt <= 59){ mRunScore = 0; }
            }
            if(minInt >= 27){ mRunScore = 0; }
        }
// Age 57-61
        if(ageInt >= 57 && ageInt <= 61){
            if(minInt <= 14){ mRunScore = 100; }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 99; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 98; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 97; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 97; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 96; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 95; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 94; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 94; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 93; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 92; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 91; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 91; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 90; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 89; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 88; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 87; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 86; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 85; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 85; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 84; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 83; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 83; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 82; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 81; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 80; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 79; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 78; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 77; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 77; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 77; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 76; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 75; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 74; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 73; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 72; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 71; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 70; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 70; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 69; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 68; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 68; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 67; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 66; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 65; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 64; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 63; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 63; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 62; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 61; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 60; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 59; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 59; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 58; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 57; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 57; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 56; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 55; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 54; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 53; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 52; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 51; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 50; }
            }
            if(minInt == 21 ){
                if(secInt == 0){ mRunScore = 50; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 50; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 49; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 48; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 47; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 46; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 45; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 44; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 43; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 43; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 42; }
            }
            if(minInt == 22 ){
                if(secInt == 0){ mRunScore = 42; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 41; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 40; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 39; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 38; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 37; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 37; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 36; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 35; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 34; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 33; }
            }
            if(minInt == 23 ){
                if(secInt == 0){ mRunScore = 33; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 32; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 31; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 30; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 30; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 29; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 28; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 27; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 26; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 25; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 24; }
            }
            if(minInt == 24 ){
                if(secInt == 0){ mRunScore = 24; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 23; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 23; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 22; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 21; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 20; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 19; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 18; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 17; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 17; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 16; }
            }
            if(minInt == 25 ){
                if(secInt == 0){ mRunScore = 16; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 15; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 14; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 13; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 12; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 11; }
                if(secInt >= 31 && secInt <= 37){ mRunScore = 10; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 10; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 9; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 8; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 7; }
            }
            if(minInt == 26 ){
                if(secInt == 0){ mRunScore = 7; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 6; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 5; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 4; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 3; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 3; }
                if(secInt >= 31 && secInt <= 59){ mRunScore = 0; }
            }
            if(minInt >= 27){ mRunScore = 0; }
        }
// Age 62+
        if(ageInt >= 62){
            if(minInt <= 14){ mRunScore = 100; }
            if(minInt == 15){
                if(secInt == 0){ mRunScore = 100; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 100; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 100; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 100; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 100; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 100; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 100; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 100; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 99; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 98; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 97; }
            }
            if(minInt == 16){
                if(secInt == 0){ mRunScore = 97; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 96; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 95; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 94; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 93; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 93; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 92; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 91; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 90; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 89; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 88; }
            }
            if(minInt == 17){
                if(secInt == 0){ mRunScore = 88; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 87; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 86; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 85; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 84; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 83; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 82; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 81; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 80; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 80; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 79; }
            }
            if(minInt == 18){
                if(secInt == 0){ mRunScore = 79; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 78; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 77; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 76; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 75; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 74; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 73; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 72; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 71; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 70; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 69; }
            }
            if(minInt == 19){
                if(secInt == 0){ mRunScore = 69; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 68; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 67; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 67; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 66; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 65; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 64; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 63; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 62; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 61; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 60; }
            }
            if(minInt == 20){
                if(secInt == 0){ mRunScore = 60; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 59; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 58; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 57; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 56; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 55; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 54; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 53; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 53; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 52; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 51; }
            }
            if(minInt == 21 ){
                if(secInt == 0){ mRunScore = 51; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 50; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 49; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 48; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 47; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 46; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 45; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 44; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 43; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 42; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 41; }
            }
            if(minInt == 22 ){
                if(secInt == 0){ mRunScore = 41; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 40; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 40; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 39; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 38; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 37; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 36; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 35; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 34; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 33; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 32; }
            }
            if(minInt == 23 ){
                if(secInt == 0){ mRunScore = 32; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 31; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 30; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 29; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 28; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 27; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 27; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 26; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 25; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 24; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 23; }
            }
            if(minInt == 24 ){
                if(secInt == 0){ mRunScore = 23; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 22; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 21; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 20; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 19; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 18; }
                if(secInt >= 31 && secInt <= 36){ mRunScore = 17; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 16; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 15; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 14; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 13; }
            }
            if(minInt == 25 ){
                if(secInt == 0){ mRunScore = 13; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 13; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 12; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 11; }
                if(secInt >= 19 && secInt <= 24){ mRunScore = 10; }
                if(secInt >= 25 && secInt <= 30){ mRunScore = 9; }
                if(secInt >= 31 && secInt <= 37){ mRunScore = 8; }
                if(secInt >= 37 && secInt <= 42){ mRunScore = 7; }
                if(secInt >= 43 && secInt <= 48){ mRunScore = 6; }
                if(secInt >= 49 && secInt <= 54){ mRunScore = 5; }
                if(secInt >= 55 && secInt <= 59){ mRunScore = 4; }
            }
            if(minInt == 26 ){
                if(secInt == 0){ mRunScore = 4; }
                if(secInt >= 1 && secInt <= 6){ mRunScore = 3; }
                if(secInt >= 7 && secInt <= 12){ mRunScore = 2; }
                if(secInt >= 13 && secInt <= 18){ mRunScore = 1; }
                if(secInt >= 19 && secInt <= 59){ mRunScore = 0; }
            }
            if(minInt >= 27){ mRunScore = 0; }
        }
        return mRunScore;
    }
}
