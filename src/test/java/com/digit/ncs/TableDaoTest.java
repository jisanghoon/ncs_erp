package com.digit.ncs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.digit.ncs.setting.Config;
import com.digit.ncs.setting.dao.DataBaseDao;
import com.digit.ncs.setting.dao.TableDao;

public class TableDaoTest {
	TableDao dao;

	@Before
	public void setUp() throws Exception {
		dao = TableDao.getInstance();
		DataBaseDao.getInstance().createDatabase();
		DataBaseDao.getInstance().selectUseDatabase();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateTable() {

		for (String table : Config.CREATE_SQL) {

			dao.createTable(table);

		}
	}

}
