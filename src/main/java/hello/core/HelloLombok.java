package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class HelloLombok {
    private ArrayList<String> name = new ArrayList<>();
    private String Sname;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setSname("이창근");
        helloLombok.name.add("cklee");
        helloLombok.name.add("bylee");
        helloLombok.setAge(31);

        System.out.println("helloLombok = " + helloLombok);

//        String name = helloLombok.getName();
//        System.out.println("name = " + name);
    }

}
