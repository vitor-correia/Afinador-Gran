package com.twobrotherscompany.afinadorparaviolao;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;

import androidx.fragment.app.Fragment;

public class AfinadorFragment extends Fragment {

    private MediaPlayer mediaPlayer;
    private Switch switchRepeticao;
    private Button buttonRe, buttonLa, buttonMi, buttonSol, buttonSi, buttonMizinha;

    public AfinadorFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_afinador, container, false);

        switchRepeticao = view.findViewById(R.id.switchRepeticao);

        buttonRe = view.findViewById(R.id.buttonRe);
        buttonRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.somcordare);
                if (switchRepeticao.isChecked()) {
                    mediaPlayer.setLooping(true);
                }
                mediaPlayer.start();

            }
        });

        buttonLa = view.findViewById(R.id.buttonLa);
        buttonLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.somcordala);
                if (switchRepeticao.isChecked()) {
                    mediaPlayer.setLooping(true);
                }
                mediaPlayer.start();
            }
        });

        buttonMi = view.findViewById(R.id.buttonMi);
        buttonMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.somcordami);
                if (switchRepeticao.isChecked()) {
                    mediaPlayer.setLooping(true);
                }
                mediaPlayer.start();
            }
        });

        buttonSol = view.findViewById(R.id.buttonSol);
        buttonSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.somcordasol);
                if (switchRepeticao.isChecked()) {
                    mediaPlayer.setLooping(true);
                }
                mediaPlayer.start();
            }
        });

        buttonSi = view.findViewById(R.id.buttonSi);
        buttonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.somcordasi);
                if (switchRepeticao.isChecked()) {
                    mediaPlayer.setLooping(true);
                }
                mediaPlayer.start();
            }
        });

        buttonMizinha = view.findViewById(R.id.buttonMizinha);
        buttonMizinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.somcordamizinha);
                if (switchRepeticao.isChecked()) {
                    mediaPlayer.setLooping(true);
                }
                mediaPlayer.start();
            }
        });

        switchRepeticao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
            }
        });

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
        if ( mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if ( mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
    }
}