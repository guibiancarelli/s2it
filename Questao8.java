package s2it;

public class Questao8 {

	public Integer getC(Integer A, Integer B) {

		if (A == null || B == null)
			return null;

		StringBuilder C = new StringBuilder();
		int maxSize = Math.max(A, B);

		for (int i = 0; i < maxSize; i++) {
			if (i < A.toString().length())
				C.append(A.toString().charAt(i));
			
			if (i < B.toString().length())
				C.append(B.toString().charAt(i));
		}

		return C.length() > 6 ? -1 : Integer.valueOf(C.toString());
	}
}
