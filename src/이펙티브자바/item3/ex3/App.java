package 이펙티브자바.item3.ex3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, IOException {

		Elvis elvis = Elvis.INSTANCE;

		// 직렬화
		byte[] serializedElvis;

		try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
			try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
				objectOutputStream.writeObject(elvis);
				serializedElvis = byteArrayOutputStream.toByteArray();
			}
		}

		// base64 인코딩
		String enCode = Base64.getEncoder().encodeToString(serializedElvis);
		System.out.println(enCode);

		// 역직렬화
		byte[] deCode = Base64.getDecoder().decode(enCode); // serializedEmploy 똑같다.
		try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(deCode)) {
			try (ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {

				// 역직렬화된 Member 객체를 읽어온다.
				Object readObject = objectInputStream.readObject();
				Elvis deSerializedElvis = (Elvis) readObject;

				// 역직렬화시, 새로운 객체로 생성되어 싱글톤 꺠짐
				System.out.println(elvis == deSerializedElvis); // true
				// readResolve 메서드 때문에 지금은 true
			}
		}

	}
}
