package Lab4;

public class CommandDemo {
	public static void main(String[] args) {
		Tv sony=new Tv();
		VGame vGame=new VGame();
		SetTopBox tata=new SetTopBox();
		SoundSystem ss=new SoundSystem();
		
		Command1 fatherNewsCommand=new NewsChannelCommand(sony, tata, vGame, ss);
		Command1 motherSerialCommand=new SerialTvCommand(sony, tata, vGame, ss);
		Command1 fatherTennisCommand=new PlayTennisCommand(sony, tata, vGame, ss);
		
		UniversalRemote uremote=new UniversalRemote();
		uremote.setCommand(fatherTennisCommand, 0);
		uremote.setCommand(fatherNewsCommand, 1);
		uremote.setCommand(motherSerialCommand, 2);
		
		uremote.executeCommand(0);
	}
}
class UniversalRemote{
	Command command[]=new Command[5];
	public UniversalRemote() {
		for(int i=0;i<5;i++) {
			command[i]=new DummyCommand();
		}
	}
	
	public void executeCommand(int slot) {
		command[slot].execute();
	}
	
	public void setCommand(Command1 fatherTennisCommand,int slot) {
		command[slot]=fatherTennisCommand;
	}
	class DummyCommand extends Command{	
		@Override
		public void execute() {
			System.out.println("dummy command.........I am yet to be operational...");
		}
	}
}
abstract class Command1{
	Tv sony;SetTopBox tata;VGame vGame;SoundSystem ss;
	public Command1() {
		// TODO Auto-generated constructor stub
	}
	public Command1(Tv sony, SetTopBox tata, VGame vGame, SoundSystem ss) {
		this.sony = sony;
		this.tata = tata;
		this.vGame = vGame;
		this.ss = ss;
	}
	
	
	public abstract void execute();
}
class NewsChannelCommand extends Command1{
	public NewsChannelCommand(Tv sony, SetTopBox tata, VGame vGame, SoundSystem ss) {
		super(sony,tata,vGame,ss);
	}
	@Override
	public void execute() {
		System.out.println("News channel command process starts..........");
		//i will write the logic...
		sony.switchOn();
		sony.av1Mode();
		ss.highSound();
		tata.newsChannel();
		System.out.println("Process over.....Enjoy the news....");
	}
}
class PlayTennisCommand extends Command1{
	public PlayTennisCommand(Tv sony, SetTopBox tata, VGame vGame, SoundSystem ss) {
		super(sony,tata,vGame,ss);
	}
	@Override
	public void execute() {
		System.out.println("Xbox play tennis command process started....");
		sony.switchOn();
		sony.av1Mode();
		ss.highSound();
		vGame.playTennis();
		System.out.println("enjoy playing tennis sir.....");
	}
}
class SerialTvCommand extends Command1{
	public SerialTvCommand(Tv sony, SetTopBox tata, VGame vGame, SoundSystem ss) {
		super(sony,tata,vGame,ss);
	}
	@Override
	public void execute() {
		System.out.println("serial tv channell process started fro amma...");
		sony.switchOn();
		sony.av1Mode();
		tata.serialChannel();
		ss.lowSound();
		System.out.println("enjoy the saas bahu fighting serial.....");
	}
}
class Tv{
	public void switchOn() {
		System.out.println("tv is swtiched on...");
	}
	public void av1Mode() {
		System.out.println("av1 mode on....");
	}
}
class SetTopBox{
	public void newsChannel() {
		System.out.println("news channel on...");
	}
	public void serialChannel() {
		System.out.println("serial channel on...");
	}
}
class SoundSystem{
	public void lowSound() {
		System.out.println("low sound.......");
	}
	public void highSound() {
		System.out.println("high sound.......");
	}
}
class VGame{
	public void playTennis() {
		System.out.println("play tennis.......");
	}
}
