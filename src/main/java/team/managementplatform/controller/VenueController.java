package team.managementplatform.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import team.managementplatform.pojo.Region;
import team.managementplatform.pojo.RegionExample;
import team.managementplatform.pojo.Venue;
import team.managementplatform.pojo.VenueExample;
import team.managementplatform.service.RegionService;
import team.managementplatform.service.VenueService;

@RestController
@RequestMapping("/venue")
public class VenueController {

	@Autowired
	VenueService venueService;
	@Autowired
	RegionService regionService;

	// 获取场馆列表
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<Venue> getVenueListByDistrict(@RequestParam String district) {
		RegionExample regionExample = new RegionExample();
		if (district != "all") {
			regionExample.createCriteria().andDistrictEqualTo(district);
		}
		VenueExample venueExample = new VenueExample();
		Venue venue;
		List<Region> regionList = regionService.selectByExample(regionExample);
		List<Venue> venueList = new ArrayList<>();
		for (Region region : regionList) {
			venueExample.createCriteria().andRegionIdEqualTo(region.getRegionId());
			venue = venueService.selectByExample(venueExample).get(0);
			venueList.add(venue);
		}
		return venueList;
	}

	// 获取指定场馆信息
	@RequestMapping(value = "/get/{venueId}", method = RequestMethod.GET)
	public Venue getTheVenue(@PathVariable Integer venueId) {
		Venue venue = venueService.selectByPrimaryKey(venueId);
		return venue;
	}
	
	//
}
