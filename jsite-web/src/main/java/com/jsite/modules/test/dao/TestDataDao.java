/**
 * Copyright &copy; 2017-2019 <a href="https://gitee.com/baseweb/JSite">JSite</a> All rights reserved.
 */
package com.jsite.modules.test.dao;

import com.jsite.common.persistence.CrudDao;
import com.jsite.common.persistence.annotation.MyBatisDao;
import com.jsite.modules.test.entity.TestData;

/**
 * 单表生成测试DAO接口
 * @author liuruijun
 * @version 2019-01-02
 */
@MyBatisDao
public interface TestDataDao extends CrudDao<TestData> {
	
}