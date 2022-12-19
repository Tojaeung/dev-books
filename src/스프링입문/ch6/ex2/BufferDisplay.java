package 스프링입문.ch6.ex2;

import java.util.ArrayList;

public class BufferDisplay implements Display {
	private ArrayList<String> buffer = new ArrayList<>();
	private ScreenDisplay screenDisplay = new ScreenDisplay();
	private int bufferSize;

	public BufferDisplay(int bufferSize) {
		this.bufferSize = bufferSize;
	}

	@Override
	public void print(String content) {
		buffer.add(content);
		if (buffer.size() == bufferSize) {
			flush();
		}
	}

	public void flush() {
		String lines = String.join("\n", buffer);
		screenDisplay.print(lines);
		buffer.clear(); // ArrayList 메모리에서 지움

	}
}
