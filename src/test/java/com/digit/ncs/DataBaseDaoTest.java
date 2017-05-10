package com.digit.ncs;

import org.junit.Assert;
import org.junit.Test;

import com.digit.ncs.setting.dao.DataBaseDao;

public class DataBaseDaoTest {
	DataBaseDao dao;
	@Test
	public void testGetInstance() {
		
		dao=DataBaseDao.getInstance();
		Assert.assertNotNull(dao);
	}

	@Test
	public void testCreateDatabase() {
		
		DataBaseDao.getInstance().createDatabase();
		
	}
	
	@Test
	public void testSelectUseDatabase() {
		DataBaseDao.getInstance().selectUseDatabase();
	}
	
	@Test
	public void testDropDatabase() {
		DataBaseDao.getInstance().dropDatabase();
	}



}
