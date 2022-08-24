package functional;


import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Display {
    public static void main(String[] args) {
        Visible visible = () -> System.out.println("Test");
        visible.show();
        Addition add = (int x, int y) -> x + y;
        int res = add.add(23, 45);
        System.out.println(res);

        Employee employee = new Employee("Nasim", 34, 129000);
        Predicate<String> predicate = (x) -> x.startsWith("N");
        boolean result = predicate.negate().test("Afghan");
        System.out.println(result);

        Predicate<Employee> employeePredicate = (emp) -> emp.getAge() > 24;
        System.out.println(employeePredicate.test(employee));

        Function<String, String> manipulator = (x) -> x.toUpperCase(Locale.ROOT);
        System.out.println(manipulator.apply("myName"));

        manipulator = (x) ->{
            x = x.substring(1);
            x = x.substring(0, x.length() - 1);
            x = x + "@";
            return x;
        };
        System.out.println(manipulator.apply("Testing"));

        Consumer<Employee> consumer = (x) -> x.setName(x.getName().toUpperCase());
        consumer.accept(employee);
        System.out.println(employee);

        Supplier<Employee> supplier = () -> new Employee("Supplier", 18, 34444);
        System.out.println(supplier.get());

        List<Employee> employees = Arrays.asList(
                new Employee("Test", 25, 90000),
                new Employee("Zamir", 32, 120000),
                new Employee("Aman", 20, 87000),
                new Employee("Ali", 45, 78000)
        );


        List<Double> empsSorted = employees.stream().filter(x -> x.getName().startsWith("A"))
                .sorted(Comparator.comparing(Employee::getAge)).map(x -> x.getSalary()).toList();

        System.out.println(empsSorted);

        int count = (int) employees.stream().filter(x -> x.getAge() > 30).count();
        System.out.println(count);
        Stream<Double> randomStream = Stream.generate(Math::random).limit(5);
        randomStream.forEach(System.out::println);

        Stream<List<Employee>> listStream = Stream.of(employees);
        listStream.forEach(System.out::println);

        List<String> sts = Arrays.asList("one", "two", "three", "four");
        String[] st = sts.stream().toArray(String[]::new);
        System.out.println(Arrays.stream(st).count());
        List<String> neSt = Arrays.stream(st).toList();
        System.out.println(neSt);
        Optional<Employee> optionalEmployee = employees.stream().findAny();
        if (optionalEmployee.isPresent()){
            System.out.println(optionalEmployee);
        }

        Optional<Employee> empName = employees.stream().filter(x -> x.getName().equals("NA")).findAny();
        System.out.println(empName.orElse(new Employee("asa", 23, 78000)));

        Optional<String> ename = employees.stream()
                .filter(x -> x.getName().equals("Hamed"))
                .map(x -> x.getName()).findAny();
        System.out.println(ename.orElse("Testing will be printed"));
        String orElseVal = ename.orElseGet(() -> new String("TESTing or else Get"));
        System.out.println(orElseVal);

        List<String> listTest = Arrays.asList();
        Optional<List<String>> ab = Optional.ofNullable(listTest);
        ab.stream().forEach(strings -> System.out.println(strings));

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> l2 = Arrays.asList(5, 6, 7, 8);
        List<Integer> l3 = Arrays.asList(9, 10, 11, 12);
        List<List<Integer>> allList = new ArrayList<>();
        allList.add(l1);
        allList.add(l2);
        allList.add(l3);
        System.out.println(allList);

        List<Integer> flatList = allList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(flatList);




    }
}
