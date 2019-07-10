package interfaces;

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform waveform=new Waveform();
		Waveform waveform2=new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), waveform);
		Apply.process(new FilterAdapter(new HighPass(1.0)), waveform2);


	}

}
