package components;

import visitor.ComponentVisitor;

public interface Component {
    double getPrice();
    boolean validateConfiguration();
    String accept(ComponentVisitor visitor);
}
