package com.cloudmusic.mapper;

import com.cloudmusic.entity.MusicInfo;

public interface MusicInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MusicInfo record);

    int insertSelective(MusicInfo record);

    MusicInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MusicInfo record);

    int updateByPrimaryKey(MusicInfo record);
}