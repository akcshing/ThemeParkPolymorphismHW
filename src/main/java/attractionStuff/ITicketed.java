package attractionStuff;

import themeparkStuff.Visitor;

public interface ITicketed {
    double defaultPrice();

    double priceFor(Visitor visitor);
}
