package team.managementplatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.managementplatform.mapper.RegionMapper;
import team.managementplatform.pojo.Region;
import team.managementplatform.pojo.RegionExample;
import team.managementplatform.service.RegionService;
@Service
public class RegionServiceImpl implements RegionService {

	@Autowired
	RegionMapper regionMapper;
	@Override
	public long countByExample(RegionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(RegionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer regionId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Region record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Region record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Region> selectByExample(RegionExample example) {
		return regionMapper.selectByExample(example);
	}

	@Override
	public Region selectByPrimaryKey(Integer regionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Region record, RegionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Region record, RegionExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Region record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Region record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
