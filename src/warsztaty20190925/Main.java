package warsztaty20190925;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("9");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(9);
        ArrayList arrayList = new ArrayList();
        arrayList.add(9);
        arrayList.add("9");
        for (Object o : arrayList) {
            if (o instanceof String) {

            }
        }
        Box<Person> box = new Box<>();
        box.put(new Person());
        Person p = box.get();
        System.out.println(p);


    }
    static class Person {
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

}
