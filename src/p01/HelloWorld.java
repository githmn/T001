package p01;

public class HelloWorld {

	/**
	 * メインクラス
	 * @param args 使わない
	 */
	public static void main(String args[]){
		new HelloWorld().exec();
		System.out.println("executed");
	}
	
	/**
	 * HelloWorld を出力するだけの簡単なお仕事
	 */
	void exec(){
		System.out.println("aaa");
		System.out.println("======");
		System.out.println("HelloWorld!");
	}
}
