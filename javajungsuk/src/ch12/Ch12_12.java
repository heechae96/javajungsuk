package ch12;

import java.util.Arrays;

class MyArrayList<T> {
	T[] arr;

	@SafeVarargs
	@SuppressWarnings("varargs")
	MyArrayList(T... arr) {
		this.arr = arr;
	}
	
	@SafeVarargs
//	@SuppressWarnings("unchecked")
	public static <T> MyArrayList<T> asList(T... a) { 
        return new MyArrayList<>(a);
    }

	public String toString() {
		return Arrays.toString(arr);
	}
}

public class Ch12_12 {

	public static void main(String[] args) {

		// 애너테이션
		// SafeVarargs
		
		MyArrayList<String> list = MyArrayList.asList("1","2","3");
		System.out.println(list);
	}

}
