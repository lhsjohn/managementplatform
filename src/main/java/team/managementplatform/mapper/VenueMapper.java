package team.managementplatform.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.managementplatform.pojo.Venue;
import team.managementplatform.pojo.VenueExample;

public interface VenueMapper {
    long countByExample(VenueExample example);

    int deleteByExample(VenueExample example);

    int deleteByPrimaryKey(Integer venueId);

    int insert(Venue record);

    int insertSelective(Venue record);

    List<Venue> selectByExampleWithBLOBs(VenueExample example);

    List<Venue> selectByExample(VenueExample example);

    Venue selectByPrimaryKey(Integer venueId);

    int updateByExampleSelective(@Param("record") Venue record, @Param("example") VenueExample example);

    int updateByExampleWithBLOBs(@Param("record") Venue record, @Param("example") VenueExample example);

    int updateByExample(@Param("record") Venue record, @Param("example") VenueExample example);

    int updateByPrimaryKeySelective(Venue record);

    int updateByPrimaryKeyWithBLOBs(Venue record);

    int updateByPrimaryKey(Venue record);
}