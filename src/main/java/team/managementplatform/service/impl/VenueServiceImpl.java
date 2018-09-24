package team.managementplatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.managementplatform.mapper.VenueMapper;
import team.managementplatform.pojo.Venue;
import team.managementplatform.pojo.VenueExample;
import team.managementplatform.service.VenueService;
@Service
public class VenueServiceImpl implements VenueService {

	@Autowired
	VenueMapper venueMapper;

	@Override
	public long countByExample(VenueExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(VenueExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer venueId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Venue record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Venue record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Venue> selectByExampleWithBLOBs(VenueExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venue> selectByExample(VenueExample example) {
		return venueMapper.selectByExample(example);
	}

	@Override
	public Venue selectByPrimaryKey(Integer venueId) {
		return venueMapper.selectByPrimaryKey(venueId);
	}

	@Override
	public int updateByExampleSelective(Venue record, VenueExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExampleWithBLOBs(Venue record, VenueExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Venue record, VenueExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Venue record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(Venue record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Venue record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
