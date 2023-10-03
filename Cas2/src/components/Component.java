package components;

import visitor.ComponentVisitor;

public interface Component {
    double getPrice();
    boolean validateConfiguration();
    //On pourrait refactor accept dans une classe abstraite pour éviter de la redéfinir à chaque fois, 
    // mais ferait référence à classe abstraite, pas classe concrète
    String accept(ComponentVisitor visitor);
}
