package presentation;

import dao.IDao;
import dao.DaoImpl;
import ext.DaoImplExt;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation3 {
    public static void main(String[] args) {
        IDao dao1 = new DaoImpl();
        IMetier metier1 = new MetierImpl(dao1);
        System.out.println("Résultats (DaoImpl) = " + metier1.calcul());

        IDao dao2 = new DaoImplExt();
        IMetier metier2 = new MetierImpl(dao2);
        System.out.println("Résultats (DaoImplExt) = " + metier2.calcul());
    }
}


