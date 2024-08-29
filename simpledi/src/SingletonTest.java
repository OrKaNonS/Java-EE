// Singleton pattern(�̱��� ����)
// ��ü�� �ϳ��� ������ �ʿ䰡 ���� �� ���
// 1. private static �������
// 2. private ������
// 3. ���� ������� ��ü�� ��ȯ�ϴ� public �޼ҵ� ��ü


public class SingletonTest {
	
	// 1. private static �������
	private static SingletonTest obj = new SingletonTest();
	
	// 2. private ������ : �ܺο��� ��ü ���� �Ұ�
	private SingletonTest() {		
	}
	
	// 3. ������� ��ü�� ��ȯ�ϴ� public �޼ҵ� ��ü
	public SingletonTest getInstance() {
		return obj;
	}

}