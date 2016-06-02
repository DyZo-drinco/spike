package spike;

import java.util.function.Supplier;

/**
 * ドメインに関係なく汎用的に利用されるスタティックメソッドを定義したクラス。
 */
public class Kernel {

	/**
	 * 引数のサプライヤの{@link Supplier#get()}を呼び出し取得された値を返す。
	 * 
	 * @param <T>
	 *            サプライヤにより生成される値の型
	 * @param yielder
	 *            値を生成するサプライヤ
	 * 
	 * @return サプライヤにより生成された値
	 */
	public static <T> T yield(Supplier<T> yielder) {

		return yielder.get();
	}
}
