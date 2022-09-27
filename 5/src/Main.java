import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		{
//      問① 下記の配列はString型しか格納できないように修正してください。
//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
	       List< String> array = new ArrayList<>();
//	    <以下記述>
	       
//      問② 前から二つ目の要素を"bar"にしましょう。
//	　<以下記述>
	       array.add("foo");
	       array.add("2");
//      問③ fooが格納されているインデックスを出力してください。
//	　<以下記述>
	       System.out.println("fooのインデックス" + array.get(1));
		}

		{
//     ok 問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
		map.put("address", "////");
		map.put("name", "Kosuke");
		map.put("age", "29");
		
		
//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
//		System.out.println("----- entrySet() -----");

        // entrySetを使用してMapに含まれる要素の「キー／値」のセットを取得
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey());
            
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
                       System.out.println("value: " + entry.getValue());
        }
        
//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
//	    <以下記述>
           
//      問⑧ 配列arrayDateをList型に変更しましょう。
//	    <以下記述>
           System.out.println(cal.get(Calendar.YEAR));
           System.out.println(cal.get(Calendar.MONTH) + 1);
           System.out.println(cal.get(Calendar.DATE));
        
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
		}
	}

}
