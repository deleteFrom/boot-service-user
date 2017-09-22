package com.boot.service.user;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.domain.user.BootUser;
import com.boot.mapper.user.BootUserMapper;
@Service
@Path("bootUserService")
public class BootUserServiceImpl implements BootUserService {
	@Autowired
	private BootUserMapper bootUserMapper;
	
	@Override
	public String insertBootUser(BootUser bootUser) {
		bootUserMapper.insertSelective(bootUser);
		return "1";
	}

}
