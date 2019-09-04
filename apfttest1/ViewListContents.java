package dj.apps.apfttest1;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class ViewListContents extends AppCompatActivity{

    static DatabaseHelper myDB;
    private ListViewAdapter adapter = new ListViewAdapter();
    static private ListView listview;
    private ImageButton menubtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.viewcontents_layout );
        myDB = new DatabaseHelper( this );

        Cursor data = myDB.getListContents();

        listview = (ListView) findViewById( R.id.listview );
        listview.setAdapter( adapter );
        boolean flag = data.moveToNext( );

        data.moveToPosition(-1);
        if(flag == false){
            Toast.makeText( ViewListContents.this, "No Record Found", Toast.LENGTH_LONG ).show();
        }else{
            while(data.moveToNext()){
                int index = data.getInt( 0 );
                int pScore = data.getInt( 1 );
                int sScore = data.getInt( 2 );
                int rScore = data.getInt( 3 );

                adapter.addVO( index, pScore, sScore, rScore );
            }
        }
        menubtn = (ImageButton)findViewById( R.id.button_menu );
        menubtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        } );
    }
    public void getDelIndex(int index){
        if(myDB==null){
            myDB = new DatabaseHelper( this );
        }
        myDB.deleteContents(index);
        listview.invalidateViews();
    }

}
