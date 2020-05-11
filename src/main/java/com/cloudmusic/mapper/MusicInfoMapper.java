package com.cloudmusic.mapper;

import com.cloudmusic.entity.MusicInfo;
import com.cloudmusic.request.MusicInfoQuery;
import com.cloudmusic.response.MusicInfoList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MusicInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MusicInfo record);

    int insertSelective(MusicInfo record);

    MusicInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MusicInfo record);

    int updateByPrimaryKey(MusicInfo record);

    List<MusicInfoList> query(@Param("data") MusicInfoQuery musicInfoQuery);
}