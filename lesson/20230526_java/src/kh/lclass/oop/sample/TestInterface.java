package kh.lclass.oop.sample;

public interface TestInterface {
	int MaxCNT = 10;
	void method1();				// 능력단위별 평가보기
	String method2();			// 평가안내
	int method3(int a, int b);	// 평가리뷰
	int method3();
	
	int insertBoard(Car vo);
	int deleteBoard(Car vo);
	int updateBoard(Car vo);
	char selecOne(int boardNo);
	Car[] selectList(String searchWord);
	
}
