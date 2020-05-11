package com.cloudmusic.service.impl;

import com.cloudmusic.mapper.MusicInfoMapper;
import com.cloudmusic.request.MusicInfoQuery;
import com.cloudmusic.response.MusicInfoList;
import com.cloudmusic.service.MusicInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by taoye on 2020/5/11.
 */
@Service
public class MusicInfoServiceImpl implements MusicInfoService{

    @Autowired
    MusicInfoMapper musicInfoMapper;

    @Override
    public PageInfo<MusicInfoList> query(MusicInfoQuery musicInfoQuery) {
        PageHelper.startPage(musicInfoQuery.getPageNum() , musicInfoQuery.getPageSize());
        List<MusicInfoList> musicInfoListList =  musicInfoMapper.query(musicInfoQuery);
        return new PageInfo<>(musicInfoListList);
    }
}
