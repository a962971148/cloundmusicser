package com.cloudmusic.controller;
import com.cloudmusic.constants.ResponseEntity;
import com.cloudmusic.request.MusicInfoQuery;
import com.cloudmusic.response.MusicInfoList;
import com.cloudmusic.service.MusicInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by taoye on 2020/5/9.
 */
@RestController
@RequestMapping("/api/music_info")
public class MusicInfoController {

    @Autowired
    MusicInfoService musicInfoService;

    @PostMapping("get_musisc_list")
    public ResponseEntity getMusiscList(@RequestBody MusicInfoQuery musicInfoQuery){
        PageInfo<MusicInfoList> musicInfoListPageInfo = musicInfoService.query(musicInfoQuery);
        return ResponseEntity.succeed(musicInfoListPageInfo);
    }
}
