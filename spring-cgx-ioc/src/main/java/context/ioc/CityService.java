package context.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author guoxiong
 * 2019/12/21 下午9:20
 */
@Component
public class CityService {

    @Resource
    private CityDao cityDao;

    public CityService() {
        System.out.println("cityService construct");
    }

    @PostConstruct
    void init() {
        System.out.println("cityService init");
    }

    @PreDestroy
    void destroy() {
        System.out.println("cityService destroy");
    }

    public void hello() {
        cityDao.query();
    }

}
