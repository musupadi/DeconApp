package com.destiny.deconapp.ui.request;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.destiny.deconapp.Model.NumberTextWatcher;
import com.destiny.deconapp.R;

public class RequestFragment extends Fragment {
    EditText fitur,deadline,budget,kurs;
    Button submit;
    Spinner platform;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_request, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fitur = view.findViewById(R.id.etFitur);
        deadline = view.findViewById(R.id.etDeadline);
        budget = view.findViewById(R.id.etBudget);
        platform = view.findViewById(R.id.spinnerPlatform);
        kurs = view.findViewById(R.id.etKurs);

        budget.addTextChangedListener(new NumberTextWatcher(budget));
        //String url = "https://api.whatsapp.com/send?phone=+6281290248899";
        submit=view.findViewById(R.id.btnPesan);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://api.whatsapp.com/send?phone=6281290248899&text=Platform%20%3A%20"+platform.getSelectedItem().toString()+"%0A" +
                                "Deadline%20%3A%20"+deadline.getText().toString()+"" +
                                "%0ABudget%20%3A%20"+kurs.getText().toString()+"."+budget.getText().toString()+"%0A"+
                                "Fitur%20Aplikasi%20%3A%20%0A"+fitur.getText().toString()
                        ));
                startActivity(i);
            }
        });
    }
}