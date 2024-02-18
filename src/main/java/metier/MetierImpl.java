package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements  IMetier{
    //@Autowired
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

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
