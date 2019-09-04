package dj.apps.apfttest1;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.text.Layout;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.PipedOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ListViewAdapter extends BaseAdapter {
    int layout;
    private ArrayList<ListVO> listVO = new ArrayList<ListVO>() ;

    public ListViewAdapter() {}

    @Override
    public int getCount() {
        Log.i( "listVO.size", "listVO.size(): "+listVO.size() );
        return listVO.size() ;
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public Object getItem(int position) {
        return listVO.get(position) ;
    }

    // ** 이 부분에서 리스트뷰에 데이터를 넣어줌 **
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            final Context context = parent.getContext();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_listview, parent, false);
        }
        ImageButton btnDel = (ImageButton)convertView.findViewById( R.id.button_delete );

        TextView index = (TextView) convertView.findViewById( R.id.index );
        TextView currentDate = (TextView) convertView.findViewById(R.id.date) ;
        TextView puScore = (TextView) convertView.findViewById(R.id.pushup) ;
        TextView suScore = (TextView) convertView.findViewById(R.id.situp) ;
        TextView ruScore = (TextView) convertView.findViewById(R.id.run) ;

        ListVO listViewItem = listVO.get(position);

        // To show the data on each widget
        String currentDateString = DateFormat.getDateInstance().format(new Date());

        index.setText(String.valueOf( listViewItem.getIndex() ));
        currentDate.setText(currentDateString);
        puScore.setText(String.valueOf( listViewItem.getPuScore() ));
        suScore.setText(String.valueOf( listViewItem.getSuScore() ));
        ruScore.setText(String.valueOf( listViewItem.getRuScore() ));

        final int i = listViewItem.getIndex();
        //To delete the row
        btnDel.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewListContents vlc = new ViewListContents();
                vlc.getDelIndex(i);
                listVO.remove( position );
                }
        } );

        return convertView;
    }

    // 데이터값 넣어줌
    public void addVO(int index, int puScore, int suScore, int ruScore) {
        ListVO item = new ListVO();

        item.setIndex(index);
        item.setPuScore(puScore);
        item.setSuScore(suScore);
        item.setRuScore(ruScore);

        listVO.add(item);
    }
}
