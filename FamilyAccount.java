class FamilyAccount {
	public static void main(String[] args) {
		
		boolean isFlag=true;
		String details="";//��¼�����֧��������
		//��ʼ���
		int balance=10000;
		while(isFlag){
			System.out.println("----------��ͥ��֧�������-----------");
			System.out.println("           1 ��֧��ϸ                ");
			System.out.println("           2 �Ǽ�����                ");
			System.out.println("           3 �Ǽ�֧��                ");
			System.out.println("           4 ��    ��                ");
			System.out.println("         ��ѡ��1--4����            ");
			//��ȡ�û�ѡ��1-4
			char selection=Utility.readMenuSelection();
			switch(selection){
				case '1':
					System.out.println("----------��ǰ��֧��ϸ��¼-----------");
					System.out.println("��֧\t�˻����\t��֧���\t˵  ��\n");
					System.out.println(details);
					System.out.println("-------------------------------------");
					//System.out.println("1.��֧��ϸ");
				break;
				case '2':
					System.out.print("���������");
					int money=Utility.readNumber();
					System.out.print("��������˵����");
					String info=Utility.readString();
					//����balance
					balance +=money;
					//����details
					details +=("����\t"+balance+"\t\t"+money+"\t\t"+info+"\n");

					System.out.println("---------------�Ǽ����--------------");
					//System.out.println("2.�Ǽ�����");
				break;
				case '3':
					System.out.print("����֧����");
					int money1=Utility.readNumber();
					System.out.print("����֧��˵����");
					String info1=Utility.readString();
					//����balance
					if(balance>=money1){
						balance -=money1;
					//����details
					details +=("����\t"+balance+"\t\t"+money1+"\t\t"+info1+"\n");

					}else{
						System.out.println("������֧��ʧ�ܣ�����");
					}

					System.out.println("---------------�Ǽ����--------------");
					//System.out.println("3.�Ǽ�֧��");
				break;
				case '4':
					//System.out.println("4.��  ��");
					System.out.println("ȷ���Ƿ��˳���Y/N��");
				char isExit=Utility.readConfirmSelection();
					if(isExit=='Y'){
						isFlag=false;
					}
				//break;
			}
		}
	}
}
