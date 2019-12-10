package com.destiny.deconapp.ui.request;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.destiny.deconapp.R;

public class RequestFragment extends Fragment {
    EditText fitur,deadline;
    Button submit;
    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_request, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fitur = view.findViewById(R.id.etFitur);
        deadline = view.findViewById(R.id.etDeadline);
        final String url="https://api.whatsapp.com/send?phone=6281290248899&text=Fitur%20Aplikasi:"+fitur.getText().toString()+"%20%3A %20%0ADeadline:"+fitur.getText().toString()+"%20%3A%20%0ABudget%0A";
        //String url = "https://api.whatsapp.com/send?phone=+6281290248899";
        submit=view.findViewById(R.id.btnPesan);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}