package attractionStuff;

import themeparkStuff.Visitor;

public interface ISecurity {
    boolean isAllowedTo(Visitor visitor);
}
