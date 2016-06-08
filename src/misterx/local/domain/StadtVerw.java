package misterx.local.domain;
import java.io.Serializable;
import java.util.List;
import java.util.Vector;

import misterx.local.valueobjekts.Station;

public class StadtVerw implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6562320566417874902L;
	List<Station> meineStationen = new Vector<Station>();
	
	public StadtVerw()  {
		Station s1 = new Station("1");
		Station s2 = new Station("2");
		Station s3 = new Station("3");
		Station s4 = new Station("4");
		Station s5 = new Station("5");
		Station s6 = new Station("6");
		Station s7 = new Station("7");
		Station s8 = new Station("8");
		Station s9 = new Station("9");
		Station s10 = new Station("10");
		Station s11 = new Station("11");
		Station s12 = new Station("12");
		Station s13 = new Station("13");
		Station s14 = new Station("14");
		Station s15 = new Station("15");
		Station s16 = new Station("16");
		Station s17 = new Station("17");
		Station s18 = new Station("18");
		Station s19 = new Station("19");
		Station s20 = new Station("20");
		Station s21 = new Station("21");
		Station s22 = new Station("22");
		Station s23 = new Station("23");
		Station s24 = new Station("24");
		Station s25 = new Station("25");
		Station s26 = new Station("26");
		Station s27 = new Station("27");
		Station s28 = new Station("28");
		Station s29 = new Station("29");
		Station s30 = new Station("30");
		Station s31 = new Station("31");
		Station s32 = new Station("32");
		Station s33 = new Station("33");
		Station s34 = new Station("34");
		Station s35 = new Station("35");
		Station s36 = new Station("36");
		Station s37 = new Station("37");
		Station s38 = new Station("38");
		Station s39 = new Station("39");
		Station s40 = new Station("40");
		Station s41 = new Station("41");
		Station s42 = new Station("42");
		Station s43 = new Station("43");
		Station s44 = new Station("44");
		Station s45 = new Station("45");
		Station s46 = new Station("46");
		Station s47 = new Station("47");
		Station s48 = new Station("48");
		Station s49 = new Station("49");
		Station s50 = new Station("50");
		Station s51 = new Station("51");
		Station s52 = new Station("52");
		Station s53 = new Station("53");
		
		
		
		meineStationen.add(s1);
		meineStationen.add(s2);
		meineStationen.add(s3);
		meineStationen.add(s4);
		meineStationen.add(s5);
		meineStationen.add(s6);
		meineStationen.add(s7);
		meineStationen.add(s8);
		meineStationen.add(s9);
		meineStationen.add(s10);
		meineStationen.add(s11);
		meineStationen.add(s12);
		meineStationen.add(s13);
		meineStationen.add(s14);
		meineStationen.add(s15);
		meineStationen.add(s16);
		meineStationen.add(s17);
		meineStationen.add(s18);
		meineStationen.add(s19);
		meineStationen.add(s20);
		meineStationen.add(s21);
		meineStationen.add(s22);
		meineStationen.add(s23);
		meineStationen.add(s24);
		meineStationen.add(s25);
		meineStationen.add(s26);
		meineStationen.add(s27);
		meineStationen.add(s28);
		meineStationen.add(s29);
		meineStationen.add(s30);
		meineStationen.add(s31);
		meineStationen.add(s32);
		meineStationen.add(s33);
		meineStationen.add(s34);
		meineStationen.add(s35);
		meineStationen.add(s36);
		meineStationen.add(s37);
		meineStationen.add(s38);
		meineStationen.add(s39);
		meineStationen.add(s40);
		meineStationen.add(s41);
		meineStationen.add(s42);
		meineStationen.add(s43);
		meineStationen.add(s44);
		meineStationen.add(s45);
		meineStationen.add(s46);
		meineStationen.add(s47);
		meineStationen.add(s48);
		meineStationen.add(s49);
		meineStationen.add(s50);
		meineStationen.add(s51);
		meineStationen.add(s52);
		meineStationen.add(s53);
	
		
		s1.addTaxiNachbar(s3);
		s1.addTaxiNachbar(s6);
		s1.addBusNachbar(s4);
		s1.addBusNachbar(s19);
		s1.addBahnNachbar(s4);
		s1.addBahnNachbar(s44);
		
		s2.addTaxiNachbar(s3);
		s2.addTaxiNachbar(s6);
		s2.addTaxiNachbar(s20);
		
		s3.addTaxiNachbar(s1);
		s3.addTaxiNachbar(s2);
		s3.addTaxiNachbar(s4);
		s3.addTaxiNachbar(s7);
		
		s4.addTaxiNachbar(s3);
		s4.addTaxiNachbar(s5);
		s4.addTaxiNachbar(s8);
		s4.addBusNachbar(s1);
		s4.addBusNachbar(s8);
		s4.addBusNachbar(s23);
		s4.addBahnNachbar(s1);
		s4.addBahnNachbar(s53);

		s5.addTaxiNachbar(s4);
		s5.addTaxiNachbar(s9);
		s5.addTaxiNachbar(s10);

		s6.addTaxiNachbar(s1);
		s6.addTaxiNachbar(s2);
		s6.addTaxiNachbar(s13);

		s7.addTaxiNachbar(s3);
		s7.addTaxiNachbar(s8);
		s7.addTaxiNachbar(s14);

		s8.addTaxiNachbar(s4);
		s8.addTaxiNachbar(s7);
		s8.addTaxiNachbar(s9);
		s8.addTaxiNachbar(s14);
		s8.addTaxiNachbar(s22);
		s8.addBusNachbar(s4);
		s8.addBusNachbar(s15);
		s8.addBusNachbar(s20);
		s8.addBusNachbar(s34);

		s9.addTaxiNachbar(s5);
		s9.addTaxiNachbar(s8);
		s9.addTaxiNachbar(s15);
		s9.addTaxiNachbar(s22);

		s10.addTaxiNachbar(s5);
		s10.addTaxiNachbar(s15);
		s10.addTaxiNachbar(s23);

		s13.addTaxiNachbar(s6);
		s13.addTaxiNachbar(s19);
		s13.addTaxiNachbar(s20);

		s14.addTaxiNachbar(s7);
		s14.addTaxiNachbar(s8);
		s14.addTaxiNachbar(s20);
		s14.addTaxiNachbar(s21);

		s15.addTaxiNachbar(s9);
		s15.addTaxiNachbar(s10);
		s15.addTaxiNachbar(s35);
		s15.addTaxiNachbar(s36);
		s15.addBusNachbar(s8);
		s15.addBusNachbar(s46);

		s19.addTaxiNachbar(s13);
		s19.addTaxiNachbar(s31);
		s19.addBusNachbar(s1);
		s19.addBusNachbar(s44);

		s20.addTaxiNachbar(s2);
		s20.addTaxiNachbar(s13);
		s20.addTaxiNachbar(s14);
		s20.addTaxiNachbar(s32);
		s20.addBusNachbar(s8);
		s20.addBusNachbar(s44);

		s21.addTaxiNachbar(s14);
		s21.addTaxiNachbar(s32);
		s21.addTaxiNachbar(s33);
		s21.addTaxiNachbar(s34);

		s22.addTaxiNachbar(s8);
		s22.addTaxiNachbar(s9);
		s22.addTaxiNachbar(s34);

		s23.addTaxiNachbar(s10);
		s23.addTaxiNachbar(s36);
		s23.addTaxiNachbar(s37);
		s23.addBusNachbar(s4);
		s23.addBusNachbar(s49);
		s23.addBusNachbar(s53);

		s31.addTaxiNachbar(s19);
		s31.addTaxiNachbar(s32);
		s31.addTaxiNachbar(s44);

		s32.addTaxiNachbar(s20);
		s32.addTaxiNachbar(s21);
		s32.addTaxiNachbar(s31);
		s32.addTaxiNachbar(s44);

		s33.addTaxiNachbar(s21);
		s33.addTaxiNachbar(s45);
		s33.addTaxiNachbar(s46);

		s34.addTaxiNachbar(s21);
		s34.addTaxiNachbar(s22);
		s34.addTaxiNachbar(s35);
		s34.addTaxiNachbar(s46);
		s34.addBusNachbar(s8);
		s34.addBusNachbar(s46);

		s35.addTaxiNachbar(s15);
		s35.addTaxiNachbar(s34);
		s35.addTaxiNachbar(s46);
		s35.addTaxiNachbar(s48);

		s36.addTaxiNachbar(s15);
		s36.addTaxiNachbar(s23);
		s36.addTaxiNachbar(s49);
		s36.addTaxiNachbar(s51);

		s37.addTaxiNachbar(s23);
		s37.addTaxiNachbar(s52);
		s37.addTaxiNachbar(s53);

		s44.addTaxiNachbar(s31);
		s44.addTaxiNachbar(s32);
		s44.addTaxiNachbar(s45);
		s44.addBusNachbar(s19);
		s44.addBusNachbar(s20);
		s44.addBusNachbar(s46);
		s44.addBahnNachbar(s1);
		s44.addBahnNachbar(s53);

		s45.addTaxiNachbar(s33);
		s45.addTaxiNachbar(s44);
		s45.addTaxiNachbar(s46);

		s46.addTaxiNachbar(s33);
		s46.addTaxiNachbar(s34);
		s46.addTaxiNachbar(s35);
		s46.addTaxiNachbar(s45);
		s46.addTaxiNachbar(s48);
		s46.addBusNachbar(s15);
		s46.addBusNachbar(s34);
		s46.addBusNachbar(s44);
		s46.addBusNachbar(s49);

		s48.addTaxiNachbar(s35);
		s48.addTaxiNachbar(s46);
		s48.addTaxiNachbar(s49);

		s49.addTaxiNachbar(s36);
		s49.addTaxiNachbar(s48);
		s49.addTaxiNachbar(s50);
		s49.addBusNachbar(s23);
		s49.addBusNachbar(s46);
		s49.addBusNachbar(s52);

		s50.addTaxiNachbar(s49);
		s50.addTaxiNachbar(s51);

		s51.addTaxiNachbar(s36);
		s51.addTaxiNachbar(s50);
		s51.addTaxiNachbar(s52);

		s52.addTaxiNachbar(s37);
		s52.addTaxiNachbar(s51);
		s52.addTaxiNachbar(s53);
		s52.addBusNachbar(s49);
		s52.addBusNachbar(s53);

		s53.addTaxiNachbar(s37);
		s53.addTaxiNachbar(s52);
		s53.addBusNachbar(s23);
		s53.addBusNachbar(s52);
		s53.addBahnNachbar(s4);
		s53.addBahnNachbar(s44);
		
		
		
	}
	

	public Station getStationByIndex(int index){
		Station strasse = meineStationen.get(index);
		return strasse;
	}
}