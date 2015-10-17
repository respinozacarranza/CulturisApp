package culturis.com.pe.culturis.fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import culturis.com.pe.culturis.R;

/**
 * Created by Renato on 10/16/2015.
 */
public class CulturalFragment extends Fragment{


    public CulturalFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       return inflater.inflate(R.layout.fragment_cultural,container,false);


    }
}
