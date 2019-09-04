package dj.apps.apfttest1;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MalePushUpCal extends AppCompatActivity{
    public int malePushUpCal(int ageInt, int puInt){
        int mPuScore = 0;
        if(ageInt >= 17 && ageInt <= 21){
            //Toast.makeText( this, "Your Age is 17-21", Toast.LENGTH_LONG ).show();
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 3; break;
                case 2 : mPuScore = 5; break;
                case 3 : mPuScore = 6; break;
                case 4 : mPuScore = 8; break;
                case 5 : mPuScore = 9; break;
                case 6 : mPuScore = 10; break;
                case 7 : mPuScore = 12; break;
                case 8 : mPuScore = 13; break;
                case 9 : mPuScore = 14; break;
                case 10 : mPuScore = 16; break;
                case 11 : mPuScore = 17; break;
                case 12 : mPuScore = 19; break;
                case 13 : mPuScore = 20; break;
                case 14 : mPuScore = 21; break;
                case 15 : mPuScore = 23; break;
                case 16 : mPuScore = 24; break;
                case 17 : mPuScore = 26; break;
                case 18 : mPuScore = 27; break;
                case 19 : mPuScore = 28; break;
                case 20 : mPuScore = 30; break;
                case 21 : mPuScore = 31; break;
                case 22 : mPuScore = 32; break;
                case 23 : mPuScore = 34; break;
                case 24 : mPuScore = 35; break;
                case 25 : mPuScore = 37; break;
                case 26 : mPuScore = 38; break;
                case 27 : mPuScore = 39; break;
                case 28 : mPuScore = 41; break;
                case 29 : mPuScore = 42; break;
                case 30 : mPuScore = 43; break;
                case 31 : mPuScore = 45; break;
                case 32 : mPuScore = 46; break;
                case 33 : mPuScore = 48; break;
                case 34 : mPuScore = 49; break;
                case 35 : mPuScore = 50; break;
                case 36 : mPuScore = 52; break;
                case 37 : mPuScore = 53; break;
                case 38 : mPuScore = 54; break;
                case 39 : mPuScore = 56; break;
                case 40 : mPuScore = 57; break;
                case 41 : mPuScore = 59; break;
                case 42 : mPuScore = 60; break;
                case 43 : mPuScore = 61; break;
                case 44 : mPuScore = 63; break;
                case 45 : mPuScore = 64; break;
                case 46 : mPuScore = 66; break;
                case 47 : mPuScore = 67; break;
                case 48 : mPuScore = 68; break;
                case 49 : mPuScore = 70; break;
                case 50 : mPuScore = 71; break;
                case 51 : mPuScore = 72; break;
                case 52 : mPuScore = 74; break;
                case 53 : mPuScore = 75; break;
                case 54 : mPuScore = 77; break;
                case 55 : mPuScore = 78; break;
                case 56 : mPuScore = 79; break;
                case 57 : mPuScore = 81; break;
                case 58 : mPuScore = 82; break;
                case 59 : mPuScore = 83; break;
                case 60 : mPuScore = 85; break;
                case 61 : mPuScore = 88; break;
                case 62 : mPuScore = 88; break;
                case 63 : mPuScore = 89; break;
                case 64 : mPuScore = 90; break;
                case 65 : mPuScore = 92; break;
                case 66 : mPuScore = 93; break;
                case 67 : mPuScore = 94; break;
                case 68 : mPuScore = 96; break;
                case 69 : mPuScore = 97; break;
                case 70 : mPuScore = 99; break;
            }
            if(puInt>=71) mPuScore = 100;
        }else if(ageInt >= 22 && ageInt <= 26){
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 15; break;
                case 2 : mPuScore = 17; break;
                case 3 : mPuScore = 18; break;
                case 4 : mPuScore = 19; break;
                case 5 : mPuScore = 20; break;
                case 6 : mPuScore = 21; break;
                case 7 : mPuScore = 22; break;
                case 8 : mPuScore = 23; break;
                case 9 : mPuScore = 25; break;
                case 10 : mPuScore = 26; break;
                case 11 : mPuScore = 27; break;
                case 12 : mPuScore = 28; break;
                case 13 : mPuScore = 29; break;
                case 14 : mPuScore = 30; break;
                case 15 : mPuScore = 31; break;
                case 16 : mPuScore = 33; break;
                case 17 : mPuScore = 34; break;
                case 18 : mPuScore = 35; break;
                case 19 : mPuScore = 36; break;
                case 20 : mPuScore = 37; break;
                case 21 : mPuScore = 38; break;
                case 22 : mPuScore = 39; break;
                case 23 : mPuScore = 41; break;
                case 24 : mPuScore = 42; break;
                case 25 : mPuScore = 43; break;
                case 26 : mPuScore = 44; break;
                case 27 : mPuScore = 45; break;
                case 28 : mPuScore = 46; break;
                case 29 : mPuScore = 47; break;
                case 30 : mPuScore = 49; break;
                case 31 : mPuScore = 50; break;
                case 32 : mPuScore = 51; break;
                case 33 : mPuScore = 52; break;
                case 34 : mPuScore = 53; break;
                case 35 : mPuScore = 54; break;
                case 36 : mPuScore = 55; break;
                case 37 : mPuScore = 57; break;
                case 38 : mPuScore = 58; break;
                case 39 : mPuScore = 59; break;
                case 40 : mPuScore = 60; break;
                case 41 : mPuScore = 61; break;
                case 42 : mPuScore = 62; break;
                case 43 : mPuScore = 63; break;
                case 44 : mPuScore = 65; break;
                case 45 : mPuScore = 66; break;
                case 46 : mPuScore = 67; break;
                case 47 : mPuScore = 68; break;
                case 48 : mPuScore = 69; break;
                case 49 : mPuScore = 70; break;
                case 50 : mPuScore = 71; break;
                case 51 : mPuScore = 73; break;
                case 52 : mPuScore = 74; break;
                case 53 : mPuScore = 75; break;
                case 54 : mPuScore = 76; break;
                case 55 : mPuScore = 77; break;
                case 56 : mPuScore = 78; break;
                case 57 : mPuScore = 79; break;
                case 58 : mPuScore = 81; break;
                case 59 : mPuScore = 82; break;
                case 60 : mPuScore = 83; break;
                case 61 : mPuScore = 84; break;
                case 62 : mPuScore = 85; break;
                case 63 : mPuScore = 86; break;
                case 64 : mPuScore = 87; break;
                case 65 : mPuScore = 89; break;
                case 66 : mPuScore = 90; break;
                case 67 : mPuScore = 91; break;
                case 68 : mPuScore = 92; break;
                case 69 : mPuScore = 93; break;
                case 70 : mPuScore = 94; break;
                case 71 : mPuScore = 96; break;
                case 72 : mPuScore = 97; break;
                case 73 : mPuScore = 98; break;
                case 74 : mPuScore = 99; break;
            }
            if(puInt>=75) mPuScore = 100;

        }else if(ageInt >= 27 && ageInt <= 31){
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 20; break;
                case 2 : mPuScore = 21; break;
                case 3 : mPuScore = 22; break;
                case 4 : mPuScore = 23; break;
                case 5 : mPuScore = 24; break;
                case 6 : mPuScore = 25; break;
                case 7 : mPuScore = 26; break;
                case 8 : mPuScore = 27; break;
                case 9 : mPuScore = 28; break;
                case 10 : mPuScore = 29; break;

                case 11 : mPuScore = 31; break;
                case 12 : mPuScore = 32; break;
                case 13 : mPuScore = 33; break;
                case 14 : mPuScore = 34; break;
                case 15 : mPuScore = 35; break;
                case 16 : mPuScore = 36; break;
                case 17 : mPuScore = 37; break;
                case 18 : mPuScore = 38; break;
                case 19 : mPuScore = 39; break;
                case 20 : mPuScore = 40; break;

                case 21 : mPuScore = 41; break;
                case 22 : mPuScore = 42; break;
                case 23 : mPuScore = 43; break;
                case 24 : mPuScore = 44; break;
                case 25 : mPuScore = 45; break;
                case 26 : mPuScore = 46; break;
                case 27 : mPuScore = 47; break;
                case 28 : mPuScore = 48; break;
                case 29 : mPuScore = 49; break;
                case 30 : mPuScore = 50; break;

                case 31 : mPuScore = 52; break;
                case 32 : mPuScore = 53; break;
                case 33 : mPuScore = 54; break;
                case 34 : mPuScore = 55; break;
                case 35 : mPuScore = 56; break;
                case 36 : mPuScore = 57; break;
                case 37 : mPuScore = 58; break;
                case 38 : mPuScore = 59; break;
                case 39 : mPuScore = 60; break;
                case 40 : mPuScore = 61; break;

                case 41 : mPuScore = 62; break;
                case 42 : mPuScore = 63; break;
                case 43 : mPuScore = 64; break;
                case 44 : mPuScore = 65; break;
                case 45 : mPuScore = 66; break;
                case 46 : mPuScore = 67; break;
                case 47 : mPuScore = 68; break;
                case 48 : mPuScore = 69; break;
                case 49 : mPuScore = 71; break;
                case 50 : mPuScore = 72; break;

                case 51 : mPuScore = 73; break;
                case 52 : mPuScore = 74; break;
                case 53 : mPuScore = 75; break;
                case 54 : mPuScore = 76; break;
                case 55 : mPuScore = 77; break;
                case 56 : mPuScore = 78; break;
                case 57 : mPuScore = 79; break;
                case 58 : mPuScore = 80; break;
                case 59 : mPuScore = 81; break;
                case 60 : mPuScore = 82; break;

                case 61 : mPuScore = 83; break;
                case 62 : mPuScore = 84; break;
                case 63 : mPuScore = 85; break;
                case 64 : mPuScore = 86; break;
                case 65 : mPuScore = 87; break;
                case 66 : mPuScore = 88; break;
                case 67 : mPuScore = 89; break;
                case 68 : mPuScore = 91; break;
                case 69 : mPuScore = 92; break;
                case 70 : mPuScore = 93; break;

                case 71 : mPuScore = 94; break;
                case 72 : mPuScore = 95; break;
                case 73 : mPuScore = 96; break;
                case 74 : mPuScore = 97; break;
                case 75 : mPuScore = 98; break;
                case 76 : mPuScore = 99; break;
            }
            if(puInt>=77) mPuScore = 100;

        }else if(ageInt >= 32 && ageInt <= 36){
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 24; break;
                case 2 : mPuScore = 25; break;
                case 3 : mPuScore = 26; break;
                case 4 : mPuScore = 27; break;
                case 5 : mPuScore = 28; break;
                case 6 : mPuScore = 29; break;
                case 7 : mPuScore = 30; break;
                case 8 : mPuScore = 31; break;
                case 9 : mPuScore = 32; break;
                case 10 : mPuScore = 33; break;

                case 11 : mPuScore = 34; break;
                case 12 : mPuScore = 35; break;
                case 13 : mPuScore = 36; break;
                case 14 : mPuScore = 37; break;
                case 15 : mPuScore = 38; break;
                case 16 : mPuScore = 39; break;
                case 17 : mPuScore = 41; break;
                case 18 : mPuScore = 42; break;
                case 19 : mPuScore = 43; break;
                case 20 : mPuScore = 44; break;

                case 21 : mPuScore = 45; break;
                case 22 : mPuScore = 46; break;
                case 23 : mPuScore = 47; break;
                case 24 : mPuScore = 48; break;
                case 25 : mPuScore = 49; break;
                case 26 : mPuScore = 50; break;
                case 27 : mPuScore = 51; break;
                case 28 : mPuScore = 52; break;
                case 29 : mPuScore = 53; break;
                case 30 : mPuScore = 54; break;

                case 31 : mPuScore = 55; break;
                case 32 : mPuScore = 56; break;
                case 33 : mPuScore = 57; break;
                case 34 : mPuScore = 58; break;
                case 35 : mPuScore = 59; break;
                case 36 : mPuScore = 60; break;
                case 37 : mPuScore = 61; break;
                case 38 : mPuScore = 62; break;
                case 39 : mPuScore = 63; break;
                case 40 : mPuScore = 64; break;

                case 41 : mPuScore = 65; break;
                case 42 : mPuScore = 66; break;
                case 43 : mPuScore = 67; break;
                case 44 : mPuScore = 68; break;
                case 45 : mPuScore = 69; break;
                case 46 : mPuScore = 70; break;
                case 47 : mPuScore = 71; break;
                case 48 : mPuScore = 72; break;
                case 49 : mPuScore = 73; break;
                case 50 : mPuScore = 74; break;

                case 51 : mPuScore = 75; break;
                case 52 : mPuScore = 76; break;
                case 53 : mPuScore = 77; break;
                case 54 : mPuScore = 78; break;
                case 55 : mPuScore = 79; break;
                case 56 : mPuScore = 81; break;
                case 57 : mPuScore = 82; break;
                case 58 : mPuScore = 83; break;
                case 59 : mPuScore = 84; break;
                case 60 : mPuScore = 85; break;

                case 61 : mPuScore = 86; break;
                case 62 : mPuScore = 87; break;
                case 63 : mPuScore = 88; break;
                case 64 : mPuScore = 89; break;
                case 65 : mPuScore = 90; break;
                case 66 : mPuScore = 91; break;
                case 67 : mPuScore = 92; break;
                case 68 : mPuScore = 93; break;
                case 69 : mPuScore = 94; break;
                case 70 : mPuScore = 95; break;

                case 71 : mPuScore = 96; break;
                case 72 : mPuScore = 97; break;
                case 73 : mPuScore = 98; break;
                case 74 : mPuScore = 99; break;
            }
            if(puInt>=75) mPuScore = 100;

        }else if(ageInt >= 37 && ageInt <= 41){
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 26; break;
                case 2 : mPuScore = 27; break;
                case 3 : mPuScore = 28; break;
                case 4 : mPuScore = 29; break;
                case 5 : mPuScore = 30; break;
                case 6 : mPuScore = 31; break;
                case 7 : mPuScore = 32; break;
                case 8 : mPuScore = 33; break;
                case 9 : mPuScore = 34; break;
                case 10 : mPuScore = 35; break;

                case 11 : mPuScore = 36; break;
                case 12 : mPuScore = 37; break;
                case 13 : mPuScore = 38; break;
                case 14 : mPuScore = 39; break;
                case 15 : mPuScore = 41; break;
                case 16 : mPuScore = 42; break;
                case 17 : mPuScore = 43; break;
                case 18 : mPuScore = 44; break;
                case 19 : mPuScore = 45; break;
                case 20 : mPuScore = 46; break;

                case 21 : mPuScore = 47; break;
                case 22 : mPuScore = 48; break;
                case 23 : mPuScore = 49; break;
                case 24 : mPuScore = 50; break;
                case 25 : mPuScore = 51; break;
                case 26 : mPuScore = 52; break;
                case 27 : mPuScore = 53; break;
                case 28 : mPuScore = 54; break;
                case 29 : mPuScore = 55; break;
                case 30 : mPuScore = 56; break;

                case 31 : mPuScore = 57; break;
                case 32 : mPuScore = 58; break;
                case 33 : mPuScore = 59; break;
                case 34 : mPuScore = 60; break;
                case 35 : mPuScore = 61; break;
                case 36 : mPuScore = 62; break;
                case 37 : mPuScore = 63; break;
                case 38 : mPuScore = 64; break;
                case 39 : mPuScore = 65; break;
                case 40 : mPuScore = 66; break;

                case 41 : mPuScore = 67; break;
                case 42 : mPuScore = 68; break;
                case 43 : mPuScore = 69; break;
                case 44 : mPuScore = 70; break;
                case 45 : mPuScore = 71; break;
                case 46 : mPuScore = 72; break;
                case 47 : mPuScore = 73; break;
                case 48 : mPuScore = 74; break;
                case 49 : mPuScore = 75; break;
                case 50 : mPuScore = 76; break;

                case 51 : mPuScore = 77; break;
                case 52 : mPuScore = 78; break;
                case 53 : mPuScore = 79; break;
                case 54 : mPuScore = 81; break;
                case 55 : mPuScore = 82; break;
                case 56 : mPuScore = 83; break;
                case 57 : mPuScore = 84; break;
                case 58 : mPuScore = 85; break;
                case 59 : mPuScore = 86; break;
                case 60 : mPuScore = 87; break;

                case 61 : mPuScore = 88; break;
                case 62 : mPuScore = 89; break;
                case 63 : mPuScore = 90; break;
                case 64 : mPuScore = 91; break;
                case 65 : mPuScore = 92; break;
                case 66 : mPuScore = 93; break;
                case 67 : mPuScore = 94; break;
                case 68 : mPuScore = 95; break;
                case 69 : mPuScore = 96; break;
                case 70 : mPuScore = 97; break;

                case 71 : mPuScore = 98; break;
                case 72 : mPuScore = 99; break;
            }
            if(puInt>=73) mPuScore = 100;

        }else if(ageInt >= 42 && ageInt <= 46){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 32; break;
                case 6 : mPuScore = 33; break;
                case 7 : mPuScore = 34; break;
                case 8 : mPuScore = 36; break;
                case 9 : mPuScore = 37; break;
                case 10 : mPuScore = 38; break;

                case 11 : mPuScore = 39; break;
                case 12 : mPuScore = 40; break;
                case 13 : mPuScore = 41; break;
                case 14 : mPuScore = 42; break;
                case 15 : mPuScore = 43; break;
                case 16 : mPuScore = 44; break;
                case 17 : mPuScore = 46; break;
                case 18 : mPuScore = 47; break;
                case 19 : mPuScore = 48; break;
                case 20 : mPuScore = 49; break;

                case 21 : mPuScore = 50; break;
                case 22 : mPuScore = 51; break;
                case 23 : mPuScore = 52; break;
                case 24 : mPuScore = 53; break;
                case 25 : mPuScore = 54; break;
                case 26 : mPuScore = 56; break;
                case 27 : mPuScore = 57; break;
                case 28 : mPuScore = 58; break;
                case 29 : mPuScore = 59; break;
                case 30 : mPuScore = 60; break;

                case 31 : mPuScore = 61; break;
                case 32 : mPuScore = 62; break;
                case 33 : mPuScore = 63; break;
                case 34 : mPuScore = 64; break;
                case 35 : mPuScore = 66; break;
                case 36 : mPuScore = 67; break;
                case 37 : mPuScore = 68; break;
                case 38 : mPuScore = 69; break;
                case 39 : mPuScore = 70; break;
                case 40 : mPuScore = 71; break;

                case 41 : mPuScore = 72; break;
                case 42 : mPuScore = 73; break;
                case 43 : mPuScore = 74; break;
                case 44 : mPuScore = 76; break;
                case 45 : mPuScore = 77; break;
                case 46 : mPuScore = 78; break;
                case 47 : mPuScore = 79; break;
                case 48 : mPuScore = 80; break;
                case 49 : mPuScore = 81; break;
                case 50 : mPuScore = 82; break;

                case 51 : mPuScore = 83; break;
                case 52 : mPuScore = 84; break;
                case 53 : mPuScore = 86; break;
                case 54 : mPuScore = 87; break;
                case 55 : mPuScore = 88; break;
                case 56 : mPuScore = 89; break;
                case 57 : mPuScore = 90; break;
                case 58 : mPuScore = 91; break;
                case 59 : mPuScore = 92; break;
                case 60 : mPuScore = 93; break;

                case 61 : mPuScore = 94; break;
                case 62 : mPuScore = 96; break;
                case 63 : mPuScore = 97; break;
                case 64 : mPuScore = 98; break;
                case 65 : mPuScore = 99; break;
            }
            if(puInt>=66) mPuScore = 100;

        }else if(ageInt >= 47 && ageInt <= 51){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 36; break;
                case 6 : mPuScore = 38; break;
                case 7 : mPuScore = 39; break;
                case 8 : mPuScore = 40; break;
                case 9 : mPuScore = 41; break;
                case 10 : mPuScore = 42; break;

                case 11 : mPuScore = 44; break;
                case 12 : mPuScore = 45; break;
                case 13 : mPuScore = 46; break;
                case 14 : mPuScore = 47; break;
                case 15 : mPuScore = 48; break;
                case 16 : mPuScore = 49; break;
                case 17 : mPuScore = 51; break;
                case 18 : mPuScore = 52; break;
                case 19 : mPuScore = 53; break;
                case 20 : mPuScore = 54; break;

                case 21 : mPuScore = 55; break;
                case 22 : mPuScore = 56; break;
                case 23 : mPuScore = 58; break;
                case 24 : mPuScore = 59; break;
                case 25 : mPuScore = 60; break;
                case 26 : mPuScore = 61; break;
                case 27 : mPuScore = 62; break;
                case 28 : mPuScore = 64; break;
                case 29 : mPuScore = 65; break;
                case 30 : mPuScore = 66; break;

                case 31 : mPuScore = 67; break;
                case 32 : mPuScore = 68; break;
                case 33 : mPuScore = 69; break;
                case 34 : mPuScore = 71; break;
                case 35 : mPuScore = 72; break;
                case 36 : mPuScore = 73; break;
                case 37 : mPuScore = 74; break;
                case 38 : mPuScore = 75; break;
                case 39 : mPuScore = 76; break;
                case 40 : mPuScore = 78; break;

                case 41 : mPuScore = 79; break;
                case 42 : mPuScore = 80; break;
                case 43 : mPuScore = 81; break;
                case 44 : mPuScore = 82; break;
                case 45 : mPuScore = 84; break;
                case 46 : mPuScore = 85; break;
                case 47 : mPuScore = 86; break;
                case 48 : mPuScore = 87; break;
                case 49 : mPuScore = 88; break;
                case 50 : mPuScore = 89; break;

                case 51 : mPuScore = 91; break;
                case 52 : mPuScore = 92; break;
                case 53 : mPuScore = 93; break;
                case 54 : mPuScore = 94; break;
                case 55 : mPuScore = 95; break;
                case 56 : mPuScore = 96; break;
                case 57 : mPuScore = 98; break;
                case 58 : mPuScore = 99; break;
            }
            if(puInt>=59) mPuScore = 100;

        }else if(ageInt >= 52 && ageInt <= 56){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 43; break;
                case 6 : mPuScore = 44; break;
                case 7 : mPuScore = 46; break;
                case 8 : mPuScore = 47; break;
                case 9 : mPuScore = 48; break;
                case 10 : mPuScore = 49; break;

                case 11 : mPuScore = 50; break;
                case 12 : mPuScore = 51; break;
                case 13 : mPuScore = 52; break;
                case 14 : mPuScore = 53; break;
                case 15 : mPuScore = 54; break;
                case 16 : mPuScore = 56; break;
                case 17 : mPuScore = 57; break;
                case 18 : mPuScore = 58; break;
                case 19 : mPuScore = 59; break;
                case 20 : mPuScore = 60; break;

                case 21 : mPuScore = 61; break;
                case 22 : mPuScore = 62; break;
                case 23 : mPuScore = 63; break;
                case 24 : mPuScore = 64; break;
                case 25 : mPuScore = 66; break;
                case 26 : mPuScore = 67; break;
                case 27 : mPuScore = 68; break;
                case 28 : mPuScore = 69; break;
                case 29 : mPuScore = 70; break;
                case 30 : mPuScore = 71; break;

                case 31 : mPuScore = 72; break;
                case 32 : mPuScore = 73; break;
                case 33 : mPuScore = 74; break;
                case 34 : mPuScore = 76; break;
                case 35 : mPuScore = 77; break;
                case 36 : mPuScore = 78; break;
                case 37 : mPuScore = 79; break;
                case 38 : mPuScore = 80; break;
                case 39 : mPuScore = 81; break;
                case 40 : mPuScore = 82; break;

                case 41 : mPuScore = 83; break;
                case 42 : mPuScore = 84; break;
                case 43 : mPuScore = 86; break;
                case 44 : mPuScore = 87; break;
                case 45 : mPuScore = 88; break;
                case 46 : mPuScore = 89; break;
                case 47 : mPuScore = 90; break;
                case 48 : mPuScore = 91; break;
                case 49 : mPuScore = 92; break;
                case 50 : mPuScore = 93; break;

                case 51 : mPuScore = 94; break;
                case 52 : mPuScore = 96; break;
                case 53 : mPuScore = 97; break;
                case 54 : mPuScore = 98; break;
                case 55 : mPuScore = 99; break;
            }
            if(puInt>=56) mPuScore = 100;

        }else if(ageInt >= 57 && ageInt <= 61){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 45; break;
                case 6 : mPuScore = 46; break;
                case 7 : mPuScore = 47; break;
                case 8 : mPuScore = 49; break;
                case 9 : mPuScore = 50; break;
                case 10 : mPuScore = 51; break;

                case 11 : mPuScore = 52; break;
                case 12 : mPuScore = 53; break;
                case 13 : mPuScore = 54; break;
                case 14 : mPuScore = 55; break;
                case 15 : mPuScore = 57; break;
                case 16 : mPuScore = 58; break;
                case 17 : mPuScore = 59; break;
                case 18 : mPuScore = 60; break;
                case 19 : mPuScore = 61; break;
                case 20 : mPuScore = 62; break;

                case 21 : mPuScore = 63; break;
                case 22 : mPuScore = 65; break;
                case 23 : mPuScore = 66; break;
                case 24 : mPuScore = 67; break;
                case 25 : mPuScore = 68; break;
                case 26 : mPuScore = 69; break;
                case 27 : mPuScore = 70; break;
                case 28 : mPuScore = 71; break;
                case 29 : mPuScore = 73; break;
                case 30 : mPuScore = 74; break;

                case 31 : mPuScore = 75; break;
                case 32 : mPuScore = 76; break;
                case 33 : mPuScore = 77; break;
                case 34 : mPuScore = 78; break;
                case 35 : mPuScore = 79; break;
                case 36 : mPuScore = 81; break;
                case 37 : mPuScore = 82; break;
                case 38 : mPuScore = 83; break;
                case 39 : mPuScore = 84; break;
                case 40 : mPuScore = 85; break;

                case 41 : mPuScore = 86; break;
                case 42 : mPuScore = 87; break;
                case 43 : mPuScore = 89; break;
                case 44 : mPuScore = 90; break;
                case 45 : mPuScore = 91; break;
                case 46 : mPuScore = 92; break;
                case 47 : mPuScore = 93; break;
                case 48 : mPuScore = 94; break;
                case 49 : mPuScore = 95; break;
                case 50 : mPuScore = 97; break;

                case 51 : mPuScore = 98; break;
                case 52 : mPuScore = 99; break;
            }
            if(puInt>=53) mPuScore = 100;

        }else if(ageInt >= 62){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 47; break;
                case 6 : mPuScore = 48; break;
                case 7 : mPuScore = 49; break;
                case 8 : mPuScore = 51; break;
                case 9 : mPuScore = 52; break;
                case 10 : mPuScore = 53; break;

                case 11 : mPuScore = 54; break;
                case 12 : mPuScore = 55; break;
                case 13 : mPuScore = 56; break;
                case 14 : mPuScore = 58; break;
                case 15 : mPuScore = 59; break;
                case 16 : mPuScore = 60; break;
                case 17 : mPuScore = 61; break;
                case 18 : mPuScore = 62; break;
                case 19 : mPuScore = 64; break;
                case 20 : mPuScore = 65; break;

                case 21 : mPuScore = 66; break;
                case 22 : mPuScore = 67; break;
                case 23 : mPuScore = 68; break;
                case 24 : mPuScore = 69; break;
                case 25 : mPuScore = 71; break;
                case 26 : mPuScore = 72; break;
                case 27 : mPuScore = 73; break;
                case 28 : mPuScore = 74; break;
                case 29 : mPuScore = 75; break;
                case 30 : mPuScore = 76; break;

                case 31 : mPuScore = 78; break;
                case 32 : mPuScore = 79; break;
                case 33 : mPuScore = 80; break;
                case 34 : mPuScore = 81; break;
                case 35 : mPuScore = 82; break;
                case 36 : mPuScore = 84; break;
                case 37 : mPuScore = 85; break;
                case 38 : mPuScore = 86; break;
                case 39 : mPuScore = 87; break;
                case 40 : mPuScore = 88; break;

                case 41 : mPuScore = 89; break;
                case 42 : mPuScore = 91; break;
                case 43 : mPuScore = 92; break;
                case 44 : mPuScore = 93; break;
                case 45 : mPuScore = 94; break;
                case 46 : mPuScore = 95; break;
                case 47 : mPuScore = 96; break;
                case 48 : mPuScore = 98; break;
                case 49 : mPuScore = 99; break;
            }
            if(puInt>=50) mPuScore = 100;
        }else{
            Toast.makeText( this, "Invalid Push-up Count", Toast.LENGTH_LONG ).show();
        }
        return mPuScore;
    }
}
