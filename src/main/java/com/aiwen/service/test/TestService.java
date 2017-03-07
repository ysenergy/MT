package com.aiwen.service.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiwen.dao.DaoSupport;
import com.aiwen.entitys.Page;
import com.aiwen.entitys.Test;
import com.aiwen.utils.PageData;

@Service("testService")
@SuppressWarnings("unchecked")
public class TestService {
	@Resource(name = "daoSupport")
	private DaoSupport daoSupport;

	public Test test() throws Exception {
		return (Test) daoSupport.findForObject("Test.test", "");
	}

	public List<PageData> selectKplsList(Page page) throws Exception {
		return (List<PageData>) daoSupport.findForList("Test.kplslistPage", page);
	}

	public int updateKpls() throws Exception {
		int i = (int) daoSupport.update("Test.updateXfxx", "");
		System.out.println(1 / 0);
		return i;
	}
}
