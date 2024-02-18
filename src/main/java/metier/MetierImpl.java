package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements  IMetier{
    private IDao dao;



    @Override
    public String calcul() {
        double tmp=dao.getData();
        double res=tmp*273.15;
        return (res+" kelvin");
    }

    public void setDao(IDao dao) {

        this.dao = dao;
    }
}
