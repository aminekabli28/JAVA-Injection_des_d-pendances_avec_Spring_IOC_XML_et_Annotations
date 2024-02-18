package presentation;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class presentation_Sans_IoC {
    public static void main(String[] args) {
        IDao dao =new DaoImpl();

        MetierImpl M1=new MetierImpl(dao);
       // M1.setDao(dao); si on a pas le constructeur

        /*  Or
        IMetier M1=new MetierImpl();
        ((MetierImpl) M1).setDao(dao);
        */

        System.out.println(M1.calcul());
    }
}
