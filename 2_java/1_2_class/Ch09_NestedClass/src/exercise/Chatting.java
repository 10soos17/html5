package exercise;

public class Chatting {

	class Chat {
		void start() {// 일반 메소드

		}

		void sendMessage(String message) {// 일반 메소드

			System.out.println(message);
		}
	}

	void startChat(final String chatId) {
		// String nickName = null;
		// nickName = chatId;//중첩 클래스 안에서는 final 변수 (고정상수)
		String nickName = chatId;
		// local Inner Class: 익명 객체
		Chat chat = new Chat() {
			@Override
			void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);

					break;

				}
			}
		};
		chat.start();

	}
}
