package spike;

import static spike.ObjectExtensions.apply;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link ObjectExtensions#apply(Object, java.util.function.Consumer)}に対するスパイク。
 */
public class TapSpike {

	/**
	 * スパイク。
	 * 
	 * @param args
	 *            実行引数
	 */
	public static void main(String[] args) {

		Map<String, String> map = apply(new HashMap<>(), m -> {

			m.put("uno", "one");
			m.put("dos", "two");
			m.put("tres", "three");
		});

		System.out.println(map);
	}
}
