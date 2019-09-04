package dj.apps.apfttest1;

import android.support.v7.app.AppCompatActivity;

public class SitUpCal extends AppCompatActivity {

    public int sitUpCal(int ageInt, int puInt) {
        int suScore = -1;
        if(ageInt >= 17 && ageInt <= 21){
            if(puInt <= 21){suScore = 3;}
            switch (puInt){
                case 22: suScore = 10; break;
                case 23: suScore = 12; break;
                case 24: suScore = 14; break;
                case 25: suScore = 15; break;
                case 26: suScore = 17; break;
                case 27: suScore = 18; break;
                case 28: suScore = 20; break;
                case 29: suScore = 22; break;
                case 30: suScore = 23; break;

                case 31: suScore = 25; break;
                case 32: suScore = 26; break;
                case 33: suScore = 28; break;
                case 34: suScore = 30; break;
                case 35: suScore = 31; break;
                case 36: suScore = 33; break;
                case 37: suScore = 34; break;
                case 38: suScore = 36; break;
                case 39: suScore = 38; break;
                case 40: suScore = 39; break;

                case 41: suScore = 41; break;
                case 42: suScore = 42; break;
                case 43: suScore = 44; break;
                case 44: suScore = 46; break;
                case 45: suScore = 47; break;
                case 46: suScore = 49; break;
                case 47: suScore = 50; break;
                case 48: suScore = 52; break;
                case 49: suScore = 54; break;
                case 50: suScore = 55; break;

                case 51: suScore = 57; break;
                case 52: suScore = 58; break;
                case 53: suScore = 60; break;
                case 54: suScore = 62; break;
                case 55: suScore = 63; break;
                case 56: suScore = 65; break;
                case 57: suScore = 66; break;
                case 58: suScore = 68; break;
                case 59: suScore = 70; break;
                case 60: suScore = 71; break;

                case 61: suScore = 73; break;
                case 62: suScore = 74; break;
                case 63: suScore = 76; break;
                case 64: suScore = 78; break;
                case 65: suScore = 79; break;
                case 66: suScore = 81; break;
                case 67: suScore = 82; break;
                case 68: suScore = 84; break;
                case 69: suScore = 86; break;
                case 70: suScore = 87; break;

                case 71: suScore = 89; break;
                case 72: suScore = 90; break;
                case 73: suScore = 92; break;
                case 74: suScore = 94; break;
                case 75: suScore = 95; break;
                case 76: suScore = 97; break;
                case 77: suScore = 98; break;
            }
            if(puInt >= 78){suScore = 100;}
        }else if(ageInt >= 22 && ageInt <= 26){
            if(puInt <= 21){suScore = 21;}
            switch (puInt){
                case 22: suScore = 23; break;
                case 23: suScore = 24; break;
                case 24: suScore = 25; break;
                case 25: suScore = 27; break;
                case 26: suScore = 28; break;
                case 27: suScore = 29; break;
                case 28: suScore = 31; break;
                case 29: suScore = 32; break;
                case 30: suScore = 33; break;

                case 31: suScore = 35; break;
                case 32: suScore = 36; break;
                case 33: suScore = 37; break;
                case 34: suScore = 39; break;
                case 35: suScore = 40; break;
                case 36: suScore = 41; break;
                case 37: suScore = 43; break;
                case 38: suScore = 44; break;
                case 39: suScore = 45; break;
                case 40: suScore = 47; break;

                case 41: suScore = 48; break;
                case 42: suScore = 49; break;
                case 43: suScore = 50; break;
                case 44: suScore = 52; break;
                case 45: suScore = 53; break;
                case 46: suScore = 55; break;
                case 47: suScore = 56; break;
                case 48: suScore = 57; break;
                case 49: suScore = 59; break;
                case 50: suScore = 60; break;

                case 51: suScore = 61; break;
                case 52: suScore = 63; break;
                case 53: suScore = 64; break;
                case 54: suScore = 65; break;
                case 55: suScore = 67; break;
                case 56: suScore = 68; break;
                case 57: suScore = 69; break;
                case 58: suScore = 71; break;
                case 59: suScore = 72; break;
                case 60: suScore = 73; break;

                case 61: suScore = 75; break;
                case 62: suScore = 76; break;
                case 63: suScore = 77; break;
                case 64: suScore = 79; break;
                case 65: suScore = 80; break;
                case 66: suScore = 81; break;
                case 67: suScore = 83; break;
                case 68: suScore = 84; break;
                case 69: suScore = 85; break;
                case 70: suScore = 87; break;

                case 71: suScore = 88; break;
                case 72: suScore = 89; break;
                case 73: suScore = 91; break;
                case 74: suScore = 92; break;
                case 75: suScore = 93; break;
                case 76: suScore = 95; break;
                case 77: suScore = 96; break;
                case 78: suScore = 97; break;
                case 79: suScore = 99; break;
            }
            if(puInt >= 80){suScore = 100;}
        }else if(ageInt >= 27 && ageInt <= 31){
            if(puInt <= 21){suScore = 34;}
            switch (puInt){
                case 22: suScore = 35; break;
                case 23: suScore = 36; break;
                case 24: suScore = 37; break;
                case 25: suScore = 38; break;
                case 26: suScore = 39; break;
                case 27: suScore = 41; break;
                case 28: suScore = 42; break;
                case 29: suScore = 43; break;
                case 30: suScore = 44; break;

                case 31: suScore = 45; break;
                case 32: suScore = 46; break;
                case 33: suScore = 47; break;
                case 34: suScore = 48; break;
                case 35: suScore = 49; break;
                case 36: suScore = 50; break;
                case 37: suScore = 51; break;
                case 38: suScore = 52; break;
                case 39: suScore = 54; break;
                case 40: suScore = 55; break;

                case 41: suScore = 56; break;
                case 42: suScore = 57; break;
                case 43: suScore = 58; break;
                case 44: suScore = 59; break;
                case 45: suScore = 60; break;
                case 46: suScore = 61; break;
                case 47: suScore = 62; break;
                case 48: suScore = 63; break;
                case 49: suScore = 64; break;
                case 50: suScore = 65; break;

                case 51: suScore = 66; break;
                case 52: suScore = 68; break;
                case 53: suScore = 69; break;
                case 54: suScore = 70; break;
                case 55: suScore = 71; break;
                case 56: suScore = 72; break;
                case 57: suScore = 73; break;
                case 58: suScore = 74; break;
                case 59: suScore = 75; break;
                case 60: suScore = 76; break;

                case 61: suScore = 77; break;
                case 62: suScore = 78; break;
                case 63: suScore = 79; break;
                case 64: suScore = 81; break;
                case 65: suScore = 82; break;
                case 66: suScore = 83; break;
                case 67: suScore = 84; break;
                case 68: suScore = 85; break;
                case 69: suScore = 86; break;
                case 70: suScore = 87; break;

                case 71: suScore = 88; break;
                case 72: suScore = 89; break;
                case 73: suScore = 90; break;
                case 74: suScore = 91; break;
                case 75: suScore = 92; break;
                case 76: suScore = 94; break;
                case 77: suScore = 95; break;
                case 78: suScore = 96; break;
                case 79: suScore = 97; break;
                case 80: suScore = 98; break;

                case 81: suScore = 99; break;
                case 82: suScore = 100; break;
            }
            if(puInt >= 82){suScore = 100;}
        }else if(ageInt >= 32 && ageInt <= 36){
            if(puInt <= 21){suScore = 35;}
            switch (puInt){
                case 22: suScore = 36; break;
                case 23: suScore = 38; break;
                case 24: suScore = 39; break;
                case 25: suScore = 40; break;
                case 26: suScore = 41; break;
                case 27: suScore = 42; break;
                case 28: suScore = 44; break;
                case 29: suScore = 45; break;
                case 30: suScore = 46; break;

                case 31: suScore = 47; break;
                case 32: suScore = 48; break;
                case 33: suScore = 49; break;
                case 34: suScore = 50; break;
                case 35: suScore = 52; break;
                case 36: suScore = 53; break;
                case 37: suScore = 54; break;
                case 38: suScore = 55; break;
                case 39: suScore = 56; break;
                case 40: suScore = 58; break;

                case 41: suScore = 59; break;
                case 42: suScore = 60; break;
                case 43: suScore = 61; break;
                case 44: suScore = 62; break;
                case 45: suScore = 64; break;
                case 46: suScore = 65; break;
                case 47: suScore = 66; break;
                case 48: suScore = 67; break;
                case 49: suScore = 68; break;
                case 50: suScore = 69; break;

                case 51: suScore = 71; break;
                case 52: suScore = 72; break;
                case 53: suScore = 73; break;
                case 54: suScore = 74; break;
                case 55: suScore = 75; break;
                case 56: suScore = 76; break;
                case 57: suScore = 78; break;
                case 58: suScore = 79; break;
                case 59: suScore = 80; break;
                case 60: suScore = 81; break;

                case 61: suScore = 82; break;
                case 62: suScore = 84; break;
                case 63: suScore = 85; break;
                case 64: suScore = 86; break;
                case 65: suScore = 87; break;
                case 66: suScore = 88; break;
                case 67: suScore = 89; break;
                case 68: suScore = 91; break;
                case 69: suScore = 92; break;
                case 70: suScore = 93; break;

                case 71: suScore = 94; break;
                case 72: suScore = 95; break;
                case 73: suScore = 96; break;
                case 74: suScore = 98; break;
                case 75: suScore = 99; break;
            }
            if(puInt >= 76){suScore = 100;}
        }else if(ageInt >= 37 && ageInt <= 41){
            if(puInt <= 21){suScore = 42;}
            switch (puInt){
                case 22: suScore = 43; break;
                case 23: suScore = 44; break;
                case 24: suScore = 45; break;
                case 25: suScore = 46; break;
                case 26: suScore = 47; break;
                case 27: suScore = 48; break;
                case 28: suScore = 49; break;
                case 29: suScore = 50; break;
                case 30: suScore = 52; break;

                case 31: suScore = 53; break;
                case 32: suScore = 54; break;
                case 33: suScore = 55; break;
                case 34: suScore = 56; break;
                case 35: suScore = 57; break;
                case 36: suScore = 58; break;
                case 37: suScore = 59; break;
                case 38: suScore = 60; break;
                case 39: suScore = 61; break;
                case 40: suScore = 62; break;

                case 41: suScore = 63; break;
                case 42: suScore = 64; break;
                case 43: suScore = 65; break;
                case 44: suScore = 66; break;
                case 45: suScore = 67; break;
                case 46: suScore = 68; break;
                case 47: suScore = 69; break;
                case 48: suScore = 71; break;
                case 49: suScore = 72; break;
                case 50: suScore = 73; break;

                case 51: suScore = 74; break;
                case 52: suScore = 75; break;
                case 53: suScore = 76; break;
                case 54: suScore = 77; break;
                case 55: suScore = 78; break;
                case 56: suScore = 79; break;
                case 57: suScore = 80; break;
                case 58: suScore = 81; break;
                case 59: suScore = 82; break;
                case 60: suScore = 83; break;

                case 61: suScore = 84; break;
                case 62: suScore = 85; break;
                case 63: suScore = 86; break;
                case 64: suScore = 87; break;
                case 65: suScore = 88; break;
                case 66: suScore = 89; break;
                case 67: suScore = 91; break;
                case 68: suScore = 92; break;
                case 69: suScore = 93; break;
                case 70: suScore = 94; break;

                case 71: suScore = 95; break;
                case 72: suScore = 96; break;
                case 73: suScore = 97; break;
                case 74: suScore = 98; break;
                case 75: suScore = 99; break;
            }
            if(puInt >= 76){suScore = 100;}
        }else if(ageInt >= 42 && ageInt <= 46){
            if(puInt <= 21){suScore = 49;}
            switch (puInt){
                case 22: suScore = 50; break;
                case 23: suScore = 51; break;
                case 24: suScore = 52; break;
                case 25: suScore = 53; break;
                case 26: suScore = 54; break;
                case 27: suScore = 55; break;
                case 28: suScore = 56; break;
                case 29: suScore = 57; break;
                case 30: suScore = 58; break;

                case 31: suScore = 59; break;
                case 32: suScore = 60; break;
                case 33: suScore = 61; break;
                case 34: suScore = 62; break;
                case 35: suScore = 63; break;
                case 36: suScore = 64; break;
                case 37: suScore = 65; break;
                case 38: suScore = 66; break;
                case 39: suScore = 67; break;
                case 40: suScore = 68; break;

                case 41: suScore = 69; break;
                case 42: suScore = 70; break;
                case 43: suScore = 71; break;
                case 44: suScore = 72; break;
                case 45: suScore = 73; break;
                case 46: suScore = 74; break;
                case 47: suScore = 75; break;
                case 48: suScore = 76; break;
                case 49: suScore = 77; break;
                case 50: suScore = 78; break;

                case 51: suScore = 79; break;
                case 52: suScore = 80; break;
                case 53: suScore = 81; break;
                case 54: suScore = 82; break;
                case 55: suScore = 83; break;
                case 56: suScore = 84; break;
                case 57: suScore = 85; break;
                case 58: suScore = 86; break;
                case 59: suScore = 87; break;
                case 60: suScore = 88; break;

                case 61: suScore = 89; break;
                case 62: suScore = 90; break;
                case 63: suScore = 91; break;
                case 64: suScore = 92; break;
                case 65: suScore = 93; break;
                case 66: suScore = 94; break;
                case 67: suScore = 95; break;
                case 68: suScore = 96; break;
                case 69: suScore = 97; break;
                case 70: suScore = 98; break;

                case 71: suScore = 99; break;
            }
            if(puInt >= 72){suScore = 100;}
        }else if(ageInt >= 47 && ageInt <= 51){
            if(puInt <= 21){suScore = 50;}
            switch (puInt){
                case 22: suScore = 51; break;
                case 23: suScore = 52; break;
                case 24: suScore = 53; break;
                case 25: suScore = 54; break;
                case 26: suScore = 56; break;
                case 27: suScore = 57; break;
                case 28: suScore = 58; break;
                case 29: suScore = 59; break;
                case 30: suScore = 60; break;

                case 31: suScore = 61; break;
                case 32: suScore = 62; break;
                case 33: suScore = 63; break;
                case 34: suScore = 64; break;
                case 35: suScore = 66; break;
                case 36: suScore = 67; break;
                case 37: suScore = 68; break;
                case 38: suScore = 69; break;
                case 39: suScore = 70; break;
                case 40: suScore = 71; break;

                case 41: suScore = 72; break;
                case 42: suScore = 73; break;
                case 43: suScore = 74; break;
                case 44: suScore = 76; break;
                case 45: suScore = 77; break;
                case 46: suScore = 78; break;
                case 47: suScore = 79; break;
                case 48: suScore = 80; break;
                case 49: suScore = 81; break;
                case 50: suScore = 82; break;

                case 51: suScore = 83; break;
                case 52: suScore = 84; break;
                case 53: suScore = 86; break;
                case 54: suScore = 87; break;
                case 55: suScore = 88; break;
                case 56: suScore = 89; break;
                case 57: suScore = 90; break;
                case 58: suScore = 91; break;
                case 59: suScore = 92; break;
                case 60: suScore = 93; break;

                case 61: suScore = 94; break;
                case 62: suScore = 96; break;
                case 63: suScore = 97; break;
                case 64: suScore = 98; break;
                case 65: suScore = 99; break;
            }
            if(puInt >= 66){suScore = 100;}
        }else if(ageInt >= 52 && ageInt <= 56){
            if(puInt <= 21){suScore = 53;}
            switch (puInt){
                case 22: suScore = 54; break;
                case 23: suScore = 55; break;
                case 24: suScore = 56; break;
                case 25: suScore = 57; break;
                case 26: suScore = 58; break;
                case 27: suScore = 59; break;
                case 28: suScore = 60; break;
                case 29: suScore = 61; break;
                case 30: suScore = 62; break;

                case 31: suScore = 63; break;
                case 32: suScore = 64; break;
                case 33: suScore = 65; break;
                case 34: suScore = 66; break;
                case 35: suScore = 67; break;
                case 36: suScore = 68; break;
                case 37: suScore = 69; break;
                case 38: suScore = 71; break;
                case 39: suScore = 72; break;
                case 40: suScore = 73; break;

                case 41: suScore = 74; break;
                case 42: suScore = 75; break;
                case 43: suScore = 76; break;
                case 44: suScore = 77; break;
                case 45: suScore = 78; break;
                case 46: suScore = 79; break;
                case 47: suScore = 80; break;
                case 48: suScore = 81; break;
                case 49: suScore = 82; break;
                case 50: suScore = 83; break;

                case 51: suScore = 84; break;
                case 52: suScore = 85; break;
                case 53: suScore = 86; break;
                case 54: suScore = 87; break;
                case 55: suScore = 88; break;
                case 56: suScore = 89; break;
                case 57: suScore = 91; break;
                case 58: suScore = 92; break;
                case 59: suScore = 93; break;
                case 60: suScore = 94; break;

                case 61: suScore = 95; break;
                case 62: suScore = 96; break;
                case 63: suScore = 97; break;
                case 64: suScore = 98; break;
                case 65: suScore = 99; break;
            }
            if(puInt >= 66){suScore = 100;}
        }else if(ageInt >= 57 && ageInt <= 61){
            if(puInt <= 21){suScore = 54;}
            switch (puInt){
                case 22: suScore = 55; break;
                case 23: suScore = 56; break;
                case 24: suScore = 57; break;
                case 25: suScore = 58; break;
                case 26: suScore = 59; break;
                case 27: suScore = 60; break;
                case 28: suScore = 61; break;
                case 29: suScore = 62; break;
                case 30: suScore = 63; break;

                case 31: suScore = 64; break;
                case 32: suScore = 65; break;
                case 33: suScore = 66; break;
                case 34: suScore = 68; break;
                case 35: suScore = 69; break;
                case 36: suScore = 70; break;
                case 37: suScore = 71; break;
                case 38: suScore = 72; break;
                case 39: suScore = 73; break;
                case 40: suScore = 74; break;

                case 41: suScore = 75; break;
                case 42: suScore = 76; break;
                case 43: suScore = 77; break;
                case 44: suScore = 78; break;
                case 45: suScore = 79; break;
                case 46: suScore = 81; break;
                case 47: suScore = 82; break;
                case 48: suScore = 83; break;
                case 49: suScore = 84; break;
                case 50: suScore = 85; break;

                case 51: suScore = 86; break;
                case 52: suScore = 87; break;
                case 53: suScore = 88; break;
                case 54: suScore = 89; break;
                case 55: suScore = 90; break;
                case 56: suScore = 91; break;
                case 57: suScore = 92; break;
                case 58: suScore = 94; break;
                case 59: suScore = 95; break;
                case 60: suScore = 96; break;

                case 61: suScore = 97; break;
                case 62: suScore = 98; break;
                case 63: suScore = 99; break;
            }
            if(puInt >= 64){suScore = 100;}
        }else if(ageInt >= 52 && ageInt <= 56){
            if(puInt <= 21){suScore = 53;}
            switch (puInt){
                case 22: suScore = 54; break;
                case 23: suScore = 55; break;
                case 24: suScore = 56; break;
                case 25: suScore = 57; break;
                case 26: suScore = 58; break;
                case 27: suScore = 59; break;
                case 28: suScore = 60; break;
                case 29: suScore = 61; break;
                case 30: suScore = 62; break;

                case 31: suScore = 63; break;
                case 32: suScore = 64; break;
                case 33: suScore = 65; break;
                case 34: suScore = 66; break;
                case 35: suScore = 67; break;
                case 36: suScore = 68; break;
                case 37: suScore = 69; break;
                case 38: suScore = 71; break;
                case 39: suScore = 72; break;
                case 40: suScore = 73; break;

                case 41: suScore = 74; break;
                case 42: suScore = 75; break;
                case 43: suScore = 76; break;
                case 44: suScore = 77; break;
                case 45: suScore = 78; break;
                case 46: suScore = 79; break;
                case 47: suScore = 80; break;
                case 48: suScore = 81; break;
                case 49: suScore = 82; break;
                case 50: suScore = 83; break;

                case 51: suScore = 84; break;
                case 52: suScore = 85; break;
                case 53: suScore = 86; break;
                case 54: suScore = 87; break;
                case 55: suScore = 88; break;
                case 56: suScore = 89; break;
                case 57: suScore = 91; break;
                case 58: suScore = 92; break;
                case 59: suScore = 93; break;
                case 60: suScore = 94; break;

                case 61: suScore = 95; break;
                case 62: suScore = 96; break;
                case 63: suScore = 97; break;
                case 64: suScore = 98; break;
                case 65: suScore = 99; break;
            }
            if(puInt >= 66){suScore = 100;}
        }else if(ageInt >= 62){
            if(puInt <= 21){suScore = 55;}
            switch (puInt){
                case 22: suScore = 56; break;
                case 23: suScore = 57; break;
                case 24: suScore = 58; break;
                case 25: suScore = 59; break;
                case 26: suScore = 60; break;
                case 27: suScore = 61; break;
                case 28: suScore = 62; break;
                case 29: suScore = 63; break;
                case 30: suScore = 64; break;

                case 31: suScore = 65; break;
                case 32: suScore = 66; break;
                case 33: suScore = 68; break;
                case 34: suScore = 69; break;
                case 35: suScore = 70; break;
                case 36: suScore = 71; break;
                case 37: suScore = 72; break;
                case 38: suScore = 73; break;
                case 39: suScore = 74; break;
                case 40: suScore = 75; break;

                case 41: suScore = 76; break;
                case 42: suScore = 77; break;
                case 43: suScore = 78; break;
                case 44: suScore = 79; break;
                case 45: suScore = 81; break;
                case 46: suScore = 82; break;
                case 47: suScore = 83; break;
                case 48: suScore = 84; break;
                case 49: suScore = 85; break;
                case 50: suScore = 86; break;

                case 51: suScore = 87; break;
                case 52: suScore = 88; break;
                case 53: suScore = 89; break;
                case 54: suScore = 90; break;
                case 55: suScore = 91; break;
                case 56: suScore = 92; break;
                case 57: suScore = 94; break;
                case 58: suScore = 95; break;
                case 59: suScore = 96; break;
                case 60: suScore = 97; break;

                case 61: suScore = 98; break;
                case 62: suScore = 99; break;
            }
            if(puInt >= 63){suScore = 100;}
        }
        return suScore;
    }
}
