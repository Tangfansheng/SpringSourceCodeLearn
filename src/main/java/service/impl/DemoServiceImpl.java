package service.impl;

import dao.DemoDao;
import service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");
    @Override
    public List<String> getAll() {
        return demoDao.findAll();
    }

    public DemoServiceImpl() {
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }
}
