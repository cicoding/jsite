package com.jeesite.modules.cms.dao;

import com.jeesite.common.persistence.CrudDao;
import com.jeesite.common.persistence.annotation.MyBatisDao;
import com.jeesite.modules.cms.entity.Site;

/**
 * 站点DAO接口
 * @author ThinkGem
 * @version 2013-8-23
 */
@MyBatisDao
public interface SiteDao extends CrudDao<Site> {

}
