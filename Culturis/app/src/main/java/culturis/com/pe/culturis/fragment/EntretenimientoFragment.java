package culturis.com.pe.culturis.fragment;

import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import culturis.com.pe.culturis.R;


/**
 * Created by Renato on 10/16/2015.
 */
public class EntretenimientoFragment extends Fragment{



    public EntretenimientoFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_entretenimiento,container,false);
    }
}
