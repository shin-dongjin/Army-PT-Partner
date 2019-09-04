package dj.apps.apfttest1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
//import android.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResultViewFragment extends Fragment {
    TextView score_fragment, error_fragment;
    public ResultViewFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate( R.layout.fragment_cal, container, false );
        score_fragment = (TextView)view.findViewById( R.id.score_fragment );
        return view;
    }

    public void changeFragmentTextView(String text){
        score_fragment.setText( text );
    }

}
