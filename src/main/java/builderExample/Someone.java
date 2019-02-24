package builderExample;

import inheritanceExample.Person;

public class Someone {

    private String name;
    private int age;
    private Address address;

    public Someone(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Someone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static class Builder {
        private String name;
        private int age;
        private Address address;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Someone create() {
            return new Someone(name, age, address);
        }
    }

    static class Address {
        private String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;

        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }

        static class Builder {
            private String street, city, state;

            public Builder street(String street) {
                this.street = street;
                return this;
            }

            public Builder city(String city) {
                this.city = city;
                return this;
            }

            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Address create() {
                return new Address(street, city, state);
            }
        }
    }
}
