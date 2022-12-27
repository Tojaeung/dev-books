package 이펙티브자바.item3.ex4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

// 열거타입 싱글톤 직렬화 사용시
public class App {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Elvis elvis = Elvis.INSTANCE;

		System.out.println(elvis.getAge()); // 54
		System.out.println(elvis.getName()); // 엘비스

		// 직렬화
		byte[] serializedEmploy;

		try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
			try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
				objectOutputStream.writeObject(elvis);
				serializedEmploy = byteArrayOutputStream.toByteArray();
			}
		}

		// base64 인코딩
		String enCode = Base64.getEncoder().encodeToString(serializedEmploy);
		System.out.println(enCode);

		// 역직렬화
		byte[] deCode = Base64.getDecoder().decode(enCode); // serializedEmploy 똑같다.
		try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(deCode)) {
			try (ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {

				Object readObject = objectInputStream.readObject();
				Elvis deSerialzedElvis = (Elvis) readObject;

				// 역직렬화시 똑같은 객체이다.
				System.out.println(elvis == deSerialzedElvis); // true

				// 리플렉션도 마찬가지
			}
		}

	}
}
