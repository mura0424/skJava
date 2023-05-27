package skJava.lesson05;

import java.util.ArrayList;
import java.util.List;

public class Binary {
	
	//十進数から二進数に変換するメソッド
	public String binary(int val) {
		
		String str = new String();
		
		//val = 0 の場合
		if(val == 0) {
			str = Integer.toString(val);
			return str;
		}

		List<Integer> valList = new ArrayList<>();
		
		//計算
		int i = val;
		while(i > 0) {
			valList.add(i % 2);
			i = i / 2;
		}
		
		//組み立て（余りが二進数になる/余りの最後の値から並べる）
		int listLen = valList.size();
		while(listLen > 0) {
			int a = valList.get(listLen - 1);
			//予想：strがString型だからint型足しても足し算にならないはず・・・。
			str = str + a;
			listLen--;
		}
		
		return str;
		
	}


}
