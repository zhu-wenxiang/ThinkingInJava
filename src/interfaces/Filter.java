package interfaces;

import static util.Print.*;

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) {
		return input;
	}

}

class LowPass extends Filter{
	double cutoff;
	public LowPass(double cutoff) {
		this.cutoff=cutoff;
	}
	@Override
	public Waveform process(Waveform input) {
		print("this is the LowPass process method");
		return super.process(input);
	}
	
}

class HighPass extends Filter{
	double cutoff;
	public HighPass(double cutoff) {
		this.cutoff=cutoff;
	}
	@Override
	public Waveform process(Waveform input) {
		print("this is the highpass process method");
		return super.process(input);
	}
	
}

class BandPass extends Filter{
	double cutoff;
	public BandPass(double cutoff) {
		this.cutoff=cutoff;
	}
	@Override
	public Waveform process(Waveform input) {
		print("this is the BandPass process method");
		return super.process(input);
	}
	
}