package ml.wonwoo.javafeatures;

public class InstanceOf {

    public static void main(String[] args) {

        Object records = new Records("wonwoo", "Carson, CA, 90746");

        if (records instanceof Records r) {
            System.out.println(r.address());
            System.out.println(r.name());
        }
    }
}

