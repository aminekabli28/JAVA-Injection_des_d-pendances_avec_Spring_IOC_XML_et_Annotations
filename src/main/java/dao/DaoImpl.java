package dao;

public class DaoImpl implements  IDao {


    @Override
    public double getData() {
        System.out.println("data from DB");
        double temp= Math.random()*40;
        return temp;
    }
}
