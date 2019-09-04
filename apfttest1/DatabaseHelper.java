package dj.apps.apfttest1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "mylist.db";
    public static final String TABLE_NAME = "mylist_data";
    public static final String COL2 = "PU";
    public static final String COL3 = "SU";
    public static final String COL4 = "RU";


    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, PU INTEGER NOT NULL, SU INTEGER NOT NULL, RU INTEGER NOT NULL, T TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
        db.execSQL( createTable );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME );
    }

    public boolean addData(int pScore, int sScore, int rScore){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put( COL2, pScore );
        contentValues.put( COL3, sScore );
        contentValues.put( COL4, rScore );

        ListVO listVO = new ListVO();
        listVO.setPuScore( pScore );
        listVO.setPuScore( sScore );
        listVO.setPuScore( rScore );

        long result = db.insert( TABLE_NAME, null, contentValues );

        if(result == -1){
            return false;
        }else{
            return true;
        }
    }
    public Cursor getListContents(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery( "SELECT * FROM " + TABLE_NAME + " ORDER BY ID", null );
        return data;
    }

    public void deleteContents(int index){
        SQLiteDatabase db = getWritableDatabase();
        String indexStr = Integer.toString( index );
        db.execSQL( "DELETE FROM "+TABLE_NAME+" WHERE ID = "+ indexStr);
    }
}
