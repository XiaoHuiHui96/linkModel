package com.Link;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList<Integer> list=new LinkList<Integer>();
		try {
			System.out.println("开始");
			list.add(0,2);
			System.out.println(12312313);
			System.out.println(list.findByPos(0)+":"+list.findByPos(0).data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//list.addFirstNode(3);
		//System.out.println("测试开始"+list.findByPos(1).data);
		System.out.println("结束");
		list.displayAllNodes();
	}

}
