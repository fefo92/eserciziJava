package javainproduction._1_records_ternaryOperator_BigInteger;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "Person{Name= " + name + ", Age= " + age + ", Address= " + address + "}";
    }
}
