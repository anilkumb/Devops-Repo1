package Group.Anil.Artifact.Mindscripts;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RemoteControlTest {

		RemoteControl rc=new RemoteControl();
		
		@Test
		public void switchOn() {
			rc.pressPowerButton();
			assertTrue(rc.my.power== true);
			
		}
		
		@Test
		public void switchOff() {
			
		}
	


}
