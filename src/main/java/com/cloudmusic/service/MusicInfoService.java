package com.cloudmusic.service;

import com.cloudmusic.request.MusicInfoQuery;
import com.cloudmusic.response.MusicInfoList;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by taoye on 2020/5/11.
 */
public interface MusicInfoService {

    PageInfo<MusicInfoList> query(MusicInfoQuery musicInfoQuery);
}
