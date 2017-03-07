package com.aiwen.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.aiwen.service.test.TestService;

public class Test {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-conf.xml");
		// DaoSupport daoSupport = (DaoSupport) ac.getBean("daoSupport");
		TestService testService = (TestService) ac.getBean("testService");
		// jdbcTest();
		// springTest();
		// System.out.println(Trans2RMB("3455563454534.56"));
		//swTest(testService);
		jdbcTest(testService);
	}

	public static void jdbcTest(TestService testService) {

		try {
			// System.out.println(daoSupport.findForObject("Test.test", ""));
			System.out.println(testService.test());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * 事务测试
	 * 
	 * @param testService
	 * @param daoSupport
	 * @throws Exception
	 */
	public static void swTest(TestService testService) throws Exception {
		System.out.println("更新前:");
		jdbcTest(testService);
		int num = testService.updateKpls();
		System.out.println(num);
		System.out.println("更新后:");
		jdbcTest(testService);

	}

}
