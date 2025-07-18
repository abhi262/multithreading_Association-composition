package Runnable_interface;

public class Syncorinized_block extends Thread {
	String_buffer stringBuffer;

	public Syncorinized_block(String_buffer string_buffer) {
		this.stringBuffer = string_buffer;
	}

	@Override

	public void run() {

		String name = Thread.currentThread().getName();
		if (name.trim().equalsIgnoreCase("thread1")) {
			stringBuffer.stringBuffer1.append("1");
			stringBuffer.stringBuffer1.append("1");
			stringBuffer.stringBuffer1.append("1");
			stringBuffer.stringBuffer1.append("1");
			stringBuffer.stringBuffer1.append("1");
			stringBuffer.stringBuffer1.append("1");
			stringBuffer.stringBuffer1.append("1");
			stringBuffer.stringBuffer1.append("1");
			System.out.println(stringBuffer.stringBuffer1);
		} else {
			stringBuffer.stringBuffer1.append("1");
			stringBuffer.stringBuffer1.append("2");
			stringBuffer.stringBuffer1.append("2");
			stringBuffer.stringBuffer1.append("2");
			stringBuffer.stringBuffer1.append("2");
			stringBuffer.stringBuffer1.append("2");
			stringBuffer.stringBuffer1.append("2");
			System.out.println(stringBuffer.stringBuffer1);
		}
	}

}
