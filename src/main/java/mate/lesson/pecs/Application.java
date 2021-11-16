package mate.lesson.pecs;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public Application() {
    }

    public static void main(String[] args) {
        //      коваріантність
        // приклад: якщо Кіт — це підтип Тварини, то Множина<Котів> — це підтип Множини<Тварин>
        // Множина<Тварин> = Множина<Котів>

        List<String> string1List = new ArrayList<>();
        List<Integer> integers1List = new ArrayList<>();
        List<Float> floats = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        List<? extends Number> objects1List = integers1List; //  List<Integer>
        // objects1List.add(new Object());
        Number o = objects1List.get(0);



        //      контраваріантність
        // приклад: якщо Кіт — це підтип Тварини, то Множина<Тварин> — це підтип Множини<Котів>
        // Множина<Котів> = Множина<Тварин>

        List<Object> objects2List =  new ArrayList<>();
        List<Number> numbers =  new ArrayList<>();
        List<String> strings =  new ArrayList<>();
        List<? super Number> string2List = objects2List;
        string2List.add(Long.valueOf(3L));


        //      інваріантність
        // якщо Кіт — це підтип Тварини, то Множина<Котів> не є підтипом Множини<Тварин>
        // і Множина<Тварин> не є підтипом Множина<Котів>.
        // Множина<Тварин> != Множина<Котів> && Множина<Котів> != Множина<Тварин>



        // array - коваріантність, collection - інваріантність
    }
}
