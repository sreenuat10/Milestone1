package AbstarctClasses;

abstract class Instrument {
	public abstract void play();
}
class Flute extends Instrument {

	@Override
	public void play() {
		System.out.println("Flute is playing  toot toot toot toot");

	}

}
class Guitar extends Instrument {

	@Override
	public void play() {
		System.out.println("Guitar is playing  tin  tin  tin");

	}

}
class Piano extends Instrument {

	@Override
	public void play() {
		System.out.println("Piano is playing  tan tan tan tan");

	}

}
public class Music {

	public static void main(String[] args) {
		Instrument ins[]=new Instrument[10];
	    
	    
	for(int i=0;i<10;i++) 
	{ 
		if(i==0||i==1||i==2) 
			ins[i]=new Piano(); 
	else if(i==3||i==4||i==5) 
		ins[i]=new Flute(); 
	else
		ins[i]=new Guitar();
		ins[i].play();
	    	if (ins[i] instanceof Piano) 
	    		System.out.println("Piano is stored at index " + i);
	    	else if (ins[i] instanceof Flute) 
	    		System.out.println("Flute is stored at index " + i);
	    	else if (ins[i] instanceof Guitar) 
	    		System.out.println("Guitar is stored at index " + i);
	    }

	}



	

}
