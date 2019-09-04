package dj.apps.apfttest1;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class FemalePushUpCal extends AppCompatActivity {
    public int femalePushUpCal(int ageInt, int puInt){
        int mPuScore = 0;
        if(ageInt >= 17 && ageInt <= 21){
            //Toast.makeText( this, "Your Age is 17-21", Toast.LENGTH_LONG ).show();
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 29; break;
                case 2 : mPuScore = 30; break;
                case 3 : mPuScore = 32; break;
                case 4 : mPuScore = 34; break;
                case 5 : mPuScore = 36; break;
                case 6 : mPuScore = 37; break;
                case 7 : mPuScore = 39; break;
                case 8 : mPuScore = 41; break;
                case 9 : mPuScore = 43; break;
                case 10 : mPuScore = 44; break;

                case 11 : mPuScore = 46; break;
                case 12 : mPuScore = 48; break;
                case 13 : mPuScore = 50; break;
                case 14 : mPuScore = 51; break;
                case 15 : mPuScore = 53; break;
                case 16 : mPuScore = 55; break;
                case 17 : mPuScore = 57; break;
                case 18 : mPuScore = 58; break;
                case 19 : mPuScore = 60; break;
                case 20 : mPuScore = 62; break;

                case 21 : mPuScore = 63; break;
                case 22 : mPuScore = 65; break;
                case 23 : mPuScore = 67; break;
                case 24 : mPuScore = 69; break;
                case 25 : mPuScore = 70; break;
                case 26 : mPuScore = 72; break;
                case 27 : mPuScore = 74; break;
                case 28 : mPuScore = 76; break;
                case 29 : mPuScore = 77; break;
                case 30 : mPuScore = 79; break;

                case 31 : mPuScore = 81; break;
                case 32 : mPuScore = 83; break;
                case 33 : mPuScore = 84; break;
                case 34 : mPuScore = 86; break;
                case 35 : mPuScore = 88; break;
                case 36 : mPuScore = 90; break;
                case 37 : mPuScore = 91; break;
                case 38 : mPuScore = 93; break;
                case 39 : mPuScore = 95; break;
                case 40 : mPuScore = 97; break;
                case 41 : mPuScore = 98; break;
            }
            if(puInt>=42) mPuScore = 100;

        }else if(ageInt >= 22 && ageInt <= 26){
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 38; break;
                case 2 : mPuScore = 39; break;
                case 3 : mPuScore = 41; break;
                case 4 : mPuScore = 42; break;
                case 5 : mPuScore = 43; break;
                case 6 : mPuScore = 45; break;
                case 7 : mPuScore = 46; break;
                case 8 : mPuScore = 48; break;
                case 9 : mPuScore = 49; break;
                case 10 : mPuScore = 49; break;

                case 11 : mPuScore = 50; break;
                case 12 : mPuScore = 52; break;
                case 13 : mPuScore = 54; break;
                case 14 : mPuScore = 56; break;
                case 15 : mPuScore = 57; break;
                case 16 : mPuScore = 59; break;
                case 17 : mPuScore = 60; break;
                case 18 : mPuScore = 61; break;
                case 19 : mPuScore = 63; break;
                case 20 : mPuScore = 64; break;

                case 21 : mPuScore = 66; break;
                case 22 : mPuScore = 67; break;
                case 23 : mPuScore = 68; break;
                case 24 : mPuScore = 70; break;
                case 25 : mPuScore = 71; break;
                case 26 : mPuScore = 72; break;
                case 27 : mPuScore = 74; break;
                case 28 : mPuScore = 75; break;
                case 29 : mPuScore = 77; break;
                case 30 : mPuScore = 78; break;

                case 31 : mPuScore = 79; break;
                case 32 : mPuScore = 81; break;
                case 33 : mPuScore = 82; break;
                case 34 : mPuScore = 83; break;
                case 35 : mPuScore = 85; break;
                case 36 : mPuScore = 86; break;
                case 37 : mPuScore = 88; break;
                case 38 : mPuScore = 89; break;
                case 39 : mPuScore = 90; break;
                case 40 : mPuScore = 92; break;

                case 41 : mPuScore = 93; break;
                case 42 : mPuScore = 94; break;
                case 43 : mPuScore = 96; break;
                case 44 : mPuScore = 97; break;
                case 45 : mPuScore = 99; break;
            }
            if(puInt>=46) mPuScore = 100;

        }else if(ageInt >= 27 && ageInt <= 31){
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 41; break;
                case 2 : mPuScore = 42; break;
                case 3 : mPuScore = 43; break;
                case 4 : mPuScore = 44; break;
                case 5 : mPuScore = 45; break;
                case 6 : mPuScore = 47; break;
                case 7 : mPuScore = 48; break;
                case 8 : mPuScore = 49; break;
                case 9 : mPuScore = 49; break;
                case 10 : mPuScore = 50; break;

                case 11 : mPuScore = 52; break;
                case 12 : mPuScore = 54; break;
                case 13 : mPuScore = 55; break;
                case 14 : mPuScore = 56; break;
                case 15 : mPuScore = 58; break;
                case 16 : mPuScore = 59; break;
                case 17 : mPuScore = 60; break;
                case 18 : mPuScore = 61; break;
                case 19 : mPuScore = 62; break;
                case 20 : mPuScore = 64; break;

                case 21 : mPuScore = 65; break;
                case 22 : mPuScore = 66; break;
                case 23 : mPuScore = 67; break;
                case 24 : mPuScore = 68; break;
                case 25 : mPuScore = 70; break;
                case 26 : mPuScore = 71; break;
                case 27 : mPuScore = 72; break;
                case 28 : mPuScore = 73; break;
                case 29 : mPuScore = 75; break;
                case 30 : mPuScore = 76; break;

                case 31 : mPuScore = 77; break;
                case 32 : mPuScore = 78; break;
                case 33 : mPuScore = 79; break;
                case 34 : mPuScore = 81; break;
                case 35 : mPuScore = 82; break;
                case 36 : mPuScore = 83; break;
                case 37 : mPuScore = 84; break;
                case 38 : mPuScore = 85; break;
                case 39 : mPuScore = 87; break;
                case 40 : mPuScore = 88; break;

                case 41 : mPuScore = 89; break;
                case 42 : mPuScore = 90; break;
                case 43 : mPuScore = 92; break;
                case 44 : mPuScore = 93; break;
                case 45 : mPuScore = 94; break;
                case 46 : mPuScore = 95; break;
                case 47 : mPuScore = 96; break;
                case 48 : mPuScore = 98; break;
                case 49 : mPuScore = 99; break;
            }
            if(puInt>=50) mPuScore = 100;

        }else if(ageInt >= 32 && ageInt <= 36){
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 41; break;
                case 2 : mPuScore = 43; break;
                case 3 : mPuScore = 44; break;
                case 4 : mPuScore = 45; break;
                case 5 : mPuScore = 47; break;
                case 6 : mPuScore = 48; break;
                case 7 : mPuScore = 49; break;
                case 8 : mPuScore = 49; break;
                case 9 : mPuScore = 50; break;
                case 10 : mPuScore = 52; break;

                case 11 : mPuScore = 54; break;
                case 12 : mPuScore = 56; break;
                case 13 : mPuScore = 58; break;
                case 14 : mPuScore = 59; break;
                case 15 : mPuScore = 60; break;
                case 16 : mPuScore = 61; break;
                case 17 : mPuScore = 63; break;
                case 18 : mPuScore = 64; break;
                case 19 : mPuScore = 65; break;
                case 20 : mPuScore = 67; break;

                case 21 : mPuScore = 68; break;
                case 22 : mPuScore = 69; break;
                case 23 : mPuScore = 71; break;
                case 24 : mPuScore = 72; break;
                case 25 : mPuScore = 73; break;
                case 26 : mPuScore = 75; break;
                case 27 : mPuScore = 76; break;
                case 28 : mPuScore = 77; break;
                case 29 : mPuScore = 79; break;
                case 30 : mPuScore = 80; break;

                case 31 : mPuScore = 81; break;
                case 32 : mPuScore = 83; break;
                case 33 : mPuScore = 84; break;
                case 34 : mPuScore = 85; break;
                case 35 : mPuScore = 87; break;
                case 36 : mPuScore = 88; break;
                case 37 : mPuScore = 89; break;
                case 38 : mPuScore = 91; break;
                case 39 : mPuScore = 92; break;
                case 40 : mPuScore = 93; break;

                case 41 : mPuScore = 95; break;
                case 42 : mPuScore = 96; break;
                case 43 : mPuScore = 97; break;
                case 44 : mPuScore = 99; break;
            }
            if(puInt>=45) mPuScore = 100;

        }else if(ageInt >= 37 && ageInt <= 41){
            switch (puInt){
                case 0 : mPuScore = 0; break;
                case 1 : mPuScore = 42; break;
                case 2 : mPuScore = 44; break;
                case 3 : mPuScore = 45; break;
                case 4 : mPuScore = 47; break;
                case 5 : mPuScore = 48; break;
                case 6 : mPuScore = 50; break;
                case 7 : mPuScore = 51; break;
                case 8 : mPuScore = 53; break;
                case 9 : mPuScore = 54; break;
                case 10 : mPuScore = 56; break;

                case 11 : mPuScore = 57; break;
                case 12 : mPuScore = 59; break;
                case 13 : mPuScore = 60; break;
                case 14 : mPuScore = 61; break;
                case 15 : mPuScore = 63; break;
                case 16 : mPuScore = 64; break;
                case 17 : mPuScore = 66; break;
                case 18 : mPuScore = 67; break;
                case 19 : mPuScore = 69; break;
                case 20 : mPuScore = 70; break;

                case 21 : mPuScore = 72; break;
                case 22 : mPuScore = 73; break;
                case 23 : mPuScore = 75; break;
                case 24 : mPuScore = 76; break;
                case 25 : mPuScore = 78; break;
                case 26 : mPuScore = 79; break;
                case 27 : mPuScore = 81; break;
                case 28 : mPuScore = 82; break;
                case 29 : mPuScore = 84; break;
                case 30 : mPuScore = 85; break;

                case 31 : mPuScore = 87; break;
                case 32 : mPuScore = 88; break;
                case 33 : mPuScore = 90; break;
                case 34 : mPuScore = 91; break;
                case 35 : mPuScore = 93; break;
                case 36 : mPuScore = 94; break;
                case 37 : mPuScore = 96; break;
                case 38 : mPuScore = 97; break;
                case 39 : mPuScore = 99; break;
            }
            if(puInt>=40) mPuScore = 100;

        }else if(ageInt >= 42 && ageInt <= 46){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 49; break;
                case 6 : mPuScore = 50; break;
                case 7 : mPuScore = 52; break;
                case 8 : mPuScore = 54; break;
                case 9 : mPuScore = 55; break;
                case 10 : mPuScore = 57; break;

                case 11 : mPuScore = 58; break;
                case 12 : mPuScore = 60; break;
                case 13 : mPuScore = 62; break;
                case 14 : mPuScore = 63; break;
                case 15 : mPuScore = 65; break;
                case 16 : mPuScore = 66; break;
                case 17 : mPuScore = 68; break;
                case 18 : mPuScore = 70; break;
                case 19 : mPuScore = 71; break;
                case 20 : mPuScore = 73; break;

                case 21 : mPuScore = 74; break;
                case 22 : mPuScore = 76; break;
                case 23 : mPuScore = 78; break;
                case 24 : mPuScore = 79; break;
                case 25 : mPuScore = 81; break;
                case 26 : mPuScore = 82; break;
                case 27 : mPuScore = 84; break;
                case 28 : mPuScore = 86; break;
                case 29 : mPuScore = 87; break;
                case 30 : mPuScore = 89; break;

                case 31 : mPuScore = 90; break;
                case 32 : mPuScore = 92; break;
                case 33 : mPuScore = 94; break;
                case 34 : mPuScore = 95; break;
                case 35 : mPuScore = 97; break;
                case 36 : mPuScore = 98; break;
            }
            if(puInt>=37) mPuScore = 100;

        }else if(ageInt >= 47 && ageInt <= 51){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 52; break;
                case 6 : mPuScore = 53; break;
                case 7 : mPuScore = 55; break;
                case 8 : mPuScore = 57; break;
                case 9 : mPuScore = 58; break;
                case 10 : mPuScore = 60; break;

                case 11 : mPuScore = 62; break;
                case 12 : mPuScore = 63; break;
                case 13 : mPuScore = 65; break;
                case 14 : mPuScore = 67; break;
                case 15 : mPuScore = 68; break;
                case 16 : mPuScore = 70; break;
                case 17 : mPuScore = 72; break;
                case 18 : mPuScore = 73; break;
                case 19 : mPuScore = 75; break;
                case 20 : mPuScore = 77; break;

                case 21 : mPuScore = 78; break;
                case 22 : mPuScore = 80; break;
                case 23 : mPuScore = 82; break;
                case 24 : mPuScore = 83; break;
                case 25 : mPuScore = 85; break;
                case 26 : mPuScore = 87; break;
                case 27 : mPuScore = 88; break;
                case 28 : mPuScore = 90; break;
                case 29 : mPuScore = 92; break;
                case 30 : mPuScore = 93; break;

                case 31 : mPuScore = 95; break;
                case 32 : mPuScore = 97; break;
                case 33 : mPuScore = 98; break;
            }
            if(puInt>=34) mPuScore = 100;

        }else if(ageInt >= 52 && ageInt <= 56){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 53; break;
                case 6 : mPuScore = 55; break;
                case 7 : mPuScore = 56; break;
                case 8 : mPuScore = 58; break;
                case 9 : mPuScore = 60; break;
                case 10 : mPuScore = 62; break;

                case 11 : mPuScore = 64; break;
                case 12 : mPuScore = 65; break;
                case 13 : mPuScore = 67; break;
                case 14 : mPuScore = 69; break;
                case 15 : mPuScore = 71; break;
                case 16 : mPuScore = 73; break;
                case 17 : mPuScore = 75; break;
                case 18 : mPuScore = 76; break;
                case 19 : mPuScore = 78; break;
                case 20 : mPuScore = 80; break;

                case 21 : mPuScore = 82; break;
                case 22 : mPuScore = 84; break;
                case 23 : mPuScore = 85; break;
                case 24 : mPuScore = 87; break;
                case 25 : mPuScore = 89; break;
                case 26 : mPuScore = 91; break;
                case 27 : mPuScore = 93; break;
                case 28 : mPuScore = 95; break;
                case 29 : mPuScore = 96; break;
                case 30 : mPuScore = 98; break;
            }
            if(puInt>=31) mPuScore = 100;

        }else if(ageInt >= 57 && ageInt <= 61){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 54; break;
                case 6 : mPuScore = 56; break;
                case 7 : mPuScore = 58; break;
                case 8 : mPuScore = 60; break;
                case 9 : mPuScore = 62; break;
                case 10 : mPuScore = 64; break;

                case 11 : mPuScore = 66; break;
                case 12 : mPuScore = 68; break;
                case 13 : mPuScore = 70; break;
                case 14 : mPuScore = 72; break;
                case 15 : mPuScore = 74; break;
                case 16 : mPuScore = 76; break;
                case 17 : mPuScore = 78; break;
                case 18 : mPuScore = 80; break;
                case 19 : mPuScore = 82; break;
                case 20 : mPuScore = 84; break;

                case 21 : mPuScore = 86; break;
                case 22 : mPuScore = 88; break;
                case 23 : mPuScore = 90; break;
                case 24 : mPuScore = 92; break;
                case 25 : mPuScore = 94; break;
                case 26 : mPuScore = 96; break;
                case 27 : mPuScore = 98; break;
            }
            if(puInt>=28) mPuScore = 100;

        }else if(ageInt >= 62){
            if(puInt>=0 && puInt<=4) mPuScore = 0;
            switch (puInt){
                case 5 : mPuScore = 56; break;
                case 6 : mPuScore = 58; break;
                case 7 : mPuScore = 60; break;
                case 8 : mPuScore = 62; break;
                case 9 : mPuScore = 64; break;
                case 10 : mPuScore = 67; break;

                case 11 : mPuScore = 69; break;
                case 12 : mPuScore = 71; break;
                case 13 : mPuScore = 73; break;
                case 14 : mPuScore = 76; break;
                case 15 : mPuScore = 78; break;
                case 16 : mPuScore = 80; break;
                case 17 : mPuScore = 82; break;
                case 18 : mPuScore = 84; break;
                case 19 : mPuScore = 87; break;
                case 20 : mPuScore = 89; break;

                case 21 : mPuScore = 91; break;
                case 22 : mPuScore = 93; break;
                case 23 : mPuScore = 96; break;
                case 24 : mPuScore = 98; break;
                case 25 : mPuScore = 100; break;
            }
            if(puInt>=25) mPuScore = 100;
        }else{
            Toast.makeText( this, "Invalid Push-up Count", Toast.LENGTH_LONG ).show();
        }
        return mPuScore;
    }
}
