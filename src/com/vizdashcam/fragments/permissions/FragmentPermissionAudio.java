package com.vizdashcam.fragments.permissions;

import android.Manifest;

import com.vizdashcam.R;
import com.vizdashcam.fragments.FragmentPermissionBase;

public class FragmentPermissionAudio extends FragmentPermissionBase {

    @Override
    public int getImageResource() {
        return R.drawable.ic_permission_audio;
    }

    @Override
    public int getTextResource() {
        return R.string.permission_explanation_audio_new;
    }

    @Override
    public String getPermission() {
        return Manifest.permission.RECORD_AUDIO;
    }
}
