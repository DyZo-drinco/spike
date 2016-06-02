package spike;

import java.util.function.Consumer;

/**
 * {@link Object}の拡張メソッドを定義したクラス。
 */
public class ObjectExtensions {

	/**
	 * 引数の{@code object}に対して引数のコンシューマを適用したのち{@code object}と同一のオブジェクトを返す。
	 * 
	 * @param <T>
	 *            コンシューマの適用対象となるオブジェクトの型
	 * @param object
	 *            コンシューマの適用対象となるオブジェクト
	 * @param effector
	 *            適用するコンシューマ
	 * 
	 * @return 引数の{@code object}と同一のオブジェクト
	 */
	public static <T> T apply(T object, Consumer<T> effector) {

		effector.accept(object);
		return object;
	}
}
