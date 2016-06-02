package spike;

import static spike.Kernel.yield;

/**
 * スパイクのエントリポイントとなるクラス。
 */
public class Main {

	/**
	 * スパイク。
	 * 
	 * @param args
	 *            実行引数
	 */
	public static void main(String[] args) {

		/*
		 * これまでのmk-blockを利用した初期化方法
		 */
		Foo fuga;
		{

			Bar bar = new Bar("fuga");
			fuga = new Foo(bar);
		}

		System.out.println(fuga);

		/*
		 * 未来に生きる僕たちのラムダを使った初期化方法
		 */
		Foo piyo = yield(() -> {

			Bar bar = new Bar("piyo");
			return new Foo(bar);
		});

		System.out.println(piyo);
	}
}

class Foo {

	private Bar bar;

	public Foo(Bar bar) {

		this.bar = bar;
	}

	public Bar getBar() {

		return bar;
	}

	@Override
	public String toString() {

		return String.format("Foo[%s]", bar);
	}
}

class Bar {

	private String value;

	public Bar(String value) {

		this.value = value;
	}

	public String getValue() {

		return value;
	}

	@Override
	public String toString() {

		return String.format("Bar[\"%s\"]", value);
	}
}
