public class Homework910 {
	public static void main(String[] args) {
		//
		Music song = new Music("Reset",244);
		song.play();
		System.out.println(song.getInfo());
	}
}


class Music {
	String name;
	int duration;

	public Music(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}

	public void play() {
		for (int i = 0; i < duration; ++i) {
			System.out.println(name + " 正在播放～");
		}
	}

	public String getName() {
		return this.name;
	}

	public int getDuration() {
		return this.duration;
	}

	public String getInfo() {
		return "音乐" + this.name + " 时长为" + this.duration;
	}

}