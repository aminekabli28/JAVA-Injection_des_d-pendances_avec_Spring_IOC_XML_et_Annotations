package dao;

import org.springframework.stereotype.Component;

// @Component("dao2")
public class DaoImpl2  implements  IDao{
    @Override
    public double getData() {
        System.out.println("data from web services");

        return Math.random()*40;
    }
}