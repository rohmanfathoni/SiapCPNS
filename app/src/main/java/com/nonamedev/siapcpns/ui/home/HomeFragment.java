package com.nonamedev.siapcpns.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.nonamedev.siapcpns.R;
import com.nonamedev.siapcpns.ui.tahapan.TahapanFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageButton btnTahapanActivity = (ImageButton) root.findViewById(R.id.imageButton1);
        btnTahapanActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment= new TahapanFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.drawer_layout, fragment); // fragmen container id in first parameter is the  container(Main layout id) of Activity
                transaction.commit();
            }
        });
        ImageButton btn1 = (ImageButton) root.findViewById(R.id.imageButton1);
        ImageButton btn2 = (ImageButton) root.findViewById(R.id.imageButton2);
        ImageButton btn3 = (ImageButton) root.findViewById(R.id.imageButton3);
        ImageButton btn4 = (ImageButton) root.findViewById(R.id.imageButton4);
        ImageButton btn5 = (ImageButton) root.findViewById(R.id.imageButton5);
        ImageButton btn6 = (ImageButton) root.findViewById(R.id.imageButton6);
        btn1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tahapan, null));
        btn2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_pengumuman, null));
        btn3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_alur, null));
        btn4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_ambangbatas, null));
        btn5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_faq, null));
        btn6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tips, null));
        return root;
    }

}
