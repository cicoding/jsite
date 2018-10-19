package com.jeesite.modules.cms.service;

import com.jeesite.common.service.CrudService;
import com.jeesite.modules.cms.dao.ArticleDataDao;
import com.jeesite.modules.cms.entity.ArticleData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 站点Service
 * @author ThinkGem
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
