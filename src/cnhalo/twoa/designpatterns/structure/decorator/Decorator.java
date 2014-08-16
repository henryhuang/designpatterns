package cnhalo.twoa.designpatterns.structure.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��6�� ����1:42:47
 * 
 */
public class Decorator implements Work{
	
	private Work work;
	
	// �������ӵĹ��ܱ������List��
	private List<String> others = new ArrayList<String>();
	
	// �ڹ�������ʹ�����new��ʽ������Work����
	public Decorator(Work work) {
		this.work = work;
		others.add("�ڿ�");
		others.add("��ľ��");
	}
	
	@Override
	public void insert() {
		newMethod();
	}

	//���·����У���insert֮ǰ����������������������Ⱥ����û����ָ��
	public void newMethod() {
		otherMethod();
		work.insert();
	}
	
	public void otherMethod() {
		ListIterator<String> iterator = others.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
