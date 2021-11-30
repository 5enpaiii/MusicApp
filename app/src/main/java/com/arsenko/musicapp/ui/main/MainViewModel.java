package com.arsenko.musicapp.ui.main;

import static com.arsenko.musicapp.utills.MusicUtil.getJsonFromAsset;
import static com.arsenko.musicapp.utills.MusicUtil.getMusicDtoFromJson;

import android.app.Activity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.arsenko.musicapp.model.MusicItemDto;

public class MainViewModel extends ViewModel {

    private final String FILE_NAME = "response.json";

    private final MutableLiveData<MusicItemDto> musicItemsDto = new MutableLiveData<>();

    public void loadMusicRequest(Activity activity) {
        musicItemsDto.setValue(getMusicDtoFromJson(getJsonFromAsset(activity, FILE_NAME)));
    }

    public MutableLiveData<MusicItemDto> getMusicItemsDto() {
        return musicItemsDto;
    }
}