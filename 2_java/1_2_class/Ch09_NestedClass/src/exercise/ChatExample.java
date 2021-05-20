package exercise;

public class ChatExample {

	public static void main(String[] args) {
		Chatting ch = new Chatting();
		ch.startChat("test");
		Chatting.Chat ch2 = ch.new Chat();
		
		//ch2.sendMessage("1");
		//ch2.sendMessage("bye");
		
	}

}
