
public class HumanReadableTime {
	public static String makeReadable(int seconds) {
		String h=""+(seconds/3600);
		String[] h_arr = h.split("\\.");
		int hours =Integer.parseInt(h_arr[0]);
		String hh=""+hours;
		if(hh.length()<2){
			hh="0"+hh;
		}
		
		String m=""+((seconds-(hours*3600))/60);
		String []m_arr = m.split("\\.");
		int minutes=Integer.parseInt(m_arr[0]);
		String mm=""+minutes;
		if(mm.length() <2){
			mm="0"+mm;
		}
		
		int sec=(seconds-(hours*3600+minutes*60));
		String ss=""+sec;
				if(ss.length()<2){
					ss="0"+ss;
				}
	 
	    return hh+":"+mm+":"+ss;
	}

	public static void main(String[] args) {
		String proba=makeReadable(0);
		System.out.println(proba);

	}

}
