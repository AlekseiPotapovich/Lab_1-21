import javax.swing.JOptionPane;

public class Action {
	
	public static void Action() {}
	
	public int act(int dis, int speed) {
		int res = dis/speed;
		return res;
	}
	
	public String act1(String disT, String speedT) {
		String timeT = null;
		try {
			int dis = Integer.parseInt(disT);
			int speed = Integer.parseInt(speedT);
			int res = act(dis,speed);
			timeT = Integer.toString(res);
		}catch(NumberFormatException io) {
			JOptionPane.showMessageDialog(null, "Speed or Distance not correct enter!","Error", JOptionPane.ERROR_MESSAGE);
		}
		return timeT;
	}

}
