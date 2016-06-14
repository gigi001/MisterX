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
	
//		
//		s1.addTaxiNachbar(s3);
//		s1.addTaxiNachbar(s6);
//		s1.addBusNachbar(s4);
//		s1.addBusNachbar(s19);
//		s1.addBahnNachbar(s4);
//		s1.addBahnNachbar(s44);
//		
//		s2.addTaxiNachbar(s3);
//		s2.addTaxiNachbar(s6);
//		s2.addTaxiNachbar(s20);
//		
//		s3.addTaxiNachbar(s1);
//		s3.addTaxiNachbar(s2);
//		s3.addTaxiNachbar(s4);
//		s3.addTaxiNachbar(s7);
//		
//		s4.addTaxiNachbar(s3);
//		s4.addTaxiNachbar(s5);
//		s4.addTaxiNachbar(s8);
//		s4.addBusNachbar(s1);
//		s4.addBusNachbar(s8);
//		s4.addBusNachbar(s23);
//		s4.addBahnNachbar(s1);
//		s4.addBahnNachbar(s53);
//
//		s5.addTaxiNachbar(s4);
//		s5.addTaxiNachbar(s9);
//		s5.addTaxiNachbar(s10);
//
//		s6.addTaxiNachbar(s1);
//		s6.addTaxiNachbar(s2);
//		s6.addTaxiNachbar(s13);
//
//		s7.addTaxiNachbar(s3);
//		s7.addTaxiNachbar(s8);
//		s7.addTaxiNachbar(s14);
//
//		s8.addTaxiNachbar(s4);
//		s8.addTaxiNachbar(s7);
//		s8.addTaxiNachbar(s9);
//		s8.addTaxiNachbar(s14);
//		s8.addTaxiNachbar(s22);
//		s8.addBusNachbar(s4);
//		s8.addBusNachbar(s15);
//		s8.addBusNachbar(s20);
//		s8.addBusNachbar(s34);
//
//		s9.addTaxiNachbar(s5);
//		s9.addTaxiNachbar(s8);
//		s9.addTaxiNachbar(s15);
//		s9.addTaxiNachbar(s22);
//
//		s10.addTaxiNachbar(s5);
//		s10.addTaxiNachbar(s15);
//		s10.addTaxiNachbar(s23);
//
//		s13.addTaxiNachbar(s6);
//		s13.addTaxiNachbar(s19);
//		s13.addTaxiNachbar(s20);
//
//		s14.addTaxiNachbar(s7);
//		s14.addTaxiNachbar(s8);
//		s14.addTaxiNachbar(s20);
//		s14.addTaxiNachbar(s21);
//
//		s15.addTaxiNachbar(s9);
//		s15.addTaxiNachbar(s10);
//		s15.addTaxiNachbar(s35);
//		s15.addTaxiNachbar(s36);
//		s15.addBusNachbar(s8);
//		s15.addBusNachbar(s46);
//
//		s19.addTaxiNachbar(s13);
//		s19.addTaxiNachbar(s31);
//		s19.addBusNachbar(s1);
//		s19.addBusNachbar(s44);
//
//		s20.addTaxiNachbar(s2);
//		s20.addTaxiNachbar(s13);
//		s20.addTaxiNachbar(s14);
//		s20.addTaxiNachbar(s32);
//		s20.addBusNachbar(s8);
//		s20.addBusNachbar(s44);
//
//		s21.addTaxiNachbar(s14);
//		s21.addTaxiNachbar(s32);
//		s21.addTaxiNachbar(s33);
//		s21.addTaxiNachbar(s34);
//
//		s22.addTaxiNachbar(s8);
//		s22.addTaxiNachbar(s9);
//		s22.addTaxiNachbar(s34);
//
//		s23.addTaxiNachbar(s10);
//		s23.addTaxiNachbar(s36);
//		s23.addTaxiNachbar(s37);
//		s23.addBusNachbar(s4);
//		s23.addBusNachbar(s49);
//		s23.addBusNachbar(s53);
//
//		s31.addTaxiNachbar(s19);
//		s31.addTaxiNachbar(s32);
//		s31.addTaxiNachbar(s44);
//
//		s32.addTaxiNachbar(s20);
//		s32.addTaxiNachbar(s21);
//		s32.addTaxiNachbar(s31);
//		s32.addTaxiNachbar(s44);
//
//		s33.addTaxiNachbar(s21);
//		s33.addTaxiNachbar(s45);
//		s33.addTaxiNachbar(s46);
//
//		s34.addTaxiNachbar(s21);
//		s34.addTaxiNachbar(s22);
//		s34.addTaxiNachbar(s35);
//		s34.addTaxiNachbar(s46);
//		s34.addBusNachbar(s8);
//		s34.addBusNachbar(s46);
//
//		s35.addTaxiNachbar(s15);
//		s35.addTaxiNachbar(s34);
//		s35.addTaxiNachbar(s46);
//		s35.addTaxiNachbar(s48);
//
//		s36.addTaxiNachbar(s15);
//		s36.addTaxiNachbar(s23);
//		s36.addTaxiNachbar(s49);
//		s36.addTaxiNachbar(s51);
//
//		s37.addTaxiNachbar(s23);
//		s37.addTaxiNachbar(s52);
//		s37.addTaxiNachbar(s53);
//
//		s44.addTaxiNachbar(s31);
//		s44.addTaxiNachbar(s32);
//		s44.addTaxiNachbar(s45);
//		s44.addBusNachbar(s19);
//		s44.addBusNachbar(s20);
//		s44.addBusNachbar(s46);
//		s44.addBahnNachbar(s1);
//		s44.addBahnNachbar(s53);
//
//		s45.addTaxiNachbar(s33);
//		s45.addTaxiNachbar(s44);
//		s45.addTaxiNachbar(s46);
//
//		s46.addTaxiNachbar(s33);
//		s46.addTaxiNachbar(s34);
//		s46.addTaxiNachbar(s35);
//		s46.addTaxiNachbar(s45);
//		s46.addTaxiNachbar(s48);
//		s46.addBusNachbar(s15);
//		s46.addBusNachbar(s34);
//		s46.addBusNachbar(s44);
//		s46.addBusNachbar(s49);
//
//		s48.addTaxiNachbar(s35);
//		s48.addTaxiNachbar(s46);
//		s48.addTaxiNachbar(s49);
//
//		s49.addTaxiNachbar(s36);
//		s49.addTaxiNachbar(s48);
//		s49.addTaxiNachbar(s50);
//		s49.addBusNachbar(s23);
//		s49.addBusNachbar(s46);
//		s49.addBusNachbar(s52);
//
//		s50.addTaxiNachbar(s49);
//		s50.addTaxiNachbar(s51);
//
//		s51.addTaxiNachbar(s36);
//		s51.addTaxiNachbar(s50);
//		s51.addTaxiNachbar(s52);
//
//		s52.addTaxiNachbar(s37);
//		s52.addTaxiNachbar(s51);
//		s52.addTaxiNachbar(s53);
//		s52.addBusNachbar(s49);
//		s52.addBusNachbar(s53);
//
//		s53.addTaxiNachbar(s37);
//		s53.addTaxiNachbar(s52);
//		s53.addBusNachbar(s23);
//		s53.addBusNachbar(s52);
//		s53.addBahnNachbar(s4);
//		s53.addBahnNachbar(s44);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		Station s54 = new Station ("54");
		Station s55 = new Station ("55");
		Station s56 = new Station ("56");
		Station s57 = new Station ("57");
		Station s58 = new Station ("58");
		Station s59 = new Station ("59");
		Station s60 = new Station ("60");
		Station s61 = new Station ("61");
		Station s62 = new Station ("62");
		Station s63 = new Station ("63");
		Station s64 = new Station ("64");
		Station s65 = new Station ("65");
		Station s66 = new Station ("66");
		Station s67 = new Station ("67");
		Station s68 = new Station ("68");
		Station s69 = new Station ("69");
		Station s70 = new Station ("70");
		Station s71 = new Station ("71");
		Station s72 = new Station ("72");
		Station s73 = new Station ("73");
		Station s74 = new Station ("74");
		Station s75 = new Station ("75");
		Station s76 = new Station ("76");
		Station s77 = new Station ("77");
		Station s78 = new Station ("78");
		Station s79 = new Station ("79");
		Station s80 = new Station ("80");
		Station s81 = new Station ("81");
		Station s82 = new Station ("82");
		Station s83 = new Station ("83");
		Station s84 = new Station ("84");
		Station s85 = new Station ("85");
		Station s86 = new Station ("86");
		Station s87 = new Station ("87");
		Station s88 = new Station ("88");
		Station s89 = new Station ("89");
		Station s90 = new Station ("90");
		Station s91 = new Station ("91");
		Station s92 = new Station ("92");
		Station s93 = new Station ("93");
		Station s94 = new Station ("94");
		Station s95 = new Station ("95");
		Station s96 = new Station ("96");
		Station s97 = new Station ("97");
		Station s98 = new Station ("98");
		Station s99 = new Station ("99");
		Station s100 = new Station ("100");
		Station s101 = new Station ("101");
		Station s102 = new Station ("102");
		Station s103 = new Station ("103");
		Station s104 = new Station ("104");
		Station s105 = new Station ("105");
		Station s106 = new Station ("106");
		Station s107 = new Station ("107");
		Station s108 = new Station ("108");
		Station s109 = new Station ("109");
		Station s110 = new Station ("110");
		Station s111 = new Station ("111");
		Station s112 = new Station ("112");
		Station s113 = new Station ("113");
		Station s114 = new Station ("114");
		Station s115 = new Station ("115");
		Station s116 = new Station ("116");
		Station s117 = new Station ("117");
		Station s118 = new Station ("118");
		Station s119 = new Station ("119");
		Station s120 = new Station ("120");
		Station s121 = new Station ("121");
		Station s122 = new Station ("122");
		Station s123 = new Station ("123");
		Station s124 = new Station ("124");
		Station s125 = new Station ("125");
		Station s126 = new Station ("126");
		Station s127 = new Station ("127");
		Station s128 = new Station ("128");
		Station s129 = new Station ("129");
		Station s130 = new Station ("130");
		Station s131 = new Station ("131");
		Station s132 = new Station ("132");
		Station s133 = new Station ("133");
		Station s134 = new Station ("134");
		Station s135 = new Station ("135");




				meineStationen.add(s54);
				meineStationen.add(s55);
				meineStationen.add(s56);	
				meineStationen.add(s57);
				meineStationen.add(s58);
				meineStationen.add(s59);
				meineStationen.add(s60);
				meineStationen.add(s61);
				meineStationen.add(s62);
				meineStationen.add(s63);
				meineStationen.add(s64);
				meineStationen.add(s65);
				meineStationen.add(s66);	
				meineStationen.add(s67);
				meineStationen.add(s68);
				meineStationen.add(s69);
				meineStationen.add(s70);
				meineStationen.add(s71);
				meineStationen.add(s72);
				meineStationen.add(s73);
				meineStationen.add(s74);
				meineStationen.add(s75);
				meineStationen.add(s76);	
				meineStationen.add(s77);
				meineStationen.add(s78);
				meineStationen.add(s79);
				meineStationen.add(s80);
				meineStationen.add(s81);
				meineStationen.add(s82);
				meineStationen.add(s83);
				meineStationen.add(s84);
				meineStationen.add(s85);
				meineStationen.add(s86);	
				meineStationen.add(s87);
				meineStationen.add(s88);
				meineStationen.add(s89);
				meineStationen.add(s90);
				meineStationen.add(s91);
				meineStationen.add(s92);
				meineStationen.add(s93);
				meineStationen.add(s94);
				meineStationen.add(s95);
				meineStationen.add(s96);	
				meineStationen.add(s97);
				meineStationen.add(s98);
				meineStationen.add(s99);
				meineStationen.add(s100);
				meineStationen.add(s101);
				meineStationen.add(s102);
				meineStationen.add(s103);
				meineStationen.add(s104);
				meineStationen.add(s105);
				meineStationen.add(s106);	
				meineStationen.add(s107);
				meineStationen.add(s108);
				meineStationen.add(s109);
				meineStationen.add(s110);
				meineStationen.add(s111);
				meineStationen.add(s112);
				meineStationen.add(s113);
				meineStationen.add(s114);
				meineStationen.add(s115);
				meineStationen.add(s116);	
				meineStationen.add(s117);
				meineStationen.add(s118);
				meineStationen.add(s119);
				meineStationen.add(s120);
				meineStationen.add(s121);
				meineStationen.add(s122);
				meineStationen.add(s123);
				meineStationen.add(s124);
				meineStationen.add(s125);
				meineStationen.add(s126);	
				meineStationen.add(s127);
				meineStationen.add(s128);
				meineStationen.add(s129);
				meineStationen.add(s130);
				meineStationen.add(s131);
				meineStationen.add(s132);
				meineStationen.add(s133);
				meineStationen.add(s134);
				meineStationen.add(s135);
				
		// Erstes Feld

				s1.addTaxiNachbar(s3);
				s1.addTaxiNachbar(s6);
				s1.addBusNachbar(s4);
				s1.addBusNachbar(s19);
				s1.addBahnNachbar(s4);
				s1.addBahnNachbar(s44);
				s1.addBahnNachbar(s54);
				
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
				s6.addTaxiNachbar(s18);
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
				s19.addTaxiNachbar(s30);
				s19.addTaxiNachbar(s31);
				s19.addBusNachbar(s1);
				s19.addBusNachbar(s44);
				s19.addBusNachbar(s29);

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

				s44.addTaxiNachbar(s29);
				s44.addTaxiNachbar(s31);
				s44.addTaxiNachbar(s32);
				s44.addTaxiNachbar(s43);
				s44.addTaxiNachbar(s45);
				s44.addTaxiNachbar(s61);
				s44.addBusNachbar(s19);
				s44.addBusNachbar(s20);
				s44.addBusNachbar(s29);
				s44.addBusNachbar(s46);
				s44.addBusNachbar(s62);
				s44.addBahnNachbar(s1);
				s44.addBahnNachbar(s53);
				s44.addBahnNachbar(s94);

				s45.addTaxiNachbar(s33);
				s45.addTaxiNachbar(s44);
				s45.addTaxiNachbar(s46);

				s46.addTaxiNachbar(s33);
				s46.addTaxiNachbar(s34);
				s46.addTaxiNachbar(s35);
				s46.addTaxiNachbar(s45);
				s46.addTaxiNachbar(s47);
				s46.addTaxiNachbar(s48);
				s46.addBusNachbar(s15);
				s46.addBusNachbar(s34);
				s46.addBusNachbar(s44);
				s46.addBusNachbar(s49);
				s46.addBusNachbar(s66);

				s48.addTaxiNachbar(s35);
				s48.addTaxiNachbar(s46);
				s48.addTaxiNachbar(s49);
				 
				s49.addTaxiNachbar(s36);
				s49.addTaxiNachbar(s48);
				s49.addTaxiNachbar(s50);
				s49.addTaxiNachbar(s66);
				s49.addBusNachbar(s23);
				s49.addBusNachbar(s46);
				s49.addBusNachbar(s52);
				s49.addBusNachbar(s66);

				s50.addTaxiNachbar(s49);
				s50.addTaxiNachbar(s51);
			        s50.addTaxiNachbar(s67);
				s50.addTaxiNachbar(s80);

				s51.addTaxiNachbar(s36);
				s51.addTaxiNachbar(s50);
				s51.addTaxiNachbar(s52);

				s52.addTaxiNachbar(s37);
				s52.addTaxiNachbar(s51);
				s52.addTaxiNachbar(s53);
				s52.addTaxiNachbar(s80);
				s52.addBusNachbar(s49);
				s52.addBusNachbar(s53);
				s52.addBusNachbar(s98);

				s53.addTaxiNachbar(s37);
				s53.addTaxiNachbar(s52);
				s53.addTaxiNachbar(s81);
				s53.addBusNachbar(s23);
				s53.addBusNachbar(s52);
				s53.addBusNachbar(s108);
				s53.addBahnNachbar(s4);
				s53.addBahnNachbar(s44);
				s53.addBahnNachbar(s108);

//		 		Zweites Feld

				s12.addTaxiNachbar(s1);
				s12.addTaxiNachbar(s11);
				s12.addTaxiNachbar(s17);

				s11.addTaxiNachbar(s12);
				s11.addTaxiNachbar(s16);
				s11.addTaxiNachbar(s26);

				s16.addTaxiNachbar(s11);
				s16.addTaxiNachbar(s24);
				s16.addTaxiNachbar(s38);
				s16.addBusNachbar(s1);
				s16.addBusNachbar(s25);
				s16.addBusNachbar(s54);
				
				s17.addTaxiNachbar(s12);
				s17.addTaxiNachbar(s18);
				s17.addTaxiNachbar(s27);

				s18.addTaxiNachbar(s6);
				s18.addTaxiNachbar(s17);
				s18.addTaxiNachbar(s30);
				
				s24.addTaxiNachbar(s16);
				s24.addTaxiNachbar(s25);
				s24.addTaxiNachbar(s40);

				s25.addTaxiNachbar(s24);
				s25.addTaxiNachbar(s26);
				s25.addTaxiNachbar(s41);
				s25.addBusNachbar(s16);
				s25.addBusNachbar(s27);	
				s25.addBusNachbar(s56);

				s26.addTaxiNachbar(s11);
				s26.addTaxiNachbar(s25);
				s26.addTaxiNachbar(s27);

				s27.addTaxiNachbar(s17);
				s27.addTaxiNachbar(s26);
				s27.addTaxiNachbar(s28);
				s27.addTaxiNachbar(s58);
				s27.addBusNachbar(s16);
				s27.addBusNachbar(s29);
				s27.addBusNachbar(s71);
			
				s28.addTaxiNachbar(s27);
				s28.addTaxiNachbar(s29);
				s28.addTaxiNachbar(s42);

				s29.addTaxiNachbar(s28);
				s29.addTaxiNachbar(s30);
				s29.addTaxiNachbar(s44);
				s29.addBusNachbar(s19);
				s29.addBusNachbar(s27);
				s29.addBusNachbar(s44);
				
				s30.addTaxiNachbar(s18);
				s30.addTaxiNachbar(s19);
				s30.addTaxiNachbar(s29);

				s38.addTaxiNachbar(s16);
				s38.addTaxiNachbar(s39);
				s38.addTaxiNachbar(s54);

				s39.addTaxiNachbar(s38);
				s39.addTaxiNachbar(s40);		
				s39.addTaxiNachbar(s55);
				
				s40.addTaxiNachbar(s24);
				s40.addTaxiNachbar(s39);		
				s40.addTaxiNachbar(s41);
				s40.addTaxiNachbar(s56);


				s41.addTaxiNachbar(s25);		
				s41.addTaxiNachbar(s40);		
				s41.addTaxiNachbar(s57);
				s41.addTaxiNachbar(s58);

				
				s42.addTaxiNachbar(s28);
				s42.addTaxiNachbar(s58);
				s42.addTaxiNachbar(s59);

				
				s43.addTaxiNachbar(s44);
				s43.addTaxiNachbar(s60);


				s54.addTaxiNachbar(s38);		
				s54.addTaxiNachbar(s55);
				s54.addTaxiNachbar(s68);
				s54.addBusNachbar(s16);		
				s54.addBusNachbar(s56);
				s54.addBusNachbar(s82);
				s54.addBahnNachbar(s88);
				s54.addBahnNachbar(s119);

				s55.addTaxiNachbar(s39);
				s55.addTaxiNachbar(s54);
				s55.addTaxiNachbar(s56);

				s56.addTaxiNachbar(s40);
				s56.addTaxiNachbar(s55);
				s56.addTaxiNachbar(s57);
				s56.addTaxiNachbar(s69);
				s56.addBusNachbar(s25);
				s56.addBusNachbar(s54);
				s56.addBusNachbar(s69);
				s56.addBusNachbar(s71);

				s57.addTaxiNachbar(s41);
				s57.addTaxiNachbar(s56);
				s57.addTaxiNachbar(s71);

				s58.addTaxiNachbar(s27);
				s58.addTaxiNachbar(s41);
				s58.addTaxiNachbar(s42);
				s58.addTaxiNachbar(s71);

				s59.addTaxiNachbar(s42);
				s59.addTaxiNachbar(s60);
				s59.addTaxiNachbar(s73);
				s59.addTaxiNachbar(s88);


				s60.addTaxiNachbar(s43);
				s60.addTaxiNachbar(s59);
				s60.addTaxiNachbar(s62);
				s60.addTaxiNachbar(s74);
				s60.addTaxiNachbar(s75);

				s61.addTaxiNachbar(s44);
				s61.addTaxiNachbar(s62);
				s61.addTaxiNachbar(s64);
				s61.addTaxiNachbar(s76);

				s62.addTaxiNachbar(s60);
				s62.addTaxiNachbar(s61);
				s62.addTaxiNachbar(s63);
				s62.addTaxiNachbar(s76);
				s62.addBusNachbar(s44);
				s62.addBusNachbar(s88);	
				s62.addBusNachbar(s94);

			
				s71.addTaxiNachbar(s57);
				s71.addTaxiNachbar(s58);
				s71.addTaxiNachbar(s70);
				s71.addTaxiNachbar(s72);
				s71.addTaxiNachbar(s88);
				s71.addBusNachbar(s27);
				s71.addBusNachbar(s56);
				s71.addBusNachbar(s88);

				s73.addTaxiNachbar(s59);
				s73.addTaxiNachbar(s74);
				s73.addTaxiNachbar(s91);

				s74.addTaxiNachbar(s60);
				s74.addTaxiNachbar(s73);
				s74.addTaxiNachbar(s92);

				s75.addTaxiNachbar(s60);
				s75.addTaxiNachbar(s76);
				s75.addTaxiNachbar(s92);

				s76.addTaxiNachbar(s62);
				s76.addTaxiNachbar(s75);
				s76.addTaxiNachbar(s77);
				s76.addTaxiNachbar(s94);



				s88.addTaxiNachbar(s59);
				s88.addTaxiNachbar(s71);
				s88.addTaxiNachbar(s87);
				s88.addTaxiNachbar(s90);
				s88.addBusNachbar(s62);
				s88.addBusNachbar(s71);
				s88.addBusNachbar(s90);
				s88.addBusNachbar(s100);
				s88.addBahnNachbar(s54);
				s88.addBahnNachbar(s94);

				s90.addTaxiNachbar(s88);
				s90.addTaxiNachbar(s89);
				s90.addTaxiNachbar(s91);
				s90.addBusNachbar(s88);
				s90.addBusNachbar(s93);
				s90.addBusNachbar(s111);

				s91.addTaxiNachbar(s73);
				s91.addTaxiNachbar(s90);
				s91.addTaxiNachbar(s92);
				s91.addTaxiNachbar(s102);	

				s92.addTaxiNachbar(s74);
				s92.addTaxiNachbar(s75);
				s92.addTaxiNachbar(s91);
				s92.addTaxiNachbar(s93);
				
				s93.addTaxiNachbar(s92);
				s93.addTaxiNachbar(s94);
				s93.addTaxiNachbar(s103);
				s93.addBusNachbar(s90);	
				s93.addBusNachbar(s94);
				s93.addBusNachbar(s103);

				s94.addTaxiNachbar(s76);
				s94.addTaxiNachbar(s93);
				s94.addTaxiNachbar(s95);
				s94.addTaxiNachbar(s104);
				s94.addBusNachbar(s62);	
				s94.addBusNachbar(s93);
				s94.addBusNachbar(s96);
				s94.addBusNachbar(s114);	
				s94.addBahnNachbar(s44);
				s94.addBahnNachbar(s88);
				s94.addBahnNachbar(s130);

		//Drittes Feld


				s47.addTaxiNachbar(s46);
				s47.addTaxiNachbar(s63);
				s47.addTaxiNachbar(s66);

				s63.addTaxiNachbar(s62);
				s63.addTaxiNachbar(s64);
				s63.addTaxiNachbar(s77);

				s64.addTaxiNachbar(s47);
				s64.addTaxiNachbar(s61);
				s64.addTaxiNachbar(s63);

				s65.addTaxiNachbar(s66);
				s65.addTaxiNachbar(s77);
				s65.addTaxiNachbar(s78);

				s66.addTaxiNachbar(s47);
				s66.addTaxiNachbar(s49);
				s66.addTaxiNachbar(s65);
				s66.addTaxiNachbar(s67);
				s66.addTaxiNachbar(s79);
				s66.addBusNachbar(s46);	
				s66.addBusNachbar(s49);	
				s66.addBusNachbar(s96);	
				s66.addBusNachbar(s98);	

				s67.addTaxiNachbar(s50);
				s67.addTaxiNachbar(s66);
				s67.addTaxiNachbar(s80);

				s77.addTaxiNachbar(s63);
				s77.addTaxiNachbar(s65);
				s77.addTaxiNachbar(s76);

				s78.addTaxiNachbar(s65);
				s78.addTaxiNachbar(s95);
				s78.addTaxiNachbar(s96);

				s79.addTaxiNachbar(s66);
				s79.addTaxiNachbar(s96);
				s79.addTaxiNachbar(s98);	

				s80.addTaxiNachbar(s50);
				s80.addTaxiNachbar(s52);
				s80.addTaxiNachbar(s67);
				s80.addTaxiNachbar(s81);
				s80.addTaxiNachbar(s98);

				s81.addTaxiNachbar(s53);
				s81.addTaxiNachbar(s80);
				s81.addTaxiNachbar(s108);

				s95.addTaxiNachbar(s78);
				s95.addTaxiNachbar(s94);
				s95.addTaxiNachbar(s96);
				s95.addTaxiNachbar(s105);
				

				s96.addTaxiNachbar(s78);
				s96.addTaxiNachbar(s79);
				s96.addTaxiNachbar(s95);
				s96.addTaxiNachbar(s97);
				s96.addTaxiNachbar(s106);
				s96.addBusNachbar(s66);
				s96.addBusNachbar(s94);
				s96.addBusNachbar(s98);
				s96.addBusNachbar(s116);

				s97.addTaxiNachbar(s96);
				s97.addTaxiNachbar(s98);
				s97.addTaxiNachbar(s107);

				s98.addTaxiNachbar(s79);
				s98.addTaxiNachbar(s80);
				s98.addTaxiNachbar(s97);
				s98.addBusNachbar(s52);
				s98.addBusNachbar(s66);
				s98.addBusNachbar(s96);

				s104.addTaxiNachbar(s94);
				s104.addTaxiNachbar(s105);
				s104.addTaxiNachbar(s114);

				s105.addTaxiNachbar(s95);
				s105.addTaxiNachbar(s104);
				s105.addTaxiNachbar(s115);


				s106.addTaxiNachbar(s96);
				s106.addTaxiNachbar(s107);
				s106.addTaxiNachbar(s116);

				s107.addTaxiNachbar(s97);
				s107.addTaxiNachbar(s106);
				s107.addTaxiNachbar(s108);

				s108.addTaxiNachbar(s81);
				s108.addTaxiNachbar(s107);
				s108.addTaxiNachbar(s118);
				s108.addTaxiNachbar(s135);
				s108.addBusNachbar(s53);
				s108.addBusNachbar(s116);
				s108.addBusNachbar(s135);
				s108.addBahnNachbar(s53);
				s108.addBahnNachbar(s130);

				

				s114.addTaxiNachbar(s103);
				s114.addTaxiNachbar(s104);
				s114.addTaxiNachbar(s125);
				s114.addTaxiNachbar(s126);
				s114.addBusNachbar(s94);
				s114.addBusNachbar(s103);
				s114.addBusNachbar(s127);
				s114.addBusNachbar(s130);

				s115.addTaxiNachbar(s105);
				s115.addTaxiNachbar(s116);
				s115.addTaxiNachbar(s126);

				s116.addTaxiNachbar(s106);
				s116.addTaxiNachbar(s115);
				s116.addTaxiNachbar(s117);
				s116.addTaxiNachbar(s127);
				s116.addBusNachbar(s96);
				s116.addBusNachbar(s108);
				s116.addBusNachbar(s127);

				s117.addTaxiNachbar(s116);
				s117.addTaxiNachbar(s118);
				s117.addTaxiNachbar(s128);

				s118.addTaxiNachbar(s108);
				s118.addTaxiNachbar(s117);
				s118.addTaxiNachbar(s129);

				s125.addTaxiNachbar(s114);
				s125.addTaxiNachbar(s113);
				s125.addTaxiNachbar(s130);

				s126.addTaxiNachbar(s114);
				s126.addTaxiNachbar(s115);
				s126.addTaxiNachbar(s127);

				s127.addTaxiNachbar(s116);
				s127.addTaxiNachbar(s126);
				s127.addTaxiNachbar(s131);
				s127.addBusNachbar(s114);
				s127.addBusNachbar(s116);
				s127.addBusNachbar(s132);

				
				s128.addTaxiNachbar(s117);
				s128.addTaxiNachbar(s131);
				s128.addTaxiNachbar(s133);

				s129.addTaxiNachbar(s118);
				s129.addTaxiNachbar(s133);
				s129.addTaxiNachbar(s135);

				s130.addTaxiNachbar(s124);
				s130.addTaxiNachbar(s125);
				s130.addTaxiNachbar(s132);		
				s130.addBusNachbar(s114);
				s130.addBusNachbar(s123);
				s130.addBusNachbar(s132);
				s130.addBahnNachbar(s94);
				s130.addBahnNachbar(s119);
				s130.addBahnNachbar(s108);

				s131.addTaxiNachbar(s127);
				s131.addTaxiNachbar(s128);
				s131.addTaxiNachbar(s132);

				s132.addTaxiNachbar(s130);
				s132.addTaxiNachbar(s131);
				s132.addTaxiNachbar(s134);
				s132.addBusNachbar(s127);
				s132.addBusNachbar(s130);
				s132.addBusNachbar(s135);

				s133.addTaxiNachbar(s128);
				s133.addTaxiNachbar(s129);
				s133.addTaxiNachbar(s134);

				s134.addTaxiNachbar(s132);
				s134.addTaxiNachbar(s133);
				s134.addTaxiNachbar(s135);

				
				s135.addTaxiNachbar(s108);
				s135.addTaxiNachbar(s129);
				s135.addTaxiNachbar(s134);
				s135.addBusNachbar(s108);
				s135.addBusNachbar(s130);



		// viertes Feld

				s68.addTaxiNachbar(s54);
				s68.addTaxiNachbar(s69);
				s68.addTaxiNachbar(s82);

				s69.addTaxiNachbar(s56);
				s69.addTaxiNachbar(s68);
				s69.addTaxiNachbar(s70);
				s69.addTaxiNachbar(s73);

				s70.addTaxiNachbar(s69);
				s70.addTaxiNachbar(s71);
				s70.addTaxiNachbar(s84);
				s70.addTaxiNachbar(s85);

				s72.addTaxiNachbar(s71);
				s72.addTaxiNachbar(s86);
				s72.addTaxiNachbar(s87);

				s82.addTaxiNachbar(s68);
				s82.addTaxiNachbar(s83);
				s82.addTaxiNachbar(s99);
				s82.addBusNachbar(s54);
				s82.addBusNachbar(s119);

				s83.addTaxiNachbar(s69);
				s83.addTaxiNachbar(s82);
				s83.addTaxiNachbar(s84);

				s84.addTaxiNachbar(s70);
				s84.addTaxiNachbar(s83);
				s84.addTaxiNachbar(s99);
				s84.addTaxiNachbar(s100);


				s85.addTaxiNachbar(s70);
				s85.addTaxiNachbar(s86);
				s85.addTaxiNachbar(s100);
				s85.addTaxiNachbar(s101);

				s86.addTaxiNachbar(s72);
				s86.addTaxiNachbar(s85);
				s86.addTaxiNachbar(s87);
				

				s87.addTaxiNachbar(s72);
				s87.addTaxiNachbar(s86);
				s87.addTaxiNachbar(s88);
				s87.addTaxiNachbar(s89);

				s89.addTaxiNachbar(s87);
				s89.addTaxiNachbar(s90);
				s89.addTaxiNachbar(s101);
				s89.addTaxiNachbar(s111);

				s99.addTaxiNachbar(s82);
				s99.addTaxiNachbar(s84);
				s99.addTaxiNachbar(s119);


				s100.addTaxiNachbar(s84);
				s100.addTaxiNachbar(s85);
				s100.addTaxiNachbar(s109);
				s100.addTaxiNachbar(s119);
				s100.addBusNachbar(s69);
				s100.addBusNachbar(s88);
				s100.addBusNachbar(s119);

				s101.addTaxiNachbar(s85);
				s101.addTaxiNachbar(s86);
				s101.addTaxiNachbar(s89);
				s101.addTaxiNachbar(s110);


				s102.addTaxiNachbar(s91);
				s102.addTaxiNachbar(s103);
				s102.addTaxiNachbar(s112);

				


				s103.addTaxiNachbar(s93);
				s103.addTaxiNachbar(s102);
				s103.addTaxiNachbar(s113);
				s103.addTaxiNachbar(s114);
				s103.addBusNachbar(s93);
				s103.addBusNachbar(s114);
				s103.addBusNachbar(s119);
				s103.addBusNachbar(s123);

				s109.addTaxiNachbar(s100);
				s109.addTaxiNachbar(s110);
				s109.addTaxiNachbar(s119);


				s110.addTaxiNachbar(s101);
				s110.addTaxiNachbar(s109);
				s110.addTaxiNachbar(s111);
				s110.addTaxiNachbar(s120);
				s110.addTaxiNachbar(s121);

				s111.addTaxiNachbar(s89);
				s111.addTaxiNachbar(s110);
				s111.addTaxiNachbar(s112);
				s111.addTaxiNachbar(s121);

				s112.addTaxiNachbar(s102);
				s112.addTaxiNachbar(s111);
				s112.addTaxiNachbar(s113);

				s113.addTaxiNachbar(s103);
				s113.addTaxiNachbar(s123);
				s113.addTaxiNachbar(s124);
				s113.addTaxiNachbar(s125);
				

				s119.addTaxiNachbar(s99);
				s119.addTaxiNachbar(s100);
				s119.addTaxiNachbar(s109);
				s119.addTaxiNachbar(s120);
				s119.addBusNachbar(s82);
				s119.addBusNachbar(s100);
				s119.addBusNachbar(s111);
				s119.addBusNachbar(s123);
				s119.addBahnNachbar(s54);
				s119.addBahnNachbar(s130);

				
				s120.addTaxiNachbar(s110);
				s120.addTaxiNachbar(s119);
				s120.addTaxiNachbar(s122);

				s121.addTaxiNachbar(s110);
				s121.addTaxiNachbar(s111);
				s121.addTaxiNachbar(s122);
				
				s123.addTaxiNachbar(s112);
				s123.addTaxiNachbar(s113);
				s123.addTaxiNachbar(s122);
				s123.addTaxiNachbar(s124);
				s123.addBusNachbar(s103);
				s123.addBusNachbar(s119);
				s123.addBusNachbar(s130);

				s124.addTaxiNachbar(s113);
				s124.addTaxiNachbar(s123);
				s124.addTaxiNachbar(s130);

		
		
	}
	

	public Station getStationByIndex(int index){
		Station strasse = meineStationen.get(index);
		return strasse;
	}
}