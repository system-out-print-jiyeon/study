package com.kh.chap04_assit.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assit.part02_object.model.vo.Phone;

public class ObjectDao {

	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// ���Ͽ� ����� Phone ��ü ����
		Phone ph = new Phone("������", "�Ｚ", 1500000);
		
		// ��ü ��ü�� ���Ͽ� ����� �� ���Ǵ� ��Ʈ��
		// ObjectOutputStream : ��ü������ ��� ������ �޼ҵ� �������ִ� ������Ʈ��
		// FileOutputStream	  : ���Ͽ� ��½� ���Ǵ� ��� ��Ʈ�� (��ݽ�Ʈ�� ��ü �ʼ�!!)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phone.dat"))){
			
			// ��ü ��ü�� ��½� writeObject() �޼ҵ� �̿�
			oos.writeObject(ph);	// �ش� ����� ��ü Ŭ������ ����ȭ ���� ����ߵ�!
			// NotSerializableException ������!! ����ȭ�� ����ߵ�
			// PhoneŬ���� ���� implements Serializable ����ߵ�
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	// dat�� ��µȰ� �ľǺҰ�.(�ܰ��) ������ �Է¹޾ƿ;���
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// ���Ͽ� ��ϵ� ��ü ������ �Է¹ޱ� ���� ��Ʈ�� Ŭ����
		
		// ObjectInputStream : ��ü������ �о���̱� ���ؼ� �ʿ��� ������Ʈ�� Ŭ����
		// FileInputStream	 : ���Ͽ� ��ϵ� ������ �Է¹ޱ� ���� ��ݽ�Ʈ�� Ŭ����
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phone.dat"))){
	
			// ��ü ������ ������ �о���� �� : readObject() �޼ҵ� �̿�
			Phone ph = (Phone)ois.readObject(); 	// ��������ȯ
			System.out.println(ph);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
