/**
 * 商品クラス
 * @author M.Takahashi
 */
public class Product {
	/******** フィールド ******************************************/
	/**
	 * 商品名
	 */
	String name;

	/**
	 * 価格
	 */
	int price;
	
	/******** メソッド ******************************************/
	/**
	 * 値上げする
	 * @param amt 値上げ金額
	 * @return 値上げ後の価格
	 */
	int up(int amt) {
		return price += amt;
	}
	
	/**
	 * 値下げする
	 * @param amt 値下げ金額
	 * @return 値下げ後の価格
	 */
	int down(int amt) {
		return price -= amt;
	}

	/**
	 * 情報表示
	 */
	void display() {
		System.out.println(name + "："+price+"円");
	}
}
