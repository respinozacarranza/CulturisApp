package culturis.com.pe.culturis.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import culturis.com.pe.culturis.R;

/**
 * Created by Renato on 10/16/2015.
 */
public class MainFragment extends Fragment{

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    public MainFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);

        return view;
    }
}
