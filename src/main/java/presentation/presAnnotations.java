package presentation;

import metier.IMetier;
import metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presAnnotations {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao2","metier");
        IMetier metier =context.getBean(MetierImpl.class);
        System.out.println(metier.calcul());
    }
}
