package com.digit.ncs;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.digit.ncs.setting.Config;
import com.digit.ncs.setting.dao.UserDao;

public class UserDaoTest {
	UserDao dao;

	@Before
	public void setUp() throws Exception {
		dao = UserDao.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInitUser() {
		try {
			dao.initUser();
		} catch (Exception e) {
			fail("Can't Init User - " + e.getCause());
		}
	}
}
