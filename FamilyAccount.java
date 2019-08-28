class FamilyAccount {
	public static void main(String[] args) {
		
		boolean isFlag=true;
		String details="";//记录收入和支出的详情
		//初始金额
		int balance=10000;
		while(isFlag){
			System.out.println("----------家庭收支记账软件-----------");
			System.out.println("           1 收支明细                ");
			System.out.println("           2 登记收入                ");
			System.out.println("           3 登记支出                ");
			System.out.println("           4 退    出                ");
			System.out.println("         请选择（1--4）：            ");
			//获取用户选择：1-4
			char selection=Utility.readMenuSelection();
			switch(selection){
				case '1':
					System.out.println("----------当前收支明细记录-----------");
					System.out.println("收支\t账户金额\t收支金额\t说  明\n");
					System.out.println(details);
					System.out.println("-------------------------------------");
					//System.out.println("1.收支明细");
				break;
				case '2':
					System.out.print("本次收入金额：");
					int money=Utility.readNumber();
					System.out.print("本次收入说明：");
					String info=Utility.readString();
					//处理balance
					balance +=money;
					//处理details
					details +=("收入\t"+balance+"\t\t"+money+"\t\t"+info+"\n");

					System.out.println("---------------登记完成--------------");
					//System.out.println("2.登记收入");
				break;
				case '3':
					System.out.print("本次支出金额：");
					int money1=Utility.readNumber();
					System.out.print("本次支出说明：");
					String info1=Utility.readString();
					//处理balance
					if(balance>=money1){
						balance -=money1;
					//处理details
					details +=("收入\t"+balance+"\t\t"+money1+"\t\t"+info1+"\n");

					}else{
						System.out.println("超出余额，支付失败！！！");
					}

					System.out.println("---------------登记完成--------------");
					//System.out.println("3.登记支出");
				break;
				case '4':
					//System.out.println("4.推  出");
					System.out.println("确认是否退出（Y/N）");
				char isExit=Utility.readConfirmSelection();
					if(isExit=='Y'){
						isFlag=false;
					}
				//break;
			}
		}
	}
}
