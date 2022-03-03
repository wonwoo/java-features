package ml.wonwoo.javafeatures;

import static ml.wonwoo.javafeatures.SwitchExpressions.Transport.BUS;

public class SwitchExpressions {

    enum Transport {

        BUS,
        TAXI,
        SUBWAY

    }

    public static void main(String[] args) {
        getTransportPrint(BUS);
        getTransportPrintWith(BUS);
        System.out.println(getTypeNumberSwitch(10));
        System.out.println(getTransportOrdinal(BUS));
    }

    public static void getTransportPrint(Transport transport) {

        switch (transport) {
            case BUS -> System.out.println("take a bus");
            case TAXI -> System.out.println("take a taxi");
            case SUBWAY -> System.out.println("take a subway");
            default -> System.out.println("walking");
        }
    }

    public static void getTransportPrintWith(Transport transport) {
        switch (transport) {
            case BUS, TAXI -> System.out.println("take a bus or taxi");
            case SUBWAY -> System.out.println("take a subway");
            default -> System.out.println("walking");
        }
    }

    public static double getTypeNumberSwitch(Number o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case Long l -> l.doubleValue();
            default -> 0;
        };
    }

    public static int getTransportOrdinal(Transport transport) {
        return switch (transport) {
            case BUS -> 0;
            case TAXI -> {
                System.out.println("");
                yield 1200;
            }
            case SUBWAY -> {
                System.out.println();
                yield 8000;
            }

        };

    }
}
