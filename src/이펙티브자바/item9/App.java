package 이펙티브자바.item9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

	private static final int BUFFER_SIZE = 8 * 1024;

	// 안좋은 예
	static void copyV1(String src, String dst) throws IOException {

		InputStream in = new FileInputStream(src);

		try {
			OutputStream out = new FileOutputStream(dst);

			try {
				byte[] buf = new byte[BUFFER_SIZE];
				int n;
				while ((n = in.read(buf)) >= 0)
					out.write(buf, 0, n);
			} finally {
				out.close();
			}

		} finally {
			in.close();
		}
	}

	// 좋은 예
	static void copyV2(String src, String dst) throws IOException {
		// 자원을 try문 파라미터 형식으로 넘긴다. (자원회수는 자동...)
		try (InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)) {
			byte[] buf = new byte[BUFFER_SIZE];
			int n;
			while ((n = in.read(buf)) >= 0)
				out.write(buf, 0, n);
		} // catch문으로 예외처리 가능
	}

}
