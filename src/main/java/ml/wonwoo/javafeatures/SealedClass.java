package ml.wonwoo.javafeatures;

public class SealedClass {

    public static void main(String[] args) {
        getTransport(new ExpressBus());
        getTransport(new TaxiSealed());
    }

    static void getTransport(TransportSealed transportSealed) {

        switch (transportSealed) {
            case ExpressBus expressBus -> System.out.println(expressBus.getBus());
            case BusSealed bus -> System.out.println(bus.getBus());
            case TaxiSealed taxi -> System.out.println(taxi.getTaxi());
            default -> System.out.println("nothing");
        }
    }
}

sealed interface TransportSealed permits BusSealed, TaxiSealed {

}

non-sealed class BusSealed implements TransportSealed {

    public String getBus() {
        return "take a bus";
    }
}

final class TaxiSealed implements TransportSealed {

    public String getTaxi() {
        return "take a taxi";
    }
}

final class ExpressBus extends BusSealed {

    @Override
    public String getBus() {
        return super.getBus() + " Express";
    }
}