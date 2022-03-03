package ml.wonwoo.javafeatures;

record Records(String name, String address) {

    public Records(String name) {
        this(name, "1528 Fillmore st, San Francisco");
    }

    Records {
        if (name == null) {
            throw new IllegalArgumentException("name must be not null!");
        }
        if (address == null) {
            throw new IllegalArgumentException("addrss must be not null!");
        }
    }

    public static void main(String[] args) {

        Records records = new Records("wonwoo", "Carson, CA, 90746");
        System.out.println(records);
        System.out.println(records.address());
        System.out.println(records.name());

        Records records1 = new Records("wonwoo");
        System.out.println(records1);
        System.out.println(records1.address());
        System.out.println(records1.name());
    }
}