package org.springframework.zpr.function;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FunctionTest {
	public static void testLambda(AFunction aFunction) {
	}

	public static String testLambda(Supplier<String> s) {
		return s.get();
	}

	public static String testLambda(String str, Consumer<String> c) {
		c.accept(str);
		return str;
	}

	@Test
	public  void test() {
		List<Person> personList = new ArrayList<Person>() {{
			add(new Person("wangyu", 30, 30000d));
			add(new Person("hanyigang", 25, 20000d));
			add(new Person("liuxueyuan", 31, 20000d));
		}};
		this.sort(personList, new IPerson<Person>() {
			@Override
			public Boolean sort(Person person) {
				return person.gz > 1000;
			}
		});
		System.out.println(personList);

	}

	private void  sort(List<Person> personList, IPerson<Person> p) {
		for (Iterator<Person> i = personList.iterator(); i.hasNext(); ) {
			Person next = i.next();
			if (!p.sort(next)) {
				i.remove();
			}
		}
	}



	static class Person {
		public Person(String name, Integer age, Double gz) {
			this.name = name;
			this.age = age;
			this.gz = gz;
		}

		private String name;
		private Integer age;
		private Double gz;
	}


	public  Boolean filterD(String str) {
		return Boolean.TRUE;
	}

	public static void convert(
			String s,
			Function<String, String> fun1,
			Function<String, Integer> fun2,
			Function<Integer, Integer> fun3
	) {



	}
}
